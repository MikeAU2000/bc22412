public class DemoForEach {
  public static void main(String[] args) {
    int[] arr= new int[]{3,4,5};
    for(int i=0;i<arr.length;i++){
      System.out.println(i);
    }

    for(int i: arr){
      System.out.println(i);
    }

    char[] arr2= new char[]{'p','t','e'};
    String newStr= "";
    for(char c: arr2){
      newStr+= c;
    }
    System.out.println(newStr);

    String []arr3=new String[]{"abc","ijk", "def"};
    String target="ijk";
    boolean found= false;
    for(String s: arr3){
      if(s.equals(target)){
        found= true;
        break;
      }
    }
    System.out.println(found);

    String s= "a";
    System.out.println(s.to);
    char c= Character.
  }
}
