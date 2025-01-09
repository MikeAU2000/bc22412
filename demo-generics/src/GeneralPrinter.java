import java.util.ArrayList;

public class GeneralPrinter <T>{
  private T value;

  public GeneralPrinter(T value){
    this.value= value;
  }

  public T getValue(){
    return this.value;
  }

  public String print(){
    return "this is"+this.value;
  }

  public static void main(String[] args) {
    GeneralPrinter<Integer> printer= new GeneralPrinter<>(Integer.valueOf(3));

    Object obj=3;
    if(obj instanceof Integer){
      Integer integer= (Integer)obj;
      System.out.println(integer.compareTo(2));

    }


    ArrayList<String> strings=new ArrayList<>();
    
  }
}
