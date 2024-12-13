public class DemoDateType{
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

    float x5= (float)(3.0/2);
    System.out.println("x5="+x5);

    int f = 0/10;
    System.out.println(f);

    int value = 1000000;
    int value2 = 1_000_000;

    byte b1= -128;
    byte b2= 127;

    //short s1 = -32768 to 32767
    short s1 = 32767;

    //!long 
    // !Declare a hardcode long value, you should always add"L"
    long l1 = 2_147_483_648L;

    //float, fouble
    double d1= 10.2;// 10.2 is double value
    double d2= 10.2d;// 10.2d double value
    float f1 = 10.2f;
    float f2= 10.22222222222222222222222222f;
    double d4= 10.2f;
    double d5= f2 +10.2d;
    // float + double -> double 
    System.out.println(d5);
    double d6 = 0.2 +0.1;
    System.out.println(d6);

    char c ='x';
    char c2 = '1';
    char c3 = '!';
    int age= 66;

    boolean b= true;
    boolean b10= false;
    boolean isElderly = age >65;
    System.out.println(isElderly); 

    int age2= 18;
    isElderly = age2 >65;
    System.out.println(isElderly); 

    char q ='你'; 
    char z ='A';
    char t ='0';
    int u =q; 
    int r =z;
    int p =t;
    System.out.println(u);
    System.out.println(r);
    System.out.println(p);




    char q2= 97;
    System.out.println(q2);
    //char q3= 70000;

  }
}