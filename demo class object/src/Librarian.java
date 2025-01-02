public class Librarian {
  private String name;
  private Library library;

  public Librarian(){

  }

  public Librarian(String name,Library library){
    this.name=name;
    this.library=library;
  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  // public void addBooks(Book[] books, Book book){
  //   Book[] newBookArr= new Book[books.length+1];
  //   for(int i=0;i<books.length;i++){
  //     newBookArr[i]=books[i];
  //   }

  //   newBookArr[newBookArr.length-1]=book;
  //   this.library.setBooks(newBookArr);
  // }

  public void addBooks(Book book){
    Book[] newBookArr= new Book[this.library.getBooks().length+1];
    for(int i=0;i<this.library.getBooks().length;i++){
      newBookArr[i]=this.library.getBooks()[i];
    }

    newBookArr[newBookArr.length-1]=book;
    this.library.setBooks(newBookArr);
  }

  public Book removeBook( String name){
    Book []newBook= new Book[this.library.getBooks().length-1];
    int removeIndex= 0;
    Book removeBook=null;
    for (int i=0; i<this.library.getBooks().length;i++) {
      if(this.library.getBooks()[i].getTitle().equals(name)){
        removeIndex= i;
        removeBook=this.library.getBooks()[i];
      }
    }
    for(int i=0; i<removeIndex; i++){
      newBook[i]= this.library.getBooks()[i];
    }

    for(int i=removeIndex; i<newBook.length;i++){
      newBook[i]=this.library.getBooks()[i+1];
    }

    this.library.setBooks(newBook);

    return removeBook;
  }

  public Book[] searchByTitle( String name){
    Book[] searchBook=new Book[0];
      int mark=0;
      for (Book book : this.library.getBooks()) {
        if(book.getTitle().contains(name)){
          mark++;
        }
      }
      searchBook= new Book[mark];
      int index=0;
      for (Book book : this.library.getBooks()) {
        if(book.getTitle().contains(name)){
          searchBook[index++]=book;
        }
      }
      return searchBook;
  }
}
