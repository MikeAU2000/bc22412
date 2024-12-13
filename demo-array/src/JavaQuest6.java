

public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int lastLastNum = 0, lastNum = 1, num= 0;
    // for loop to print first 15 numbers in Fibonacci Sequence
  //   int count=3;
  //   int num= 1;
  //   int lastNum=1;
  //   int lastLastNum=1 ;
  //   System.out.print(first+" ");
  //   System.out.print(num+" ");

  //   while(count<15){
  //     lastLastNum= lastNum;
  //     lastNum= num;
  //     num+= lastLastNum;
  //     System.out.print(num+" ");
  //     count++;
  // }

  System.out.print(lastLastNum+" ");
  for(int i= 0;i<14;i++){
    lastLastNum= lastNum;
      lastNum= num;
      num+= lastLastNum;
      System.out.print(num+" ");
  }
}
}