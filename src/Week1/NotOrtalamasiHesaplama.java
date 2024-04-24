package Week1;

import java.util.Scanner;


public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        //Değişkenlerimizi oluşturalım.
        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;

        //Scanner sınıfımızı tanımladık.
        Scanner girdi = new Scanner(System.in);

        //Kullanıcıdan değerleri girmesini isteyelim.
        System.out.print("Matematik Notunuzu Giriniz : ");
        Matematik = girdi.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        Fizik = girdi.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        Kimya = girdi.nextInt();

        System.out.print("Turkce Notunuzu Giriniz : ");
        Turkce = girdi.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        Tarih = girdi.nextInt();

        System.out.print("Muzik Notunuzu Giriniz : ");
        Muzik = girdi.nextInt();



        int toplam = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik);
        double ortalama = toplam / 6;

        String sonuc = (ortalama>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Ortalamanız: " + ortalama + " ve" + " Sonuç: " + sonuc);


    }
}
