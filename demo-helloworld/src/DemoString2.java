public class DemoString2 {
  public static void main(String [] args){
    char x = 'a';
    x ='a';

    String password = "abcd1234";
    String emailAddress= "abc@gmail.com";
    password += ("!");
    System.out.println("hello world");
    System.out.println(password);

    char result = password.charAt(8);
    System.out.println(result);

    String password2= "helloworld";
    char lastChar= password2.charAt(password2.length()-1);
    System.out.println("last char = "+lastChar);

    String s1 = "abc";
    String s2 = "abc";

    boolean result2= s1.equals(s2);
    System.out.println(result2);

    String s3 = "dce";
    boolean result3= s2.equals(s3);
    System.out.println(result3);

    int len = password.length();
    System.out.println(len);

    String target= "";
    System.out.println(target.length());

    String emptryString = "";
    boolean emptryOrNot = emptryString.length()==0;
    System.out.println(emptryOrNot);
    boolean isStringEmptry= "".equals(emptryString);
    System.out.println(isStringEmptry);

    String s= "Hello";
    System.out.println(String.valueOf(len));
    System.out.println("Hello".equals(s));

    System.out.println("hello".charAt(2));

    System.out.println("hello".length());
            

        
  }
}
