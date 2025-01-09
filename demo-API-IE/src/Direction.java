public enum Direction {
  EAST(90,1),SOUTH(180,2),NORTH(360,-2),WEST(270,-1);

  private int angle;
  private int value;

  private Direction(int angle, int value){
    this.angle= angle;
    this.value= value;
  }

  public int getDirection(){
    return this.angle;
  }

  public Direction oppsite(){
    for (Direction d : values()) {
      if(d.value==this.value*-1)
        return d;
    }
    return null;

  }

  public static void main(String[] args) {
    NORTH.oppsite();
  }
}
