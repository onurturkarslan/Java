package Week2;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matris boyutlarını kullanıcıdan al
        System.out.print("Satır sayısını giriniz: ");
        int rows = scanner.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int cols = scanner.nextInt();

        // Matrisi oluştur
        int[][] matrix = new int[rows][cols];

        // Matris elemanlarını kullanıcıdan al
        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Matrisin transpozunu bul
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        // Transpoz matrisi ekrana yazdır
        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}

