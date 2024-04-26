package Week1;
import java.util.Scanner;

public class UcakBiletFiyati {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi (km) giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1: Tek Yön | 2: Gidiş-Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        double biletFiyati = mesafe * 0.10; // Mesafe başına ücret: 0.10 TL

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            // Yaş indirimi
            if (yas < 12) {
                biletFiyati *= 0.5; // %50 indirim
            } else if (yas >= 12 && yas <= 24) {
                biletFiyati *= 0.9; // %10 indirim
            } else if (yas >= 65) {
                biletFiyati *= 0.7; // %30 indirim
            }

            // Yolculuk tipi indirimi
            if (yolculukTipi == 2) {
                biletFiyati *= 0.8; // %20 indirim
            }

            System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL");
        }

    }
}

