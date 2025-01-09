public class Animal implements Eatable{
  private String name;

  public Animal(){}

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name){
    this.name= name;
  }

  @Override
  public void eat(){
    System.out.println("Animal is eating ...");

  }
  public static void main(String[] args) {
    Cat cat1= new Cat();
    Dog dog1= new Dog();
    Pig pig1= new Pig();
  
    Animal[] animals= new Animal[]{cat1,dog1,pig1};
    for (Animal animal : animals) {
      animal.eat();
    }
  }


}
