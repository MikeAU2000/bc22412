import java.util.Arrays;

public class Deck {
  private Card [] cards;

  public Deck(){
    this.cards= new Card[Card.SUITES.length*Card.RANKS.length];
    int index= 0;
      for(char rank:Card.RANKS){
        for(char suite:Card.SUITES){
          this.cards[index]=new Card(rank, suite);
          index++;
        }
      }
    

  }

  public static void main(String[] args) {
    Deck deck=new Deck();
    //System.out.println(Arrays.toString(deck.cards));
    for (Card c : deck.cards) {
      System.out.println(c.getRank()+" "+c.getSuite());
    }
  }
}
