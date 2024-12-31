public class DemoString {
  public static void main(String[] args){
    String s="hello";
    String s2="hello";
    String s3=s;

    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode("hello"));
  }
}
