package Week1;
import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        //Scanner sınıfını tanımladık.
        Scanner girdi = new Scanner(System.in);

        //Değişkenlerimizi oluşturduk.
        int kenar1, kenar2, kenar3;

        System.out.print("Lütfen 1.Kenar uzunluğunu giriniz: ");
        kenar1 = girdi.nextInt();
        System.out.print("Lütfen 2.Kenar uzunluğunu giriniz: ");
        kenar2 = girdi.nextInt();
        System.out.print("Lütfen 3.Kenar uzunluğunu giriniz: ");
        kenar3 = girdi.nextInt();

        int cevre = kenar1 + kenar2 + kenar3;
        int u = cevre / 2;
        double alan = Math.sqrt( u * (u - kenar1) * (u - kenar2) * (u - kenar3));
        System.out.println("Üçgenimizin Alanı :" + alan );
    }
}
