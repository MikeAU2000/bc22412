import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static void main(String[] args) {
    int j = 0;
    while (j < 3) {
      System.out.println(j);
      j++;
      j++;
      j++;
    }

    String s = "hello";
    char target = 'o';
    boolean unfound = true;
    int k = 0;
    int index = 0;
    while (unfound) {
      if (s.charAt(k) == target) {
        index = k;
        unfound = false;
      }
      k++;
    }
    System.out.println(index);

    int number = new Random().nextInt(3);
    System.out.println(number);

    int number1 = new Random().nextInt(49) + 1;
    System.out.println(number1);

    int marksixArr[] = new int[6];
    int count = 0;
    int value = 0;
    while (count < 6) {
      value = new Random().nextInt(49) + 1;
      if (!isDuplicated(marksixArr, value)) {
        marksixArr[count] = value;
        count++;
      }
    }
    System.out.println(Arrays.toString(marksixArr));


    int ranNum = new Random().nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    boolean unfou = true;
    int theMax = 100;
    int theMin = 0;

    while (unfou) {
      System.out.println("input num");
      int myNum = scanner.nextInt();
      if (myNum == ranNum) {
        unfou = false;
        System.out.println("correct");
      } else if (myNum > ranNum) {
        theMax= myNum;
        System.out.println("too big, should between "+theMin+" to "+theMax);
      } else if (myNum < ranNum) {
        theMin= myNum;
        System.out.println("too small, should between "+theMin+" to "+theMax);
      }
    }

    scanner.close();
    
  }

  public static boolean isDuplicated(int[] arr, int newValue) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == newValue) {
        return true;
      }


    }
    return false;
  }
}
