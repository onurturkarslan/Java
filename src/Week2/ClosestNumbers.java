package Week2;
import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dizi oluştur
        System.out.print("Dizinin boyutunu girin: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Diziyi doldur
        System.out.println("Dizinin elemanlarını girin: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Kullanıcıdan sayıyı al
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        // Diziyi küçükten büyüğe sırala
        Arrays.sort(array);

        // En yakın küçük ve büyük sayıları bul
        int closestSmaller = Integer.MIN_VALUE;
        int closestLarger = Integer.MAX_VALUE;

        for (int i = 0; i < size; i++) {
            if (array[i] < number) {
                closestSmaller = Math.max(closestSmaller, array[i]);
            } else if (array[i] > number) {
                closestLarger = Math.min(closestLarger, array[i]);
                break; // Daha büyük sayıya ulaşıldı, döngüden çık
            }
        }

        // Sonucu yazdır
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + closestSmaller);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + closestLarger);

    }
}
