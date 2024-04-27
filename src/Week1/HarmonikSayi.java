package Week1;
import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n;
        double result = 0.0;
        System.out.print("Bir sayı giriniz : ");
        n = girdi.nextInt();


        for (int i = 1; i <= n; i++){
            result += (1.0/i);

        }
        System.out.println("Sonuç : " + result);
    }
}
