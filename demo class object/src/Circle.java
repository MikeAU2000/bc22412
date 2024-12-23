import java.math.BigDecimal;

public class Circle {
  private double radius;
  private String color;

  //Constructor
  //getter
  //setter

  public Circle(double radius, String color){
    this.radius= radius;
    this.color= color;
    }

  public void setRadius(double radius){
    this.radius= radius;
  }

  public void setColor(String color){
    this.color= color;
  }

  public double getRadius(){
    return radius;
  }

  public String getColor(){
    return color;
  }
  
  public static double calculateArea(double radius){
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }
  public static void main(String[] args) {
    Circle c1= new Circle(3.0, "red");
    System.out.println(Circle.calculateArea(3.0));
  }
}
