package Week1;
import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[] args) {
        //Scenner sınıfımızı ekleyelim.
        Scanner girdi = new Scanner(System.in);

        //Değişkenlerimizi oluşturalım.
        int a, b, c;

        //Karşıdan sayılarımızı alalım.
        System.out.print("1.Sayıyı giriniz: ");
        a = girdi.nextInt();
        System.out.print("2.Sayıyı giriniz: ");
        b = girdi.nextInt();
        System.out.print("3.Sayıyı giriniz: ");
        c = girdi.nextInt();

        if (a<b && a<c){
            if (b<c){
                System.out.println("a<b<c"+" "+"'dir");
            }else {
                System.out.println("a<c<b"+" "+"'dir");
            }
        } else if (b<a && b<c){
            if (a<c){
                System.out.println("b<a<c"+" "+"'dir");
            }else {
                System.out.println("b<c<a"+" "+"'dir");
            }
        }else {
            if (a<b){
                System.out.println("c<a<b"+" "+"'dir");
            }else {
                System.out.println("c<b<a"+" "+"'dir");
            }
        }



    }
}
