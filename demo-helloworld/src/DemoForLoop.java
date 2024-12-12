public class DemoForLoop {
  public static void main(String[] args) {
    //For loop
    //For( ; ; ){
    // }
    for (int i = 0; i<3; i++){
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
    
    for (int i= 0; i<5; i++){
      System.out.println("Hello");
    }

    for (int i= 0; i<10; i++){
      if((i%2) ==0){
        System.out.println(i);
      }
    }

    for (int i= 0; i<101; i++){
      if(i%3==0 && i%4==0){
        System.out.println(i);
      }
    }

    int sum= 0;
    for (int i=0; i<21; i++){
      sum+=i;
    }
    System.out.println(sum);
  }
}
