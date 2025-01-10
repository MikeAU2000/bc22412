import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

  public static class Book{
    private int id;
    private String name;

    public Book(){

    }

    public Book(int id, String name){
      this.id=id;
      this.name=name;
    }

    public int getId() {
      return this.id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }

    // @Override
    // public boolean equals(Object obj){
    //   if(this==obj)
    //   return true;
    //   if(!(obj instanceof Book))
    //   return false;
    //   Book book= (Book)obj;
    //   return Objects.equals(this.getName(),book.getName())&&
    //   Objects.equals(this.getId(),book.getId());
    // }

    @Override
    public int hashCode(){
      return Objects.hash(this.getId(),this.getName());
    }
  }
  public static void main(String[] args) {
    HashMap<String, Integer> fruitMap= new HashMap<>();
    fruitMap.put("Apple",1);
    fruitMap.put("Apple",3);
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());
    fruitMap.put("APPLE", 3);
    System.out.println(fruitMap);

    for(Map.Entry<String, Integer>entry:fruitMap.entrySet()){
      System.out.println(entry.getKey()+" "+entry.getValue());
    }

    System.out.println(fruitMap.get("Apple"));
    System.out.println(fruitMap.containsKey("APPLE"));
    

    for (Map.Entry<String,Integer>entry : fruitMap.entrySet()) {
      if (entry.getKey()=="Apple") {
        int num= entry.getValue()+1;
        fruitMap.put("Apple", num);
      }
    }

    for (String key : fruitMap.keySet()) {
      System.out.println(key);
    }

    System.out.println(fruitMap.containsValue(1000));

    System.out.println(fruitMap.getOrDefault("Apple", 1));

    HashMap<Integer,Book> bookMap= new HashMap<>();
    Book book1= new Book(1,"ABC");
    Book book2= new Book(2,"IJK");
    Book book3= new Book(3,"DEF");
    bookMap.put(book1.getId(),book1);
    bookMap.put(book2.getId(),book2);
    bookMap.put(book3.getId(),book3);

    System.out.println(bookMap.size());
    Book book4= new Book(3, "DEF");

    HashMap<Book,Integer> booMap2= new HashMap<>();
    booMap2.put(book1, book1.getId());
    booMap2.put(book2, book2.getId());
    booMap2.put(book3, book3.getId());
    //booMap2.put(book3, book3.getId());
    booMap2.put(book4, book4.getId());

    System.out.println(booMap2.size());






  }
}
