import java.io.*;
import java.util.*;

public class day_41 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
    }
}
class Solution {
    public void setMatrixZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row_first =false;
        boolean col_first=false;
       for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                row_first=true;
                break;
            }
        }
        for(int j=0;j<n;j++){
            if(matrix[j][0]==0){
                col_first=true;
                break;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] =0;
                    matrix[0][j] =0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] =0;
                }
            }
        }

        if(row_first==true){
            for(int i=0;i<m;i++){
                matrix[0][i]=0;
            }
        }
        if(col_first==true){
            for(int i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}