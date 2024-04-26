package Week1;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = girdi.nextInt();

        int cinZodyagi = dogumYili % 12;

        if (cinZodyagi == 0) {
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (cinZodyagi == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (cinZodyagi == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (cinZodyagi == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (cinZodyagi == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (cinZodyagi == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (cinZodyagi == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (cinZodyagi == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (cinZodyagi == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (cinZodyagi == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (cinZodyagi == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }


    }
}
