public class Helloworld{
  public static void main(String[] args) {
    // Comment Welcome to bootcamp!
    // ! 1. Data Type (Primitive)
    // int > Integer
    int x = 3;
    int dayOfWeek = 7;
    double y2 = 3.2;
    x = 101; //re-assign 101 to x
    x = x + 10; 
    x = x - 40;
    x = x * 3;
    // all the int / 0 is undefine
    x = x / 213;

    System.out.println(x);
    x = x+ 8*2/4 +1;
    System.out.println(x);

    x = (x+2) + 2 /(3+1);
    System.out.println(x);

    // int x = 3/2;
    // int x = 3.0/2;


    // step 1; 3> int value, 2> int value
    // step 2; int value /int value >int value
    // step 3; 3/2 > 1
    // step 4; assign 1 (int value) to double type variable (convent 1 to 1.0)
    // !Not allow assign a higher value to a lower type value

    int x2 = 3/2;
    System.out.println(x2);
    
    double x3= 3/2;
    System.out.println(x3);

    double x4= 3.0/2;
    System.out.println(x4);

    int f = 0/10;
    System.out.println(f);
  }
}