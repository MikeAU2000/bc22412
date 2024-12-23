public class MyFriends {
  private String name;
  private int age;
  private char gender;
  private boolean havePet;

  public int getNameLength (){
    return this.name.length();
  }

  public String getName (){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public boolean isMale(){
    return this.gender=='M'?true: false;
  }

  public boolean getHavePet(){
    return this.havePet;
  }

  public void setName(String name){
    this.name= name;
  }

  public void setAge(int age){
    this.age=age;
  }

  public void setGender(char gender){
    this.gender=gender;
  }

  public void setHavePet(boolean havePet){
    this.havePet=havePet;
  }

  public MyFriends(String name, int age, char gender, boolean havePet){
    this.name= name;
    this.age= age;
    this.gender= gender;
    this.havePet= havePet;
  }
  public static void main(String[] args) {
    MyFriends mf1= new MyFriends("kitty", 24, 'f', true);
    MyFriends mf2= new MyFriends("Cargo", 22, 'm', true);
    MyFriends mf3= new MyFriends("Ada", 23, 'f', false);
    MyFriends mf4= new MyFriends("Hin", 22, 'm', false);

    System.out.println(mf1.getName()+" "+mf1.getAge()+" "+mf1.isMale()+" "+mf1.getHavePet());
  }
}
