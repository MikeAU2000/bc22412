import java.util.Arrays;

public class Demo2DArray {
  public static void main(String[] args) {
    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));

    // excel (row x column)
    int[][] arr2d = new int[2][3];
    // row 0,1
    // column 0,1,2
    arr2d[0][0] = 100;
    arr2d[1][2] = 100;

    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.println(arr2d[i][j]);
      }
    }


    int[][] arr2d2 = new int[][] {{100, 0, 0}, {0, 0, 100}};
    System.out.println(Arrays.deepToString(arr2d2));

    int[][] arr2D3 = new int[][] {{100, 7, 9}, {101, -9, 100}};
    int[] arrMax = new int[arr2D3.length];
    for (int i = 0; i < arr2D3.length; i++) {
      int max = Integer.MIN_VALUE;
      for (int j = 0; j < arr2D3[i].length; j++) {
        if (arr2D3[i][j] > max) {
          max = arr2D3[i][j];
        }
      }
      arrMax[i] = max;
    }
    System.out.println(Arrays.toString(arrMax));
  }
}
