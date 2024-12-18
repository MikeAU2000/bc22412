/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    System.out.println(str.charAt(str.indexOf('J')));
    // prints e (the 1st e)
    System.out.println(str.charAt(str.lastIndexOf('e')));
    // code here ...
    System.out.println(str.indexOf('t'));
    // Use indexOf()
    // prints 3
    System.out.println(str.indexOf('x'));
    // prints 9
    System.out.println(str.indexOf('L'));
    // prints 10
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());
    // prints "ab c"

    // Use String replace() method
    System.out.println(str.replace("Java","Coding" ));
    // prints VenturenixLAB, Coding
    // code here ...

    // int length()
    System.out.println(str.length());
    // prints 19
    // code here ...

    // Use String substring(int start, int end)
    System.out.println(str.substring(5, 8));
    // prints "ren"
    // code here ...

    System.out.println(str.toUpperCase());
    // print "VENTURENIXLAB, JAVA"

    System.out.println(str.toLowerCase());
    // prints "venturenixlab, java"
    // code here ...

    System.out.println(str.replace('e', '*').toUpperCase().concat("!!!"));
    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...

  }
}