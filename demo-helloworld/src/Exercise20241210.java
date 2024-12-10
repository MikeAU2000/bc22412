public class Exercise20241210{
  public static void main(String []args) {
    double priceForApple = 7.3;
    double pricefForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    double totalPrice= priceForApple * quantityOfApple + pricefForOrange * quantityOfOrange;
    System.out.println(totalPrice);

    // second exercise

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    int averageScore = (mathScore +englishScore+ historyScore) / 3;
    System.out.println(averageScore); 

    //byle, short, int, long
    byte b = 127;
    byte b2 = -128;
    short s = -32768;
    short s2 = 32767;
    b= (byte)(b+1);
    System.out.println(b);
    //b = b+1; cant assgin int value to byle varible?(downcasting)

    // !Java (1) Compile time +(2) Run time
    // (1)java file(.java) ->class file(.class): java code ->byte code (-machine)
    //
  }
}
