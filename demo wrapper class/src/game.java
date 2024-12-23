import java.util.Scanner;

public class game {
  public static void main(String[] args) {
       int [][] arr2D= new int[3][3];
        for(int i= 0; i<arr2D.length; i++){
            for(int j= 0; j<arr2D[i].length;j++){
                System.out.print("| ");
            }
            System.out.println("");
        }

        Scanner scanner= new Scanner(System.in);

        boolean notWin= true;

        while (notWin) {         
            System.out.println("input your letter (1/2)");
            int player = scanner.nextInt();
            if(
                player !=1 &&player !=2){
                System.out.println("just can input 1/2, input again");
                continue;
            }

            System.out.println("input the row");
            int row = scanner.nextInt();
            System.out.println("input the column");
            int column = scanner.nextInt();

            if(arr2D[row][column]==0) {
                arr2D[row][column]=player;
            }

            for(int i= 0; i<arr2D.length; i++){
                for(int j= 0; j<arr2D[i].length;j++){
                    System.out.print("|"+(arr2D[i][j]==0?" ":arr2D[i][j]));
                }
                System.out.println("");
            }

            if((arr2D[0][0]==arr2D[0][1]&&arr2D[0][1]==arr2D[0][2] &&arr2D[0][2] !=0)
            ||(arr2D[1][0]==arr2D[1][1]&&arr2D[1][1]==arr2D[1][2] &&arr2D[1][2] !=0)
            ||(arr2D[2][0]==arr2D[2][1]&&arr2D[2][1]==arr2D[2][2] &&arr2D[2][2] !=0)
            ||(arr2D[0][0]==arr2D[1][0]&&arr2D[1][0]==arr2D[2][0] &&arr2D[2][0] !=0)
            ||(arr2D[0][1]==arr2D[1][1]&&arr2D[1][1]==arr2D[2][1] &&arr2D[2][1] !=0)
            ||(arr2D[0][2]==arr2D[1][2]&&arr2D[1][2]==arr2D[2][2] &&arr2D[2][2] !=0)
            ||(arr2D[0][0]==arr2D[1][1]&&arr2D[1][1]==arr2D[2][2] &&arr2D[2][2] !=0)
            ||(arr2D[0][2]==arr2D[1][1]&&arr2D[1][1]==arr2D[2][0] &&arr2D[2][0] !=0)
            ){
                System.out.println("The "+ player+ "win the game");
                notWin= false;
            }
            
        }
 
        
        scanner.close();

  }
}
