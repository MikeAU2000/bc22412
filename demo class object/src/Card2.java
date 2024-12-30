public class Card2 {
  private char rank;
  private char suite;


  public final static char[]RANKS= new char[]{'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
  public final static char[]SUITES= new char[]{'D','C','H','S'};

  public Card2(){

  }

  public Card2(char rank,char suite){
    this.rank=rank;
    this.suite=suite;
  }

  public char getRank() {
    return this.rank;
  }

  public char getSuite() {
    return this.suite;
  }
}
