public class Student {
  private int score;
  private String name;
  private int candies=0;

  public Student(){

  }


  public Student(int score, String name){
    this.score=score;
    this.name=name;
    this.candies=0;
  }

  public int getScore(){
    return this.score;
  }

  public String getName(){
    return this.name;
  }

  public int getCandies(){
    return this.candies;
  }

  public void addCandies(int addNumber){
    this.candies+=addNumber;
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
        if(student.getScore()>=80 && remainCandies>=2){
          student.addCandies(2);
          remainCandies -= 2;
        }else if(student.getScore()>=60 && student.getScore() <=79){
          student.addCandies(1);
          remainCandies -= 1;
        }else {
          continue;
        }
        if(remainCandies<0){
          break;
      }
      }
    }
    for (Student student : students) {
      System.out.println(student.getName()+" "+student.getCandies());
    }
  }


}
