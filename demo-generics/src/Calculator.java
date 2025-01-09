public class Calculator <T extends Number>{
  private T x;
  private T y;

  public Calculator(T x, T y){
    this.x= x;
    this.y= y;
  }

  public Number sum(){
    if(this.x instanceof Byte){
      return (Byte)x + (Byte)y;
    }else if(this.x instanceof Short){

    }else if(this.x instanceof Integer){

    }else if(this.x instanceof Long){

    }else if(this.x instanceof Float){

    }else if(this.x instanceof Double){

    }

  }

  public static void main(String[] args) {
    Calculator<Number> calculator2= new Calculator<>(Byte.valueOf("10"),Short.valueOf("20"));
  }
}
