package edu.dp.sau.lukashevych_daryna.lab2;
import java.util.Random;
import java.util.Scanner;

public class matrix {
    private int[][] matrix;
    public matrix(int rows, int cols) {
        matrix = new int[rows][cols];
    }

    public void fillMatrixManually(Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter value for element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }


    public void fillMatrixRandomly() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(201) - 100;  // Випадкові числа від -100 до 100
            }
        }
    }


    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public int findMin() {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }


    public int findMax() {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }


    public double calculateAverage() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number of rows (max 20): ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns (max 20): ");
        int cols = scanner.nextInt();

        if (rows > 20 || cols > 20) {
            System.out.println("The size of the matrix is too large. Max size is 20x20.");
            return;
        }


        matrix matrix = new matrix(rows, cols);


        System.out.println("Choose how to fill the matrix:");
        System.out.println("1. Manually");
        System.out.println("2. Randomly");
        int choice = scanner.nextInt();

        if (choice == 1) {
            matrix.fillMatrixManually(scanner);
        } else if (choice == 2) {
            matrix.fillMatrixRandomly();
        } else {
            System.out.println("Invalid choice!");
            return;
        }


        matrix.printMatrix();


        int min = matrix.findMin();
        int max = matrix.findMax();
        double average = matrix.calculateAverage();


        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}
