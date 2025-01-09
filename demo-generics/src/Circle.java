import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape{
  private int radius;

  //public Circle(){}

  public Circle( int radius) {
    this.radius = radius;
  }

  public int getRadius() {
    return this.radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  @Override
  public double area(){
    return BigDecimal.valueOf(Math.pow(radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI)).setScale(2,RoundingMode.HALF_UP)
    .doubleValue();
  }

  @Override
  public boolean equals(Object obj){
    if(this==obj)
    return true;
    if(!(obj instanceof Circle))
    return false;
    Circle circle=(Circle)obj;
    return Objects.equals(circle.getColor(),super.getColor())
    && Objects.equals(circle.getRadius(), this.getRadius());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.radius,super.getColor());
  }

  @Override
  public String toString(){
    return "Circle["
    +"color "+super.getColor()
    +" ,radius  "+this.getRadius()+
    "]"
    ;

  }

  public static void main(String[] args) {
    Circle circle= new Circle("Red",30);
    System.out.println(circle.area());
    //Traggle traggle=new Traggle("REd", 10, 20);
    //System.out.println(traggle.area());
    Circle c1= new Circle(Color.BLUE, 30);
    System.out.println(circle.equals(c1));
    System.out.println(circle.hashCode());
    System.out.println(c1.hashCode());
    System.out.println(c1.toString());
  }
}
