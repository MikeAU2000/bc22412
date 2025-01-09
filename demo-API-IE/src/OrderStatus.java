public enum OrderStatus {
  PAID(1),READY_FOR_SHIP(2),DELIVERING(3),DELIVERED(4);

  private int value;

  private OrderStatus(int value){
    this.value=value;
  }

  public int getValue(){
    return this.value;
  }

  public OrderStatus next(){
    for (OrderStatus orderStatus :values()) {
      if(orderStatus.value==this.value+1)
        return orderStatus;
    }
    return null;
  }
}
