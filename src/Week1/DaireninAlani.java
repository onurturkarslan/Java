package Week1;
import java.util.Scanner;
public class DaireninAlani {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım.
        int r, a;
        double pi = 3.14, alan, cevre, dilimAlani;


        //Scanner sınıfını ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Girdileri alalım.
        System.out.print("Yarı Çapı Giriniz :");
        r = girdi.nextInt();
        System.out.print("Merkez Açısının Ölçüsünü Giriniz :");
        a = girdi.nextInt();

        alan = pi * r * r;
        System.out.println("Dairenin Alanı :" + alan +" " + "dır");

        cevre = 2 * pi * r;
        System.out.println("Dairenin Çevresi :" + cevre +" " + "dır");

        dilimAlani = ( pi * ( r * r ) * a) / 360;
        System.out.println("Daire Diliminin Alanı :" + dilimAlani +" " + "dır");




    }
}
