package Week1;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
        int a, b, islem;


        //Scanner sınıfımızı ekledik.
        Scanner girdi = new Scanner(System.in);

        //Girdilerimizi alalım.
        System.out.print("İlk sayınızı giriniz :");
        a = girdi.nextInt();
        System.out.print("İkinci sayınızı giriniz :");
        b = girdi.nextInt();

        System.out.println("Bir işlem seçiniz:"+" "+"1-Toplama"+" "+"2-Çıkartma"+" "+"3-Çarpma"+" "+"4-Bölme");
        islem = girdi.nextInt();

        switch (islem) {
            case 1:
                islem = (a + b);
                System.out.println("Sonuç: " + islem);
                break;
            case 2:
                islem = (a - b);
                System.out.println("Sonuç: " + islem);
                break;
            case 3:
                islem = (a * b);
                System.out.println("Sonuç: " + islem);
                break;
            case 4:
                if (b!=0){
                    islem = (a / b);
                    System.out.println("Sonuç: " + islem);
                }else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz...");

        }


    }
}
