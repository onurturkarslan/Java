package Week5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnCokGecenKelime {
    public static void main(String[] args) {
        // Kullanıcıdan metni al
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        // Metni kelimelere ayır
        String[] kelimeler = metin.split("\\s+");

        // Kelimeleri ve sayıları tutmak için HashMap kullan
        HashMap<String, Integer> kelimeSayilari = new HashMap<>();

        // Kelimeleri say
        for (String kelime : kelimeler) {
            kelime = kelime.toLowerCase(); // Büyük/küçük harf duyarlılığını kaldırmak için
            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }
        }

        // En çok geçen kelimeyi bul
        String enCokGecenKelime = null;
        int maxSayisi = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            if (entry.getValue() > maxSayisi) {
                enCokGecenKelime = entry.getKey();
                maxSayisi = entry.getValue();
            }
        }

        // Sonucu yazdır
        System.out.println("En çok geçen kelime: " + enCokGecenKelime);
        System.out.println("Geçiş sayısı: " + maxSayisi);
    }
}
