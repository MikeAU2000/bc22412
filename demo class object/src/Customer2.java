public class Customer2 {
    private long id;
    private Order[] orders;

    public Customer2(){

    }

    public Customer2(long id){
      this.id= id;
      this.orders= new Order[0];
    }

    public void placeorder(Order order){
      Order[] newOrders= new Order[this.orders.length+1];
      for(int i=0;i<this.orders.length;i++){
        newOrders[i]= this.orders[i];
      }
      newOrders[newOrders.length-1]=order;
      this.orders= newOrders;
    }

  public static void main(String[] args) {
    Customer c1= new Customer(783388);
    c1.placeOrder(new Order());
    c1.placeOrder(new Order());
  }
}
