package Week1;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.printf("Yıl giriniz: ");
        int artikYil = girdi.nextInt();

        if ((artikYil % 4 == 0 && artikYil % 100 != 0) || (artikYil % 400 == 0)) {
              System.out.printf(artikYil + " " + "bir artık yıldır !");
        } else {
                System.out.printf(artikYil + " " + "bir artık yıl değildir !");
        }
    }
}