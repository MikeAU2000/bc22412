public class Cat extends Animal{
  private int age;

  public Cat(){}

  public Cat(String name,int age) {
    super(name);
    this.age= age;
  }


  public void walk(){
    System.out.println("Cat is walking...");
  }

  public static void main(String[] args) {
    Cat cat =new Cat("ABC",4);
    cat.walk();
    System.out.println(cat.getName());
    cat.setName("Mike");
    System.out.println(cat.getName());
  }
}
