public class DemoString{
  public static void main(String []args ){
    char x = 'a';
    //x = 1; //!???
    //x = 1.1;
    //x = true;
    x = 'a';
    //char x = '0';

    String  password = "abcd1234";
    String emailAddress = "abc@gmail.com";
    password = password +("!");
    System.out.println("hello world");
    System.out.println(password);

    char result = password.charAt(8);
    // ! index starts from 0 to length-1
    System.out.println(result);
    //System.out.println(password.charAt(-1));
    //System.out.println(password.charAt(9));

    String password2= "helloworld";
    char lastChar= password2.charAt(password2.length()-1);
    System.out.println("last char = "+lastChar);
    
    //equal()
    String s1 = "abc";
    String s2 = "abc";
    boolean result2= s1.equals(s2);
    System.out.println(result2);

    String s3 = "dce";
    boolean result3= s2.equals(s3);
    System.out.println(result3);

    //length()
    int len = password.length();
    System.out.println(len);

    

    String target= "";
    System.out.println(target.length());

    String emptryString = "";
    boolean emptryOrNOt = emptryString.length()==0;
    System.out.println(emptryOrNOt);
    boolean isStringEmptry= "".equals(emptryString);
    System.out.println(isStringEmptry);

    String s = "Hello";
    System.out.println("Hello".equals(s));

    System.out.println("hello".charAt(2));
    System.out.println("hello".length());

    // isEmpty ()
    String s5= "abc";
    boolean isEmtry =s5.isEmpty();
    System.out.println(isEmtry);
    System.out.println(s5.isEmpty());
    
    //subString
    System.out.println(s5.substring(0,2));
  }
}
