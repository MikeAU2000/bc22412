import java.util.Objects;

public class Pig extends Animal{
  private int age;
  public Pig(){}

  public Pig(String name,int age){
    super(name);
    this.age=age;
  }

  public void sleep(){
    System.out.println("Pig is sleeping");
  }

  public int getAge(){
    return this.age;
  }

  @Override
  public boolean equals(Object obj){
    if(this==obj)
    return true;
    if(!(obj instanceof Pig))
    return false;
    Pig pig=(Pig) obj;
    return Objects.equals(pig.getAge(),this.age)
    && Objects.equals(pig.getName(), super.getName());

  }

  @Override
  public int hashCode(){
    return Objects.hash(this.age,super.getName());
  }

  @Override
  public String toString(){
    return "Pig["
      +"age"+this.age
      +",name"+super.getName()
      +"]";
  }

  public void eat(){
    System.out.println("pig is eating");
  }

  public static void main(String[] args) {
    Pig pig= new Pig("Jak",2);
    Pig pig2= new Pig();
    pig2.sleep();
    Pig pig3=new Pig("ABC", 3);
    Pig pig4=new Pig("ABC", 3);
    System.out.println(pig3.equals(pig4));
    System.out.println(pig3.hashCode());
    System.out.println(pig4.hashCode());
    


  }
}
