package Week1;
import java.util.Scanner;

public class NinRliKombinasyonu {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n, r, resault;
        int nTotal = 1;
        int rTotal = 1;
        int nrTotal = 1;
        System.out.print("İlk sayıyı giriniz :");
        n = girdi.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        r = girdi.nextInt();

        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= n - r; i++) {
            nrTotal *= i;
        }
        resault = nTotal / (rTotal * nrTotal);
        System.out.println(resault);
    }
}
