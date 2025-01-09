import java.util.Arrays;

public class NizoviVjezba2 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {5, 6, 7}, {9, 0, 1}};
        int[][] matrix2 = {{4, 1, 6}, {2, 3, 5}, {7, 4, 3}};
        int[][] matrix3 = new int[3][3];
//        System.out.println((matrix[0][2]));
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.println(matrix[i][j]);
//            }
//        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix3[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.println(matrix3[i][j]);
            }
        }
//        matrix3[0][0] = matrix[0][0] + matrix2[0][0];
//        matrix3[0][1] = matrix[0][1] + matrix2[0][1];
//        matrix3[0][2] = matrix[0][2] + matrix2[0][2];
//        matrix3[1][0] = matrix[1][0] + matrix2[1][0];
//        matrix3[1][1] = matrix[1][1] + matrix2[1][1];
//        matrix3[1][2] = matrix[1][2] + matrix2[1][2];
//        matrix3[2][0] = matrix[1][0] + matrix2[2][0];
//        matrix3[2][1] = matrix[1][1] + matrix2[2][1];
//        matrix3[2][2] = matrix[1][2] + matrix2[2][2];




    }
}
