package Week2.Boxing;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        Ring r = new Ring(marc,alex , 90 , 100);


        // Başlangıcı %50 olasılıkla belirleme
        double randomValue = Math.random() * 100; // 0.0 to 99.9
        if (randomValue < 50) {
            System.out.println("Marc dövüşe başlıyor!");
            r.run();
        } else {
            System.out.println("Alex dövüşe başlıyor!");
            r.run();
        }
    }
}
