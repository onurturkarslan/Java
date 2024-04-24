package Week1;
import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlayalım.
        int km;
        double taksimetre = 2.20;
        double ucret = 10;

        //Scenner sınıfını ekleyelim.
        Scanner girdi = new Scanner(System.in);

        System.out.print("Kaç km yol aldınız :");
        km = girdi.nextInt();

        ucret += km * taksimetre;
        ucret = ( ucret < 20 ) ? 20 : ucret;
        System.out.println("Borcunuz :" + ucret + " " +"TL");


    }
}
