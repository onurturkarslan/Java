package Week1;

import java.util.Scanner;

public class CiftVeDortunKatlariToplami {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int n;
        int total = 0;
        do {
            System.out.print("Bir sayı giriniz :");
            n = girdi.nextInt();
            if (n % 2 == 0 && n % 4 == 0) {
                total += n;

            }
        } while (n % 2 == 0);
        System.out.println("TOLAM :" + total);

    }
}
