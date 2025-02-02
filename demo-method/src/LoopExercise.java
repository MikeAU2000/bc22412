import java.lang.reflect.Array;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("Hello");
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    int nums = 0;
    for (int i = 0; i < 5; i++) {
      System.out.println(nums);
      nums++;
    }

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    int nums1 = 1;
    for (int i = 0; i < 20; i++) {
      if (nums1 % 2 == 0) {
        System.out.println(nums1);
      }
      nums1++;
    }

    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    int nums2 = 1;
    for (int i = 0; i < 20; i++) {
      if (nums2 % 3 == 0 || nums2 % 5 == 0) {
        System.out.println(nums2);
      }
      nums2++;
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int nums3 = 0;
    for (int i = 0; i < 16; i++) {
      nums3 += i;
    }
    System.out.println(nums3);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    System.out.println(evenSum);
    System.out.println(oddSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if (str7.contains("d")) {
      System.out.println("d is found.");
    } else {
      System.out.println("d is not found.");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    if (s8a.contains(s8b)) {
      System.out.println("s8b is a substring.");
    } else {
      System.out.println("s8b is not a substring.");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (c9 == s9.charAt(i)) {
        count++;
      }
    }
    System.out.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace("x", "k");
    }
    System.out.println(Arrays.toString(arr10));



    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int count1 = 0;
    for (int i = 0; i < s11.length(); i++) {
      char a = s11.charAt(i);
      int e = a;
      if (a > 64 && a < 91) {
        count1++;
      }
    }
    System.out.println(count1);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++) {
      System.out.println("*****");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int score = 0;
    for (int i = 0; i < s13.length(); i++) {
      if (s13.charAt(i) == 'l') {
        score += 1;
      } else if (s13.charAt(i) == 'r') {
        score += 3;
      } else if (s13.charAt(i) == 'd') {
        score += 2;
      } else if (s13.charAt(i) == 'u') {
        score += 4;
      } else {
        score--;
      }
    }
    System.out.println(score);

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    int[] arr15 = new int[] {1, 4, 9, -4};
    for (int i = 0; i < arr14.length; i++) {
      arr14[i] = arr15[i];
    }
    System.out.println(Arrays.toString(arr14));

    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long max = Integer.MIN_VALUE;
    long min = Integer.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > max) {
        max = Math.abs(arr14[i]);
      }
    }

    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] < min) {
        min = arr14[i];
      }
    }
    System.out.println(max);
    System.out.println(min);

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] floarr = new float[3];
    floarr[0] = 0.2f;
    floarr[1] = 0.3f;
    floarr[2] = 0.5f;

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    for (int i = 0; i < floarr.length; i++) {
      floarr[i] += 0.1f;
    }
    System.out.println(Arrays.toString(floarr));

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int count3 = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        count3 += 1;
      }
    }
    System.out.println(count3);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    int [] s19array = new int[s19.length()];
    int maxValue19= Integer.MIN_VALUE;
    int maxIndex= 0;
    int minValue19= Integer.MAX_VALUE;
    int minIndex= 0;
    String s19New = "";
    for(int i=0; i<s19array.length; i++){
      s19array[i]=s19.charAt(i)-'0';
      }
    for(int i=0; i<s19array.length; i++){
      if(s19array[i]>maxValue19){
        maxValue19= s19array[i];
        maxIndex= i;
      }
    }
    for(int i=0; i<s19array.length; i++){
      if(s19array[i]<minValue19){
        minValue19= s19array[i];
        minIndex= i;
      }
    }

    int temp= maxValue19;
    s19array[maxIndex]= minValue19;
    s19array[minIndex]= temp;

    System.out.println(Arrays.toString(s19array));

    for(int i=0; i<s19array.length; i++){
      s19New+=s19array[i];
    }

    System.out.println(s19New);



    


    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =new String[] {"python", "array", "programming", "java", "bootcamp"};

    String longString= "";
    int maxLength= 0;
    for (int i = 0; i < arr20.length; i++) {
      if(arr20[i].length()>maxLength){
        maxLength=arr20[i].length();
        longString= arr20[i];
      }
    }
    System.out.println(longString);
  }
}
