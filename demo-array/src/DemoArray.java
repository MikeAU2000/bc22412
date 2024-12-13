public class DemoArray {
  public static void main(String[] args) {
    int x1 = 3;
    int x2 = 10;
    int x3 = 11;


    // declare array
    int[] arr = new int[3];
    // assign value to array
    arr[0] = 3;
    arr[1] = 10;
    arr[2] = 11;
    // for loop -> read array values
    // print out all the value that large than 10
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 10) {
        System.out.println(arr[i]);
      }
    }

    // declare double array, length= 5
    // 10.4, 4.3, 3.3, 1.9, 9,9
    // Sum up all values in the double array
    double[] douArr = new double[5];
    douArr[0] = 10.4;
    douArr[1] = 4.3;
    douArr[2] = 3.3;
    douArr[3] = 1.9;
    douArr[4] = 9.9;

    double sum = 0;
    for (int i = 0; i < douArr.length; i++) {
      sum += douArr[i];
    }
    System.out.println(sum);

    boolean found = false;
    String target = "abc";
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";

    for (int i = 0; i < arr3.length; i++) {
      if (target.equals(arr3[i])) {
        found = true;
      }
    }
    System.out.println(found);

    char[] arr4 = new char[] {'b', 'c', 'a'};
    //conventt teh char value to int value, and then assign them to a new int array
    //98, 99,97

    int[] arr5 = new int[arr4.length];

    for(int i= 0; i<arr4.length; i++){
      arr5[i]= arr4[i];
      System.out.print(arr5[i]+" ");
    }


    System.out.println();

    //Find the mix ascil value in the int array


    int maxValue= 0;
    for(int i= 0;i<arr5.length;i++){
      if(arr5[i]>maxValue){
        maxValue = arr5[i];
      }
    }
    System.out.println("The max number is "+maxValue);


    int[] arr7= new int[]{9,8,99,98};
    int minValue= arr7[0];
    for(int i= 0;i<arr7.length;i++){
      if(arr7[i]<minValue){
        minValue = arr7[i];
      }
    }
    System.out.println("The min number is "+minValue);



  }
}
