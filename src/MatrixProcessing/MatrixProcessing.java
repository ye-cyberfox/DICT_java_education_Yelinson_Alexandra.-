package MatrixProcessing;

import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        matrixSum();
    }
    public static void matrixSum(){
        Scanner in = new Scanner(System.in);
            int line_A = in.nextInt();
            int colume_A = in.nextInt();
            int[][] matrixA = new int[line_A][colume_A];
            for (int i = 0; i < line_A; i++) {
                for (int j = 0; j < colume_A; j++) {
                    matrixA[i][j] = in.nextInt();
                }
            }
            int line_B = in.nextInt();
            int colume_B = in.nextInt();
            int[][] matrixB = new int[line_B][colume_B];
            for (int i = 0; i < line_B; i++) {
                for (int j = 0; j < colume_B; j++) {
                    matrixB[i][j] = in.nextInt();
                }
            }
            if (matrixA.length == matrixB.length) {
                for (int i = 0; i < line_A; i++) {
                    for (int j = 0; j < colume_A; j++) {
                        System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("ERROR");
            }
        }
    }







