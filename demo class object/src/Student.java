import java.util.Arrays;

public class Student {
  private int score;
  private String name;
  //private int candies=0;
  private Candy[] candies=new Candy[0];

  public Student(){

  }


  public Student(int score, String name){
    this.score=score;
    this.name=name;
  }

  public int getScore(){
    return this.score;
  }

  public String getName(){
    return this.name;
  }

  public Candy[] getCandies(){
    return this.candies;
  }



  public Candy getCandy(int score){
    Candy candy=new Candy();
    if(score>=80){
      candy= new Candy("red");
    }else if(score>=60 && score <= 79){
      candy= new Candy("Blue");
    }else {
      candy= new Candy("Yellow");
    }
    return candy;
  }

  public Candy[] addCandy(Candy[] candies, Candy candy){
    Candy[] newcandies= new Candy[candies.length+1];
    for(int i=0;i<candies.length;i++){
      newcandies[i]=candies[i];
    }
    newcandies[newcandies.length-1]=candy;
    this.candies=newcandies;
    return newcandies;
  }

  public static void main(String[] args) {
    int remainCandies=20;
    Student s1=new Student(67, "Student 1");
    Student s2=new Student(89, "Student 2");
    Student s3=new Student(50, "Student 3");
    Student s4=new Student(99, "Student 4");
    Student s5=new Student(60, "Student 5");
    Student s6=new Student(59, "Student 6");

    Student []students= new Student[]{s1,s2,s3,s4,s5,s6};
    
    while(remainCandies>0){
      for (Student student : students) {
        if(remainCandies==0){
          break;
        }
        Candy candy=student.getCandy(student.getScore());
        student.addCandy(student.candies, candy);
        remainCandies--;
      }
    }

    for (Student student : students) {
      
      for (Candy candy : student.candies) {
        System.out.print(candy.getColor());
        
      }
      System.out.println();
    }
  }


}
