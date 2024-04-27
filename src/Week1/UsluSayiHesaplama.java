package Week1;
import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int n, k;
        int result = 1;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        n = girdi.nextInt();
        System.out.print("Üs : ");
        k = girdi.nextInt();

        for (int i = 1; i <= k; i++) {
            result *= n;

        }
        System.out.println("Sonuç : " + result);
    }
}
