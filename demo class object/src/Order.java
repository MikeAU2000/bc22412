import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items;

  public Order(){

  }

  public Order(long id, Item[] item){
    this.id= id;
    this.items= item;
  }

  public long getId(){
    return this.id;
  }

  public void setId(long id){
    this.id= id;
  }

  public Item[] getItems(){
    return this.items;
  }

  public void setItems(Item[] items){
    this.items= items;
  }

  public double totallPrice(){
    double totalPrice=0.0;
    for (Item item : items) {
      totalPrice= BigDecimal.valueOf(totalPrice).add(BigDecimal.valueOf(item.getPrice()).multiply(BigDecimal.valueOf(item.getQuantity()))).doubleValue();
    }
    return totalPrice;
  }

  public int totallAmount(){
    int amount=0;
    for (Item item : items) {
      amount+= item.getQuantity();
    }
    return amount;
  }

  public void placeItem(Item item){
    Item[] newItems= new Item[this.items.length+1];
    for(int i=0;i<this.items.length;i++){
      newItems[i]= this.items[i];
    }
    newItems[newItems.length-1]= item;
    this.items= newItems;
  }
}
