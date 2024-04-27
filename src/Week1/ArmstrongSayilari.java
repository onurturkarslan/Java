package Week1;
import java.util.Scanner;
public class ArmstrongSayilari {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        n = girdi.nextInt();
        while (n != 0){
            toplam += n % 10;
            n /= 10;
        }
        System.out.println("Basamakları toplamı : " + toplam);
    }
}
