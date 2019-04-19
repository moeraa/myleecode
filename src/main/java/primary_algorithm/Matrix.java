package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/18 09:56
 * @Description:
 * 给定一个 n × n 的二维矩阵表示一个图像。
 *
 * 将图像顺时针旋转 90 度。
 *
 * 说明：
 *
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 */
public class Matrix {
    public static int[][] matrix(int[][] matrix){
        int n = matrix.length-1;
        int mid = matrix.length/2;
            for (int i = 0; i <mid; i++) {
                for (int j = i; j <n-i ; j++) {//[0][0]
                        int temp = matrix[i][j];//[0][1]
                        matrix[i][j] = matrix[n-j][i];
                        matrix[n-j][i] = matrix[n-i][n-j];//[1][0]
                        matrix[n-i][n-j] = matrix[j][n-i];//[9][9]
                        matrix[j][n-i] = temp;//[0][9]
                }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] matrix ={
                {0,1,2,3},//12 8 4 0
                {4,5,6,7},//1,2
                {8,9,10,11},
                {12,13,14,15},

        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix(matrix)[i]));
        }
    }
}
