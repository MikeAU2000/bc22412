public class LittlePig extends Pig{
  public LittlePig(String name,int age){
    super(name, age);
  }

  public void fly(){

  }

  @Override
  public void eat(){
    System.out.println("Little pig like to eat.");
  }

  public static void main(String[] args) {
    Pig pig= new Pig("Little pig", 2);
    pig.eat();
  }
}
