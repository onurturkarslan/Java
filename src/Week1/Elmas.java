package Week1;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n;
        System.out.print("Elmas büyüklüğünü giriniz : ");
        n = girdi.nextInt();
        // Üst kısmı oluşturma
        for (int i = 1; i <= n; i += 2) {
            // Boşlukları ekle
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt kısmı oluşturma
        for (int i = n - 2; i >= 1; i -= 2) {
            // Boşlukları ekle
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekle
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
