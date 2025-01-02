public class DemoString {
  public static void main(String[] args){
    String s="hello".t;
    
    String s3=s;

    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s));
    System.out.println(System.identityHashCode("hello"));
  }
}
