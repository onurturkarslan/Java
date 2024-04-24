package Week1;
import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım.
        double boy, kilo, vucutKitleIndeksi;

        //Scenner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = girdi.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        kilo = girdi.nextDouble();

        vucutKitleIndeksi = kilo / ( boy * boy );
        System.out.printf("Vücut Kitle İndeksiniz :" + vucutKitleIndeksi);



    }
}
