public class Dog extends Animal{
  
  public Dog(){}

  public Dog(String name){
    super(name);
  }

  public void walk(){
    System.out.println("Dog is walking...");
  }

  public void eat(){
    System.out.println("dog is eating");
  }

  public static void main(String[] args) {
    Dog dog=new Dog("Tim");
    Dog dog2=new Dog();
    dog.walk();
    dog2.walk();
  }

}
