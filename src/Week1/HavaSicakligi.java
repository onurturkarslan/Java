package Week1;
import java.util.Scanner;
public class HavaSicakligi {
    public static void main(String[] args) {
        //Scenner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Değişkenlerimizi tanımlayalım.
        double sicaklik;

        //Sıcaklık değerimizi karşıdan alalım.
        System.out.print("Lütfen Hava Sıcaklığını Giriniz :");
        sicaklik = girdi.nextDouble();

        //Sıcaklığa göre koşullarımızı belirtelim.
        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsin...");
        } else if (sicaklik >=5 && sicaklik<= 15) {
            System.out.println("Sinemaya gidebilirsin...");
        } else if (sicaklik >15 && sicaklik <=25){
            System.out.println("Piknik yapabilirsin...");
        } else {
            System.out.println("Yüzmeye gidebilirsin...");
        }


    }
}
