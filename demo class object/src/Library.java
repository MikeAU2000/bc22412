import java.lang.reflect.Array;
import java.util.Arrays;

public class Library{
  //A library has many books
  //A book has Attribute, title and author
  //The library has function;
    // 1) add a book, return vold.
    // 2) removeByTitle, return Book.
    // 3) searchByTitle, return Book[]

    public static Book[] books= new Book[0];

    private Librarian librarian= new Librarian();
    

    public Library(Librarian librarian){
      this.librarian= librarian;
    }


    public static void main(String[] args) {
      Book b1= new Book("history", "Mike");
      Book b2= new Book("game", "Joe");
      Book b3= new Book("music", "gg");
      Librarian librarian1=new Librarian("Jack");
      Library l1= new Library(librarian1);
      l1.librarian.addBooks(Library.books,b1);
      l1.librarian.addBooks(Library.books,b2);
      l1.librarian.addBooks(Library.books,b3);

      for (Book b: Library.books) {
        System.out.println(b.getTitle()+" "+b.getAuthor());
      }

      // l1.librarian.removeBook(Library.books, "game");

      // for (Book b: Library.books) {
      //   System.out.println(b.getTitle()+" "+b.getAuthor());
      // }

      for (Book book : l1.librarian.searchByTitle(Library.books, "s")) {
        System.out.println(book.getTitle());
      }
    }

}
