import java.math.BigDecimal;

public class Customer {
  private long id;
  private Order[] orders;
  private boolean isVIP;

  // 1.Normally Customer can be created without order.


  public Customer(){

  }

  public Customer(long id, Order[]orders){
    this.id= id;
    this.orders= orders;
  } 

  public Customer(long id){
    this.id=id;
    this.orders= new Order[0];
    }

  public void orderInfor(){
    for(Order order:orders ){
      System.out.println(" Id "+order.getId());
      Item[] Items= order.getItems();
      for (Item item : Items) {
        System.out.println("Name "+item.getName()+" Price "+item.getPrice()+" Quantity "+item.getQuantity());
      }
    }
  }

  public double getOrderPrice(int id){
    double price=0.0;
    for (Order order : orders) {
      if(order.getId()==id){
        price=order.totallPrice();
        break;
      }
      else{System.out.println("no such id");}
    }
    return price;
  }

  public double getTotalOrderPrice(){
    double totallPrice=0.0;
    for (Order order : orders) {
      totallPrice= BigDecimal.valueOf(order.totallPrice()).add(BigDecimal.valueOf(totallPrice)).doubleValue();
    }
    return totallPrice;
  }

  public int totalOrderAmount(int id){
    int amount= 0;
    for (Order order : orders) {
      if(order.getId()==id){
        amount=order.totallAmount();
        break;
      }
      else{System.out.println("no such id");}
    }
    return amount;
  }

  public boolean isVip(){
    if(this.getTotalOrderPrice()>500){
      isVIP= true;
    }
    return this.isVIP;
  }

  //order id -> item[]
  //totallyOrderAmount by order id
  //isYip() -> 100_000(total amount of all orders)
  
  //2. Customer can place order after become creating the customer account.

  public void placeOrder(Order order){
    Order[] newOrders= new Order[this.orders.length+1];
    for(int i=0;i<this.orders.length;i++){
      newOrders[i]= this.orders[i];
    }
    newOrders[newOrders.length-1]= order;
    this.orders= newOrders;
  }


  public static void main(String[] args) {

    Item apple= new Item("apple", 25.5,1);
    Item banana= new Item("banana", 30.2,1);
    Item orange= new Item("orange", 40.1,1);
    Item rice= new Item("rice", 10.9,1);
    Item clothers= new Item("clothers", 500,1);
    Item meat= new Item("meat", 30,1);

    //Order[] order12= new Order[0];

    Order order1= new Order(12, new Item[]{apple,banana,meat});
    Order order2= new Order(13, new Item[]{orange,rice});
    Order order3= new Order(14, new Item[]{apple,clothers});
    
    //order12[0]= new order1;
    // orders[1]= new Order();
    // orders[2]= new Order();
    Customer c1= new Customer(11);
    c1.placeOrder(order1);
    c1.placeOrder(order2);
    c1.placeOrder(order3);

    c1.orderInfor();
    System.out.println(c1.getOrderPrice(12));
    System.out.println(c1.totalOrderAmount(12));
    System.out.println(c1.getTotalOrderPrice());
    System.out.println(c1.isVip());
  }
    

}
