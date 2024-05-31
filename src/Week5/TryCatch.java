package Week5;

import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {
        // 10 elemanlı diziyi manuel olarak tanımlıyoruz
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Kullanıcıdan indeks alımı
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir indeks girin (0-9): ");
        int index = scanner.nextInt();

        // Belirtilen indeksteki elemanı döndüren metodu çağırıyoruz
        String result = getElementAtIndex(array, index);
        System.out.println(result);

    }

    // Belirtilen indeksteki elemanı döndüren metod
    public static String getElementAtIndex(int[] array, int index) {
        try {
            // Dizinin belirtilen indeksteki elemanını döndürüyoruz
            int element = array[index];
            return "Dizinin " + index + ". indeksindeki eleman: " + element;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata oluşursa, uygun bir hata mesajı döndürüyoruz
            return "Hata: Geçersiz indeks. Lütfen 0 ile 9 arasında bir indeks girin.";
        }
    }
}
