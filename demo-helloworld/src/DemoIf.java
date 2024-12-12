public class DemoIf {
  public static void main(String []args){
    // if ->check event ->event result
    int x = 3 ;
    if(x>2) {
      System.out.println("x is > 2.");
  }
    String s = "hello";
    if (s.length()>3){
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

    if(x>5) {
      System.out.println("x>5.");

    }else{
      System.out.println("x<=5.");
    }

    int y =10;
    if (y%2 == 0){
      System.out.println(y +" is an even number");
    }else {      System.out.println(y +" is an sigle number");


    }

    int z =11;
    if (z%2 != 0){
      System.out.println(z +" is an sigle number");
    }

    // check if y=3 and y is even number;

    if(y>3&& y %2==0){
      System.out.println(y+" is an even number, and bigger than 3");
    }

    int age = 10;
    boolean isAduit= false;
    if(!isAduit){
      System.out.println(
        "true"
      );
    }

    int score = 85;
    //score >= 90, grade A
    // ! score between 85 and 89, grade B+
    // score between 80 and 89, grade B
    // score between 70and 79, grade c
    // below 70

    char grade= ' ';
    char gender3= 'F';
    char gender4= 'M';  
    
    if (score >= 90){
      grade = 'A';
    }else if (score >=85 && gender3=='F'){
      grade = 'T';
    }else if (score >=87 && gender3=='M'){
      grade = 'T';}
    else if (score >= 80 && score <=86 && gender3=='M') {
      grade = 'B';
    }else if (score >= 80 && score <=84 && gender3=='F') {
      grade = 'B';
    }
    else if (score >=70) {
      grade = 'C';
    }else {
      grade = 'F';
    }
    System.out.println(grade);

    // 1.M 90-> A
    // 2.F 90-> A
    // 3.M 86-> B
    //....

  }
}
