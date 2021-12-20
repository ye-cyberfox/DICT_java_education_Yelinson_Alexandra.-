package MatrixProcessing;

import java.util.Scanner;

public class MatrixProcessing {
    public static void main(String[] args) {
        menuMatrix();
    }
    public static void matrixSum(){
        Scanner in = new Scanner(System.in);
            int line_A = in.nextInt();
            int column_A = in.nextInt();
            int[][] matrixA = new int[line_A][column_A];
            for (int i = 0; i < line_A; i++) {
                for (int j = 0; j < column_A; j++) {
                    matrixA[i][j] = in.nextInt();
                }
            }
            int line_B = in.nextInt();
            int column_B = in.nextInt();
            int[][] matrixB = new int[line_B][column_B];
            for (int i = 0; i < line_B; i++) {
                for (int j = 0; j < column_B; j++) {
                    matrixB[i][j] = in.nextInt();
                }
            }
            if (matrixA.length == matrixB.length) {
                System.out.println("Sum:");
                for (int i = 0; i < line_A; i++) {
                    for (int j = 0; j < column_A; j++) {
                        System.out.print(matrixA[i][j] + matrixB[i][j] + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("ERROR");
            }
        }
    public static void matrixMultiplicationConst(){
        Scanner scan = new Scanner(System.in);
        int line_A = scan.nextInt();
        int column_A = scan.nextInt();
        int[][] matrixA = new int[line_A][column_A];
        for (int i = 0; i < line_A; i++) {
            for (int j = 0; j < column_A; j++) {
                matrixA[i][j] = scan.nextInt();
            }
        }
        int constant = scan.nextInt();
        System.out.println("Multiplication Const:");
        for (int i = 0; i < line_A; i++) {
            for (int j = 0; j < column_A; j++) {
                System.out.print(matrixA[i][j] * constant+ " ");
            }
            System.out.println();
        }
    }
    public static void matrixMultiplication(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of A matrix : ");
        int[] matrixA = new int[2];
        for (int i = 0; i < 2; i++) {
            matrixA[i] = in.nextInt();
        }
        System.out.println("Enter the values of A matrix : ");
        double[][] ValueMatrixA = new double[matrixA[0]][matrixA[1]];
        for (int i = 0; i < matrixA[0]; i++) {
            for (int j = 0; j < matrixA[1]; j++) {
                ValueMatrixA[i][j] = in.nextDouble();
            }
        }
        System.out.print("Enter size of B matrix : ");
        int[] matrixB = new int[2];
        for (int i = 0; i < 2; i++) {
            matrixB[i] = in.nextInt();
        }
        System.out.println("Enter the values of B matrix : ");
        double[][] ValueMatrixB = new double[matrixB[0]][matrixB[1]];
        for (int i = 0; i < matrixB[0]; i++) {
            for (int j = 0; j < matrixB[1]; j++) {
                ValueMatrixB [i][j] = in.nextDouble();
            }
        }
        double[][] resultMultiplication = new double[matrixA[0]][matrixB[1]];
        for (int line_a = 0; line_a < matrixA[0]; line_a++) {
            for (int column_b = 0; column_b < matrixB[1]; column_b++) {
                resultMultiplication [line_a][column_b] = 0;
            }
        }
        if (matrixB[0] == matrixA[1]) {
            System.out.println("Multiplication");
            for (int line = 0; line < matrixA[0]; line++) {
                for (int column = 0; column < matrixB[1]; column++) {
                    for (int value = 0; value < matrixA[1]; value++) {
                        resultMultiplication[line][column] = resultMultiplication[line][column] + ValueMatrixA[line][value] * ValueMatrixB[value][column];
                    }
                    System.out.print(resultMultiplication[line][column] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("ERROR");
        }
    }
    public static void menuMatrix(){
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("""
                    1. Add matrices
                    2. Multiply matrix by constant
                    3. Multiply matrices
                    4. Exit
                    """);
            System.out.println("Choose your action:");
            String user = scan.next();
            if (user.equals("1")){
                matrixSum();
            }
            else if (user.equals("2")){
                matrixMultiplicationConst();
            }
            else if (user.equals("3")){
                matrixMultiplication();
            }
            else {
                break;
                }
            }
        }
    }







