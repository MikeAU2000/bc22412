import java.util.ArrayList;

public class DemoArrayList {
  public static void main(String[] args) {
    ArrayList<String> strings= new ArrayList<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings.size());
    System.out.println(strings.get(1));

    ArrayList<Book> books= new ArrayList<>();
    books.add(new Book("ABC"));
    books.add(new Book("DEF"));
    books.remove(0);
    System.out.println(books.size());
    books.add(new Book("XYZ"));
    System.out.println(books.remove(new Book("DEF")));
    System.out.println(books.size());

    System.out.println(books.isEmpty());
    String bookName= "Not Found.";
    for(Book book:books){
      if(book.getName().contains("BC")){
        bookName= book.getName();
        break;
      }
    }
    System.out.println("Book"+bookName+"is available.");
  }
}
