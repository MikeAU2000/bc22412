public class DemoWrapperClass {
  public static void main(String[] args) {
    int x = 3;
    Integer x2 = x;
    System.out.println(x2);
    System.out.println(x2.doubleValue());

    String s = "hello";
    System.out.println(s.length());

    // big letter is a class, have method;
    // method is presentation;

    double d = 3.3;
    Double d2 = d;
    System.out.println(d2);
    System.out.println(d2.intValue());

    float f = d2.floatValue();
    System.out.println(f);

    double d3 = d2;
    double d4 = d2.doubleValue();

    // char -> Character
    // boolean -> Boolean
    // byte -> Byte
    // short -> Short
    // long -> Long
    // float -> Float

    
  }
}
