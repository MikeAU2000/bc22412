public class Library2 {
  //A library has many books
  //A book has Attribute, title and author
  //The library has function;
    // 1) add a book, return vold.
    // 2) removeByTitle, return Book.
    // 3) searchByTitle, return Book[]

  private Book2[] book2= new Book2[0];

  public Library2(){

  }

  public void addBook(Book2 book){
    Book2[] newBookArr= new Book2[this.book2.length+1];
    for(int i=0; i<this.book2.length;i++){
      newBookArr[i]= this.book2[i];
    }
    newBookArr[newBookArr.length-1]=book;

    this.book2=newBookArr;
  }

  public Book2 removeBook(String title){
    Book2 removeBook2= new Book2();
    int removeIndex=0;
    Book2[] newBook2= new Book2[this.book2.length-1];
    for(int i=0;i<this.book2.length;i++){
      if(this.book2[i].getTitle().equals(title)){
        removeBook2= book2[i];
        removeIndex= i;
      }
    }

    for(int i=0;i<removeIndex;i++){
      newBook2[i]= this.book2[i]; 
    }

    for(int i=removeIndex;i<newBook2.length;i++){
      newBook2[i]= this.book2[i+1];
    }

    this.book2=newBook2;

    return removeBook2;
  }

  public Book2[] searchByString(String str){
    int arrayLength=0;
    for (Book2 b : this.book2) {
      if(b.getTitle().contains(str)){
        arrayLength+=1;
      }
    }
    Book2 []book2Array= new Book2[arrayLength];
    int index=0;
    for (Book2 b : this.book2) {
      if(b.getTitle().contains(str)){
        book2Array[index++]= b;
        if (index>arrayLength) {
          break;
        }
      }
    
    }
    return book2Array;
  }

  public static void main(String[] args) {
    Book2 b1=new Book2("history", "Mike");
    Book2 b2=new Book2("English", "Joe");
    Book2 b3=new Book2("Math","Tim");
    Library2 l1=new Library2();
    l1.addBook(b1);
    l1.addBook(b2);
    l1.addBook(b3);

    for (Book2 book: l1.book2) {
      System.out.println(book.getTitle()+" "+book.getAuthor());
    }

    System.out.println("book search");

    for(Book2 b: l1.searchByString("s")){
      System.out.println(b.getTitle());
    }
    
  }
}
