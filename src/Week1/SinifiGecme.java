package Week1;

import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {

        //Değişkenlerimizi oluşturalım.
        int matematik, fizik, turkce, kimya, muzik;
        double ortalama;

        //Scanner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Girdilerimizi alalım.
        System.out.print("Lütfen Matematik notunuzu giriniz :");
        matematik = girdi.nextInt();

        System.out.print("Lütfen Fizik notunuzu giriniz :");
        fizik = girdi.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz :");
        turkce = girdi.nextInt();

        System.out.print("Lütfen Kimya notunuzu giriniz :");
        kimya = girdi.nextInt();

        System.out.print("Lütfen Müzik notunuzu giriniz :");
        muzik = girdi.nextInt();

        // 0 ile 100 arasında olmayan notlar hesaplamaya katılmasın
        int notlarinSayisi = 0;
        double notToplami = 0;

        if (matematik >= 0 && matematik <= 100) {
            notToplami += matematik;
            notlarinSayisi++;
        }
        if (fizik >= 0 && fizik <= 100) {
            notToplami += fizik;
            notlarinSayisi++;
        }
        if (turkce >= 0 && turkce <= 100) {
            notToplami += turkce;
            notlarinSayisi++;
        }
        if (kimya >= 0 && kimya <= 100) {
            notToplami += kimya;
            notlarinSayisi++;
        }
        if (muzik >= 0 && muzik <= 100) {
            notToplami += muzik;
            notlarinSayisi++;
        }

        if (notlarinSayisi > 0) {
            ortalama = notToplami / notlarinSayisi;

            if (ortalama > 55) {
                System.out.println("Ortalamanız :" + ortalama);
                System.out.println("Tebrikler! Sınıfı Geçtiniz.");
            } else {
                System.out.println("Ortalamanız :" + ortalama);
                System.out.println("Üzgünüz! Sınıfta Kaldınız.");
            }
        } else {
            System.out.println("Geçersiz not girişi yapıldı, Girilen notlarınız 0 ile 100 arasında olmalıdır! ");
        }
    }
}
