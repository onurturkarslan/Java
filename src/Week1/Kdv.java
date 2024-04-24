package Week1;

import java.util.Scanner;


public class Kdv {
    public static void main(String[] args) {

        //Değişkeni oluşturduk.
        double para;
        double kdv = 0.18;

        //Scanner sınıfını tanımladık.
        Scanner girdi = new Scanner(System.in);

        para = girdi.nextInt();

        double sonuc = (para * kdv) + para;
        System.out.println(sonuc);
    }

}
