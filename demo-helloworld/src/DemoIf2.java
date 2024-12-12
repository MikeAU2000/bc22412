public class DemoIf2 {
  public static void main(String []args){
    int x = 3;
    if(x>2){
      System.out.println("x is > 2.");
    }
    String s = "hello";
    if (s.length()>3) {
      System.out.println("s is longer than three char.");
    }

    String e = "hello";
    if (e.charAt(3)=='l'){
      System.out.println("the forth letter is l");
    }

    String c = "hello";
    if (e.equals(c)){
      System.out.println("c is equals to e");
    }

    if (x>5) {
      System.out.println("x>5.");
    }else{
      System.out.println("x<=5.");
    }

    int y = 10;
    if (y%2 ==0){
      System.out.println(y +"is an even number");
    }else {
      System.out.println(y +"is an signle number");
    }

    int z = 11;
    if (z%2 !=0){
      System.out.println(z + "is an sigle number");
    }

    if (y>3&& y %2 == 0){
      System.out.println(y+ "is an even number, and bigger than 3");
    }

    int age = 10;
    boolean isAduit= false;
    if(!isAduit){
      System.out.println("true");
    }

    int score = 86;
    char grade;
    char gender3='M';

    //if gender is a mela
    //score >= 90, grade A
    // score between 87 and 89, grade T
    // score between 82 and 86, grade B
    // score between 73 and 82, grade c
    // below 73, grade f

    //if gender is a female
    // score >= 90, grade A
    // score between 85 and 89, grade T
    // score between 80 and 84, grade B
    // score between 70 and 79, grade C
    // below 70, grade f

    if(gender3=='M'){
      if(score>=90){
        grade= 'A';
      }else if(score>=87){
        grade= 'T';
      }else if(score>=82){
        grade= 'B';
      }else if(score>=73){
        grade= 'C';
      }else{grade= 'F';}
    }else{
      if(score>=90){
        grade= 'A';
      }else if(score>=85){
        grade= 'T';
      }else if(score>=80){
        grade= 'B';
      }else if(score>=70){
        grade= 'C';
      }else{grade= 'F';}
    }
    System.out.println(grade);
    }
}
