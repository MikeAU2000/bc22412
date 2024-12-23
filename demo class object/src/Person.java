import java.util.Arrays;

public class Person { //blueprint
  //attribute
  private String name;
  private int age;
  private String email;

  // constructor
  public Person(String name, int age, String email){
    this.name= name;
    this.age= age;
    this.email= email;
  }

  //getting (instance Method)
  public String getName(){
    return this.name;
  }
  
  public int getAge(){
    return this.age;
  }

  public String getEmail(){
    return this.email;
  }
  public static void main(String[] args) {

    Person p1= new Person("Vincent", 18,"vin.email");
    Person p2= new Person("lucas", 17,"lucas.gmail");

    System.out.println(p2.getName());
    System.out.println(p2.getAge()); 
    System.out.println(p2.getEmail());

    Person[] personArr= new Person[]{p1,p2,new Person("Mike",18,"mike.email")};
    for(Person p:personArr){
      System.out.println(p.getName()+" "+p.getAge()+" "+p.getEmail());
    }

    p2=p1;
    for(Person p:personArr){
      System.out.println(p.getName()+" "+p.getAge()+" "+p.getEmail());
    }
    
    Person[] personArr1= new Person[] {p1,p2};
    for(Person p:personArr1){
      System.out.println(p.getName()+" "+p.getAge()+" "+p.getEmail());

    }

  }
}
