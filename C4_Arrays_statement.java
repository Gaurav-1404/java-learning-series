import java.util.Scanner;
public class C4_Arrays_statement {
    public static void main(String[] args) {
        
        // Option 1: Declare and initialize directly
        int[] marks = {30, 25, 30, 26, 28};
        
        // Option 2: Using 'new' keyword
        // int[] marks2 = new int[]{30, 25, 30, 26, 28};
        
        // Printing the array values
        for(int i = 0; i < marks.length; i++) {
            System.out.println("marks[" + i + "] = " + marks[i]);
        }
        Scanner sc = new Scanner(System.in);

        // two dimensional array
        int[][] matrix = new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        //print Array
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix[i][j]+ ", ");
            }
            System.out.println();
        }
        sc.close();
    }
}
