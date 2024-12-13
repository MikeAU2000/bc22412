public class DemoForLoop {
  public static void main(String[] args) {
    // For loop
    // For( ; ; ){
    // }
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }
    // Step 1: int i = 0;
    // Step 2: i < 3? (question) -> true
    // Step 3: if true, enter into code block
    // Step 4: i++, i become 1
    // Step 5: i < 3? (question) -> true
    // Step 6: if true, enter into code block
    // Step 7: i++, i become 2
    // Step 8: i < 3? (question) -> true
    // Step 9: if true, enter into code block
    // Step 10: i++, i become 3
    // Step 11: i < 3(question) ->false
    // Step 12: exit for loop

    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
    }

    for (int i = 0; i < 10; i++) {
      if ((i % 2) == 0) {
        System.out.println(i);
      }
    }

    for (int i = 0; i < 101; i++) {
      if (i % 3 == 0 && i % 4 == 0) {
        System.out.println(i);
      }
    }

    int sum = 0;
    for (int i = 0; i < 21; i++) {
      sum += i;
    }
    System.out.println(sum);

    // sum up 0 -10 all the odd number
    int sum1 = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) {
        sum1 += i;
      }
    }
    System.out.println(sum1);

    String str = "abcdefijk";
    boolean found = false;

    // 1. Check if 'd' exits in the string.

    for (int i = 0; i < str.length(); i++) {
      if ('d' == str.charAt(i)) {
        // System.out.println("k is in the "+(i+1)+" char");
        found = true;
        break;
      }
    }
    System.out.println("found it " + found);

    // 2.chaeck if the string value contains given sub-string

    // String substr = "llo";
    // String str2 = "hello";

    // for(int i= 0; i<str2.length(); i++){
    // if(substr.equals(str2.substring(i, i+substr.length()))){
    // System.out.println("true");
    // break;
    // }
    // }

    String substr = "lo";
    String str2 = "hello";
    boolean found1 = false;
    for (int i = 0; i < str2.length() - substr.length(); i++) {
      if (substr.equals(str2.substring(i, i + substr.length()))) {
        found1 = true;
        break;
      } else {
        found1 = false;
      }
    }
    System.out.println("can" + found1);


    int oddSum = 0;
    int evenSum = 0;

    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0)
        oddSum += i;
      else
        evenSum += i;
    }
    // if(evenSum>oddSum){
    // System.out.println(evenSum-oddSum);
    // }else{System.out.println(oddSum-evenSum);
    int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    System.out.println(diff);
    // }

    String string = "Hello";
    String subString3 = "g";
    boolean found2 = false;
    int index = 0;


    for (int i = 0; i < string.length() - subString3.length() + 1; i++) {
      if (subString3.equals(string.substring(i, i + subString3.length()))) {
        found2 = true;
        index = i;
        break;
      } else {
        found2 = false;
      }
    }
    System.out.println(found2
        ? "found the substring, it is "
            + string.substring(index, index + subString3.length())
        : "cant found it");

    // Counting
    String s = "hello";
    char letter = ' ';
    // count the number of 'l'
    // for + if

    int wordCount = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == letter) {
        wordCount += 1;
      }
    }
    System.out.println(wordCount);

    // continue - skip the rest, go to next iteration

    wordCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != 'l') {
        continue;
      }
      wordCount++;
    }
    System.out.println(wordCount);

    int column = 5;
    for (int i = 0; i < column + 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print('*');
      }
      System.out.println();
    }

    // 1-190, print all numbers, which can be divided by 3 and 4;
    // continue;

    for (int i = 0; i < 100 + 1; i++) {
      if (i % 3 != 0 || i % 4 != 0) {
        continue;
      } else {
        System.out.print(i + " ");
      }
    }

    for (int i = 0; i <= 100; i++) {
      if (i % 3 == 0 && i % 4 != 0 || i % 4 == 0 && i % 3 != 0
          || i % 3 != 0 && i % 4 != 0) {
        continue;
      } else {
        System.out.print(i + " ");
      }
    }

    System.out.println();
    int count=3;
    int num= 1;
    int lastNum=1;
    int lastLastNum=1 ;
    System.out.print(num+" ");
    System.out.print(num+" ");

    while(count<21){
      lastLastNum= lastNum;
      lastNum= num;
      num+= lastLastNum;
      System.out.print(num+" ");
      count++;


    
    }
  }
}
