public class Pig extends Animal{
  public Pig(){}

  public Pig(String name){
    super(name);
  }

  public void sleep(){
    System.out.println("Pig is sleeping");
  }

  public static void main(String[] args) {
    Pig pig= new Pig("Jak");
    Pig pig2= new Pig();
    pig2.sleep();
  }
}
