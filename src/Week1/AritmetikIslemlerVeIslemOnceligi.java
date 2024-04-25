package Week1;
import java.util.Scanner;
public class AritmetikIslemlerVeIslemOnceligi {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım.
        int a, b, c, sonuc;

        //Scanner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Girdilerimizi alalım.
        System.out.print("Lütfen a sayısını giriniz :");
        a = girdi.nextInt();
        System.out.print("Lütfen b sayısını giriniz :");
        b = girdi.nextInt();
        System.out.print("Lütfen c sayısını giriniz :");
        c = girdi.nextInt();

        sonuc   = a + b * c - b;
        System.out.println("Sonuç :" + sonuc);
    }
}
