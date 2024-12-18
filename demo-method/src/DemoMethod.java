import java.math.BigDecimal;

public class DemoMethod {

  public static int sum(int x, int y) {
    int result = x + y;
    return result;
  }

  // same method name +smae Parameter list //Not allowed
  // public static int sum(int a, int b){}

  public static int substract(int x, int y) {
    int result = x - y;
    return result;
  }

  public static int multiply(int x, int y) {
    int result = x * y;
    return result;
  }

  public static BigDecimal sum(double x, double y) {
    BigDecimal bd1 = BigDecimal.valueOf(x).add(BigDecimal.valueOf(y));
    return bd1;
  }

  public static int countCharacter(String source, char target){
    int count= 0;
    for(int i=0;i<source.length();i++){
      if(source.charAt(i)==target){
        count++;
      }
    }
    return count;


  }

  public static void main(String[] args) {
    int x=3;
    int a=10;
    int b= 11;
    int y= a+b;
    System.out.println(y);
    
    a = 19;
    b = 21;
    y= a+b;
    System.out.println(y);

    y=sum(a, b);
    System.out.println(y);

    double x1= 1;
    double y1= 2;

    System.out.println(sum(x1,y1));

    String source= "hello";
    char target= 'h';
    System.out.println(countCharacter("", target));

    //need revision
    System.out.println(countEven(new long[]{100l,200l}));


    
  }
    public static int countEven(long[] arr){

      int count= 0;
      for (int i= 0; i<arr.length;i++){
        if(arr[i] %2==0)
        count++;
      }
            return count;
          
      
  }
}
