import java.lang.reflect.Array;
import java.util.Arrays;


public class Library{
  //A library has many books
  //A book has Attribute, title and author
  //The library has function;
    // 1) add a book, return vold.
    // 2) removeByTitle, return Book.
    // 3) searchByTitle, return Book[]

    private Book[] books= new Book[0];




    public Book[] getBooks() {
      return books;
    }




    private Librarian librarian= new Librarian();
    

    public Library(){

    }

    public Library(Book[] books){
      this.books= books;
    }

    public void setBooks(Book[] books) {
      this.books = books;
    }

    public void setLibrarian(Librarian librarian) {
      this.librarian = librarian;
    }

    


    public static void main(String[] args) {
      Book b1= new Book("history", "Mike");
      Book b2= new Book("game", "Joe");
      Book b3= new Book("music", "gg");
      Library l1= new Library();
      Librarian librarian1=new Librarian("Jack",l1);
      l1.setLibrarian(librarian1);
      l1.librarian.addBooks(b1);
      l1.librarian.addBooks(b2);
      l1.librarian.addBooks(b3);

      // for (Book b: l1.books) {
      //   System.out.println(b.getTitle()+" "+b.getAuthor());
      // }

      l1.librarian.removeBook( "game");

      for (Book b: l1.books) {
        System.out.println(b.getTitle()+" "+b.getAuthor());
      }

      l1.librarian.searchByTitle("s");

      for (Book b: l1.librarian.searchByTitle( "s")
      ) {
        System.out.println(b.getTitle()+" "+b.getAuthor());
      }
    }

}
