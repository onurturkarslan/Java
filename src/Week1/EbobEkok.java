package Week1;
import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = (sayi1 * sayi2);

        int k = 2;
        while (k <= sayi1 && k <= sayi2) {
            if (sayi1 % k == 0 && sayi2 % k == 0) {
                ebob = k;
            }
            k++;
        }

        ekok /= ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        scanner.close();
    }
}

