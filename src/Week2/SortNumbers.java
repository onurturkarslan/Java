package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Diziyi sırala
        Arrays.sort(array);

        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
