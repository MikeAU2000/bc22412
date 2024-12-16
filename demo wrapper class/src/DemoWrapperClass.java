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
    char c1= 'a';
    Character c2=c1;
    System.out.println(    c2.compareTo('a')    );

    Character c3='c';
    System.out.println(c3.compareTo('a'));

    int asciiOfA= 'A';
    int asciiOfa= 'a';
    System.out.println(asciiOfA-asciiOfa);
    // boolean -> Boolean
    boolean b1= false;
    Boolean b2= b1;
    boolean b3= b2;
    System.out.println(b2);
    System.out.println(b3);
    
    

    // byte -> Byte
    // short -> Short
    // long -> Long
    // float -> Float






  }
}
