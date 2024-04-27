package Week1;
import java.util.Scanner;

public class GirilenSayiyaKadarOrtalama {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int toplam = 0, adet = 0;
        double ortalama;
        System.out.print("Bir sayı giriniz :");
        int sayi = girdi.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (sayi % 3 == 0 && sayi % 4 == 0) {
                toplam +=i;
                adet ++;
            }
        }
        if (adet == 0) {
            System.out.println("Girilen aralıkta 3 ve 4'e tam bölünen bir sayı yoktur.");
        } else {
            ortalama = toplam / adet;
            System.out.println("Ortalama: " + ortalama);
        }
    }
}
