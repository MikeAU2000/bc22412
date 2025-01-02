public class Teacher {
  private Candy2[] candies;
  private Student2[] student2s;



  public Candy2[] getCandies() {
    return candies;
  }

  public void setCandies(Candy2[] candies) {
    this.candies = candies;
  }

  public Teacher() {}

  public Teacher(Candy2[] candies, Student2[] student2s) {
    this.candies = candies;
    this.student2s = student2s;
  }

  public boolean candyDeduce(Candy2 candy2) {
    for (int i = 0; i < this.candies.length; i++) {
      int deleIndex = 0;


      if (this.candies[i].getColor().equals(candy2.getColor())) {
        deleIndex = i;
        Candy2[] newCandy2s = new Candy2[this.candies.length - 1];
        for (int j = 0; j < deleIndex; j++) {
          newCandy2s[j] = this.candies[j];
        }
        for (int j = deleIndex; j < newCandy2s.length; j++) {
          newCandy2s[j] = this.candies[j + 1];
        }
        this.candies = newCandy2s;
        return true;

      }
    }
    return false;
  }

  public void distribute() {
    Candy2 candy2 = new Candy2();
    while (this.candies.length > 0) {
      for (Student2 student2 : this.student2s) {
        if (student2.getScore() >= 80) {
          candy2 = new Candy2("red");
        } else if (student2.getScore() >= 60) {
          candy2 = new Candy2("blue");
        } else {
          candy2 = new Candy2("yellow");
        }

        if (this.candyDeduce(candy2)) {
          student2
              .setCandies(student2.addCandy2(student2.getCandies(), candy2));
        }

        if (this.candies.length == 0) {
          break;
        }

      }
    }
  }

  public static void main(String[] args) {
    Candy2[] candy2s = new Candy2[31];
    Student2 s1 = new Student2("student1", 67);
    Student2 s2 = new Student2("student2", 89);
    Student2 s3 = new Student2("student3", 50);
    Student2 s4 = new Student2("student4", 99);
    Student2 s5 = new Student2("student5", 60);
    Student2 s6 = new Student2("student6", 59);
    Student2[] stuArr = new Student2[] {s1, s2, s3, s4, s5, s6};
    int i = 0;
    while (i < 31) {
      for (String color : Candy2.colorArr) {
        if (i > 30) {
          break;
        }
        candy2s[i] = new Candy2(color);
        i++;
      }
    }
    Teacher teacher1 = new Teacher(candy2s, stuArr);
    // for (Candy2 candy2 : candy2s) {
    // System.out.println(candy2.getColor());
    // }

    teacher1.distribute();

    for (Student2 student2 : teacher1.student2s) {
      System.out.println(student2.getName());
      for (Candy2 candy2 : student2.getCandies()) {
        System.out.print(candy2.getColor());
      }
      System.out.println();
    }

  }
}
