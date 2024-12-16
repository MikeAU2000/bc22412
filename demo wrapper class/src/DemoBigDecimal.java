import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double result= 0.2+0.1;
    System.out.println(result);
    if(result ==0.3){
      System.out.println("REsult is 0.3");
    } else{
      System.out.println("Result is Not 0.3");
    }
    // Solution
    BigDecimal bd1=BigDecimal.valueOf(0.2);
    BigDecimal bd2=BigDecimal.valueOf(0.1);
    BigDecimal bd3= bd1.add(bd2);
    System.out.println(bd3);
    System.out.println(0.3-0.1);
    BigDecimal bd4=BigDecimal.valueOf(0.3);
    BigDecimal bd5=BigDecimal.valueOf(0.1);
    System.out.println(bd4.subtract(bd5));

    System.out.println(0.1*0.2);
    BigDecimal bd6= BigDecimal.valueOf(0.1);
    BigDecimal bd7= BigDecimal.valueOf(0.2);
    System.out.println(bd6.multiply(bd7));

    System.out.println(0.3/0.1);
    BigDecimal bd8= BigDecimal.valueOf(0.3);
    BigDecimal bd9= BigDecimal.valueOf(0.1);
    System.out.println(bd8.divide(bd9));

    BigDecimal bd13= BigDecimal.valueOf(10);
    BigDecimal bd14= BigDecimal.valueOf(3);
    BigDecimal bd15= bd13.divide(bd14,BigDecimal.ROUND_DOWN);
    System.out.println(bd15.doubleValue());

    BigDecimal bd16= BigDecimal.valueOf(4.565).setScale(2,RoundingMode.HALF_UP);
    System.out.println(bd16.doubleValue());

    double length= 4.2;
    double squareArea= length*length;
    System.out.println(squareArea);
    BigDecimal bd18= BigDecimal.valueOf(length);
    System.out.println(bd18.multiply(bd18));

    //Math
    double pi= 3.14159;
    double radius= 4.5;
    double circleArea= BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius)).multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
    System.out.println(circleArea);

    circleArea = BigDecimal.valueOf(Math.pow(radius, 2.0))
      .multiply(BigDecimal.valueOf(Math.PI))
      .doubleValue();
    System.out.println(circleArea);

    int x = 8;
    int y = 9;
    int max= Integer.MIN_VALUE;
    max = Math.max(x, max);
    max = Math.max(y, max);

    int[] arr = new int[] {10,9,3};
    max = Integer.MIN_VALUE;
    for(int i =0;i<arr.length;i++){
      max= Math.max(arr[i],max);
      
    }
    System.out.println(max);
    System.out.println(Math.sqrt(9));
    System.out.println(Math.sqrt(10));
    System.out.println(Math.sqrt(-10));

    double u=3.456;
    System.out.println(Math.round(u));
    System.out.println(Math.round(u));

    double u2= 3.556;
    System.out.println(Math.round(u2));

    System.out.println(Math.round(u*100.0)/100.0);

    System.out.println(Math.abs(-9L));

    

    }
}
