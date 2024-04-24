package Week1;

import java.util.Scanner;


public class Kdv {
    public static void main(String[] args) {

        //Değişkenleri oluşturduk.
        double para, kdvliFiyat, kdvTutari;

        //Scanner sınıfını tanımladık.
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen bir tutar giriniz: ");
        para = girdi.nextInt();
        if (para > 0) {
            double kdv;
            if (para <= 1000) {
                kdv = 0.18;
            } else {
                kdv = 0.08;
            }

            kdvTutari = para * kdv;
            kdvliFiyat = (para * kdv) + para;
            System.out.println("Kdv'li Fiyat :" + kdvliFiyat);
            System.out.println("Kdv Tutarı: " + kdvTutari);
        } else {
            System.out.println("Lütfen sıfırdan büyük bir değer giriniz!");
        }
    }
}
