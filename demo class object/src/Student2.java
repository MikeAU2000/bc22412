public class Student2 {
  private String name;
  private int score;
  private Candy2[] Candies = new Candy2[0];


  public void setCandies(Candy2[] candies) {
    Candies = candies;
  }

  public Student2() {

  }

  public Student2(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return score;
  }

  public Candy2[] getCandies() {
    return Candies;
  }

  public Candy2 getTheCandy2(int score) {
    Candy2 candy2 = new Candy2();
    if (score >= 80) {
      candy2 = new Candy2("red");
    } else if (score >= 60) {
      candy2 = new Candy2("blue");
    } else {
      candy2 = new Candy2("yellow");
    }
    return candy2;
  }

  public Candy2[] addCandy2(Candy2[] candy2s, Candy2 candy2) {
    Candy2[] newCandy2Arr = new Candy2[candy2s.length + 1];
    for (int i = 0; i < candy2s.length; i++) {
      newCandy2Arr[i] = candy2s[i];
    }
    newCandy2Arr[candy2s.length] = candy2;

    return newCandy2Arr;
  }


 
  
}
