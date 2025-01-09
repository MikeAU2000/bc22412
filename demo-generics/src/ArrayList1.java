public class ArrayList1<T> {
  private T[] values;

  public ArrayList1() {
    this.values= (T[]) new Object[0];
  }

  public void clear() {
    this.values= (T[]) new Object[0];
  }


  public boolean add(T value){
    T[] newValues= (T[]) new Object[this.values.length+1];
    for(int i=0;i<this.values.length;i++){
      newValues[i]=this.values[i];
    }
    newValues[newValues.length-1]=value;
    this.values= newValues;
    return true;
  }

  public int size(){
    return this.values.length;
  }

  public static void main(String[] args){
    ArrayList1<Book> books= new ArrayList1<>();
    books.add(new Book("ABC"));
    books.add(new Book("EFG"));
    System.out.println(books.size());

  }
}
