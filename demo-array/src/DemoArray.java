import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    int x1 = 3;
    int x2 = 10;
    int x3 = 11;


    // declare array
    int[] arr = new int[3];
    // assign value to array
    arr[0] = 3;
    arr[1] = 10;
    arr[2] = 11;
    // for loop -> read array values
    // print out all the value that large than 10
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 10) {
        System.out.println(arr[i]);
      }
    }

    // declare double array, length= 5
    // 10.4, 4.3, 3.3, 1.9, 9,9
    // Sum up all values in the double array
    double[] douArr = new double[5];
    douArr[0] = 10.4;
    douArr[1] = 4.3;
    douArr[2] = 3.3;
    douArr[3] = 1.9;
    douArr[4] = 9.9;

    double sum = 0;
    for (int i = 0; i < douArr.length; i++) {
      sum += douArr[i];
    }
    System.out.println(sum);

    boolean found = false;
    String target = "abc";
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";

    for (int i = 0; i < arr3.length; i++) {
      if (target.equals(arr3[i])) {
        found = true;
      }
    }
    System.out.println(found);

    char[] arr4 = new char[] {'b', 'c', 'a'};
    // conventt teh char value to int value, and then assign them to a new int array
    // 98, 99,97

    int[] arr5 = new int[arr4.length];

    for (int i = 0; i < arr4.length; i++) {
      arr5[i] = arr4[i];
      System.out.print(arr5[i] + " ");
    }


    System.out.println();

    // Find the mix ascil value in the int array


    int maxValue = Integer.MIN_VALUE;
    for (int i = 0; i < arr5.length; i++) {
      if (arr5[i] > maxValue) {
        maxValue = arr5[i];
      }
    }
    System.out.println("The max number is " + maxValue);


    int[] arr7 = new int[] {9, 8, 99, 98};
    int minValue = arr7[0];
    // int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr7.length; i++) {
      if (arr7[i] < minValue) {
        minValue = arr7[i];
      }
    }
    System.out.println("The min number is " + minValue);


    int[] arr6 = new int[] {9, 8, 99, 98};
    int arr6Sum = 0;
    for (int i = 0; i < arr6.length; i++) {
      arr6Sum += arr6[i];
    }

    System.out.println(arr6Sum);

    // swap
    int left = 7;
    int right = 9;
    int swap = left;
    left = right;
    right = swap;
    System.out.println(left);
    System.out.println(right);

    int[] arr8 = new int[] {9, -8, 109, 99, 98};
    System.out.println(arr8);

    int[] arr9 = new int[] {9, -8, 109, 99, 98};
    for (int i = 0; i < arr9.length - 1; i++) {
      if (arr9[i] > arr9[i + 1]) {
        int temp = arr9[i];
        arr9[i] = arr9[i + 1];
        arr9[i + 1] = temp;
      }
      System.out.println(Arrays.toString(arr9));



    }

    Integer[] arr2 = new Integer[] {0, 6, 4};
    // Products for all numbers;
    int products = 0;
    for (int i = 0; i < arr2.length; i++) {
      products *= arr2[i];
    }
    System.out.println(products);


    double[] price = new double[] {8.2, 6.5, 10.5};
    int[] guantities = new int[] {9, 8, 3};
    BigDecimal d = BigDecimal.valueOf(0.0);
    for (int i = 0; i < price.length; i++) {
      Integer a = guantities[i];
      double b = a.doubleValue();
      d = d.add(BigDecimal.valueOf(price[i]).multiply(BigDecimal.valueOf(b)));
    }
    System.out.println(d);


    String s = String.valueOf(123);
    System.out.println(s);
    s = String.valueOf(true);
    System.out.println(s);

    System.out.println(String.valueOf("A"));

    Integer i1 = Integer.valueOf("123");
    System.out.println(i1);

    char[] chArr = "hello".toCharArray();

    System.out.println(chArr);
    for (int i = 0; i < chArr.length / 2; i++) {
      char temp = chArr[i];
      chArr[i] = chArr[chArr.length - i - 1];
      chArr[chArr.length - i - 1] = temp;
    }

    System.out.println(chArr);

    String result = "";
    for (int i = 0; i < chArr.length; i++) {
      result += chArr[i];
    }

    System.out.println(result);

    chArr = "hello".toCharArray();

    int[] intArr = new int[chArr.length];
    for (int i = 0; i < chArr.length; i++) {
      chArr[i] = ((char) (chArr[i] + 1));
      intArr[i] = chArr[i];


    }
    System.out.println(String.valueOf(chArr));

    // char[] arr12= new char[] {'p','a','p','b','a','p'};


    // char maxNumChar= arr12[0];
    // int count= 1;
    // int charCount= 1;


    // for(int i = 0; i<arr12.length-1; i++){
    // charCount=1;
    // for(int j= i+1; j<arr12.length; j++){
    // if(arr12[i]==arr12[j]){
    // charCount++;
    // }
    // }
    // if(charCount>count){
    // count=charCount;
    // maxNumChar= arr12[i];
    // }

    // }
    // System.out.println(maxNumChar);
    // System.out.println(count);



    char[] arr12 = new char[] {'p', 'a', 'p', 'b', 'a', 'p'};
    char maxNumChar = ' ';

    int[] counters = new int[26];
    for (int i = 0; i < arr12.length; i++) {
      counters[arr12[i] - 'a']++;

    }
    int max2 = Integer.MIN_VALUE;
    for (int i = 0; i < counters.length; i++) {
      // max2= Math.max(counters[i], max2);
      if (counters[i] > max2) {
        maxNumChar = (char) (i + 97);
        max2 = counters[i];
      }
    }

    System.out.println(maxNumChar);

    String str = "hello";
    int toToDiff = 0;

    char[] chArr1 = str.toCharArray();
    for (int i = 0; i < chArr1.length - 1; i++) {
      int score = chArr1[i];
      int score1 = chArr1[i + 1];
      int diff = Math.abs(score1 - score);
      toToDiff += diff;
    }

    System.out.println(toToDiff);


    String allowed = "cad";
    String[] words = {"a","b","c","ab","ac","bc","abc"};


    int count = 0;
    boolean foundFalse = false;
    for (int i = 0; i < words.length; i++) {
      char[] str2 = words[i].toCharArray();
      for (int j = 0; j < words[i].toCharArray().length; j++) {
        char[] str3 = allowed.toCharArray();
        for (int k = 0; k < str3.length; k++) {
          if (str2[j] != str3[k]) {
            foundFalse = false;
          } else {
            foundFalse = true;
          }
        }
        if (foundFalse == false) {
          break;
        } else {
          count++;
        }
      }
    }
    System.out.println(count);


  }
}
