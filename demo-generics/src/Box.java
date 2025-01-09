public class Box <T extends Shape>{
  private T[] shapes;

  public Box() {
    this.shapes= 
  }

  public double totalArea(){
    return this.shapes[0].area();
  }
}
