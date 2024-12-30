public class Card {
  private char rank; //'A','2','T','K'
  private char suite; //'D','C','H','S'
  public final static char[] RANKS=new char[]{'1','2','3','4','5','6','7','8','9','t','j','q','k'};
  public final static char[] SUITES=new char[]{'D','C','H','S'};


  public Card(){

  }

  public Card(char rank, char suite){
    this.rank= rank;
    this.suite= suite;
  }

  public char getRank(){
    return this.rank;
  }

  public char getSuite(){
    return this.suite;
  }
}
