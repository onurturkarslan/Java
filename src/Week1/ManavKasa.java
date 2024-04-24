package Week1;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım.
        double armut, elma, domates, muz, patlican, borcumuz;

        //Scanner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Girdilerimizi Alalım.
        System.out.print("Armut Kaç Kilo ? :");
        armut = girdi.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma = girdi.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates = girdi.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz = girdi.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = girdi.nextDouble();

        //Toplam Borcu Hesaplayalım.
        borcumuz = ( (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5) );
        System.out.println("Toplam Tutar :" + borcumuz + " " + "TL'dir");



    }
}
