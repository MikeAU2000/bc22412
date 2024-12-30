public class Student2 {
  private String name;
  private int score;
  private int candyAmount=0;


  public Student2(){

  }

  public Student2(String name,int score){
    this.name=name;
    this.score=score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public int getCandyAmount() {
    return candyAmount;
  }

  public void addCandyAmount(int num) {
    this.candyAmount+= num;
  }


  public static void main(String[] args) {
    Student2 s1= new Student2("student1", 67);
    Student2 s2= new Student2("student2", 89);
    Student2 s3= new Student2("student3", 50);
    Student2 s4= new Student2("student4", 99);
    Student2 s5= new Student2("student5", 60);
    Student2 s6= new Student2("student6", 59);
    Student2[] stuArr= new Student2[]{s1,s2,s3,s4,s5,s6};
    int candyNum=20;
    boolean remainCandies=true;
    while(remainCandies){
      for (Student2 student2 : stuArr) {
        if(student2.getScore()>=80 && candyNum>1){
          student2.addCandyAmount(2);
          candyNum-=2;
        }else if(student2.getScore()>=60 && student2.getScore()<80){
          student2.addCandyAmount(1);
          candyNum-=1;
        }else{
          continue;
        }
        if(candyNum<=0){
          remainCandies=false;
          break;
        }
      }
    }
    for (Student2 student2 : stuArr) {
      System.out.println(student2.getName()+" "+student2.getCandyAmount());
    }
  }
}
