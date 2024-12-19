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
    int ge= 123;
    System.out.println("Hello".equals(s));

    System.out.println("hello".charAt(2));
    System.out.println("hello".length());
    

    // isEmpty ()
    String s5= "abc".c;
    boolean isEmtry =s5.isEmpty();
    System.out.println(isEmtry);
    System.out.println(s5.isEmpty());
    
    //subString
    System.out.println(s5.substring(0,2));

    System.out.println(s.contains("e"));

    System.out.println(s.concat("!!"));
    System.out.println(s.startsWith("ha"));
    System.out.println(s.endsWith("a"));
    System.out.println(s.toUpperCase());

  

  

    System.out.println(s.equalsIgnoreCase("Hello"));

    System.out.println(s.indexOf("He"));
    System.out.println(s.indexOf('h'));
    System.out.println(s.lastIndexOf('l'));
    System.out.println("Hellollo".lastIndexOf("ll"));
    System.out.println("".isEmpty());

    System.out.println(s.isBlank());
    System.out.println(" hel lo ".trim());
    System.out.println("abc".compareTo("sbr"));

    System.out.println("hello".concat("ijk").toUpperCase());

    System.out.println(s.replace("l", "s"));
  }
}
