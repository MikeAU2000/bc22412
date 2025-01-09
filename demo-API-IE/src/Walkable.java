public interface Walkable {
  //1 No instance varible
  //2 All methods are abstract
  //3 Implicitly public 
  //4 Implicitly public 
  //5 Support "static final" varible, Implicitly
  //6 After Java 8.
  //7 After Java 8, we have default and static method
  int x=3;
  void walk();

  default void walkFaster(){
    System.out.println("A way to walk faster...");
  }

  static int calculateDistance(){
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(Walkable.x);
    System.out.println(Walkable.calculateDistance());
  }


}
