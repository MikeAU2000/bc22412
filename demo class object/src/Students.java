import java.math.BigDecimal;
import java.math.RoundingMode;

public class Students {
  private double weight;
  private double height;

  public Students(double weight, double height) {
    this.weight = weight;
    this.height = height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double bmi() {
    return BigDecimal.valueOf(this.weight)//
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,RoundingMode.HALF_UP)//
        //.setScale(2, RoundingMode.HALF_DOWN)
        .doubleValue();
  }

  public String bmiIndex(){
    double bmiValue= this.bmi();
  }



  public static void main(String[] args) {
    Students s1 = new Students(67, 1.80);
    System.out.println(s1.calculateBMI());

  }
}
