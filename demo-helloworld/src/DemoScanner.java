import java.util.Scanner;

public class DemoScanner {
  public static void main(String []args){
    String s ="abc";
    Scanner scanner =new Scanner(System.in);
    System.out.println("Please input a number");
    int dayNum = scanner.nextInt();

    int num=0;
    System.out.println("The double time of num is"+num);

    num= scanner.nextInt();

    System.out.println("Please input a String:");
    String str = scanner.nextLine();
    System.out.println("str"+ str);

    for(int i= 0; i<num ; i++){
      System.out.println("Hello");
    }

    //num ->numbers of days
    //for loop
    int totalMinutes=  0;
    for(int i= 0; i<dayNum; i++){
      totalMinutes+= 24*60;
    }
    System.out.println(totalMinutes);


  }
}
