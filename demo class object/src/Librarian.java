public class Librarian {
  private String name;

  public Librarian(){

  }

  public Librarian(String name){
    this.name=name;
  }

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }

  public Book[] addBooks(Book[] books, Book book){
    Book[] newBookArr= new Book[books.length+1];
    for(int i=0;i<books.length;i++){
      newBookArr[i]=books[i];
    }

    newBookArr[newBookArr.length-1]=book;
    return newBookArr;
  }

  public Book[] removeBook(Book[] books, String name){
    Book []newBook= new Book[books.length-1];
    int removeIndex= 0;
    Book removeBook=null;
    for (int i=0; i<books.length;i++) {
      if(books[i].getTitle().equals(name)){
        removeIndex= i;
        removeBook=books[i];
      }
    }
    for(int i=0; i<removeIndex; i++){
      newBook[i]= books[i];
    }

    for(int i=removeIndex; i<newBook.length;i++){
      newBook[i]=books[i+1];
    }

    books=newBook;

    return books;
  }

  public Book[] searchByTitle(Book[] books, String name){
    Book[] searchBook=new Book[0];
      int mark=0;
      for (Book book : books) {
        if(book.getTitle().contains(name)){
          mark++;
        }
      }
      searchBook= new Book[mark];
      int index=0;
      for (Book book : books) {
        if(book.getTitle().contains(name)){
          searchBook[index++]=book;
        }
      }
      return searchBook;
  }
}
