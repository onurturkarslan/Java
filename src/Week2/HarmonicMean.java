package Week2;

import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int size = scanner.nextInt();

        // Dizi oluştur
        double[] array = new double[size];

        // Kullanıcıdan dizi elemanlarını al.
        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        // Harmonik ortalama hesaplama
        double harmonicSum = 0;
        for (int i = 0; i < size; i++) {
            harmonicSum += 1 / array[i];
        }
        double harmonicMean = size / harmonicSum;

        // Sonucu yazdır
        System.out.println("Dizinin harmonik ortalaması: " + harmonicMean);

    }
}

