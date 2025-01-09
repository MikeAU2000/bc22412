public class Traggle extends Shape{
  private int bottom;
  private int height;
  
  public Traggle() {

  }
  public Traggle(String color, int bottom, int height) {
    super(color);
    this.bottom = bottom;
    this.height = height;
  }

  public int getBottom() {
    return this.bottom;
  }
  public void setBottom(int bottom) {
    this.bottom = bottom;
  }
  public int getHeight() {
    return this.height;
  }
  public void setHeight(int height) {
    this.height = height;
  }

  public double area(){
    return Double.valueOf(this.bottom*this.height/2);
  }

  public static void main(String[] args) {

  }

}
