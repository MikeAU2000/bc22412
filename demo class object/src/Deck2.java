public class Deck2 {
  private Card2[] card2s= new Card2[0];

  public Deck2(){
    int index=0;
    this.card2s=new Card2 [Card2.RANKS.length*Card2.SUITES.length];
    for (char rank: Card2.RANKS) {
      for (char suite: Card2.SUITES) {
        card2s[index++]=new Card2(rank, suite);
      }
    }
  }

  public static void main(String[] args) {
    Deck2 deck2= new Deck2();
    for (Card2 card: deck2.card2s) {
      System.out.println(card.getRank()+" "+card.getSuite());
    }
  }
}
