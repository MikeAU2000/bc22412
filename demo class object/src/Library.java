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
    

    public Library(){
      this.books= new Book[0];
    }

    public void add(Book b){
      Book []newBook= new Book[this.books.length+1];
      for(int i=0; i<this.books.length; i++){
        newBook[i]=books[i];
      }

      newBook[newBook.length-1]=b;
      this.books=newBook;
    }

    public Book removeBook(String name){
      Book []newBook= new Book[this.books.length-1];
      int removeIndex= 0;
      Book removeBook=null;
      for (int i=0; i<this.books.length;i++) {
        if(this.books[i].getTitle().equals(name)){
          removeIndex= i;
          removeBook=this.books[i];
        }
      }
      for(int i=0; i<removeIndex; i++){
        newBook[i]= this.books[i];
      }

      for(int i=removeIndex; i<newBook.length;i++){
        newBook[i]=this.books[i+1];
      }

      this.books=newBook;

      return removeBook;
    }

    public Book[] searchByTitle(String name){
      Book[] searchBook=new Book[0];
      int mark=0;
      for (Book book : this.books) {
        if(book.getTitle().contains(name)){
          mark++;
        }
      }
      searchBook= new Book[mark];
      int index=0;
      for (Book book : this.books) {
        if(book.getTitle().contains(name)){
          searchBook[index++]=book;
        }
      }
      return searchBook;
    }

    public static void main(String[] args) {
      Book b1= new Book("history", "Mike");
      Book b2= new Book("game", "Joe");
      Book b3= new Book("music", "gg");
      Library l1= new Library();
      l1.add(b1);
      l1.add(b2);
      l1.add(b3);

      for (Book b: l1.books) {
        System.out.println(b.getTitle()+" "+b.getAuthor());
      }
      System.out.println(Arrays.toString(l1.searchByTitle("music")));

      for (Book book : l1.searchByTitle("s")) {
        System.out.println(book.getTitle());
      }

      }
    

}
