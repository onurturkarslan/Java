package Week2;

public class Frequencies {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};

        // Frekansları hesapla
        int[] frequencies = new int[101]; // Dizi boyutu, dizideki maksimum değere göre ayarlandı
        for (int num : array) {
            frequencies[num]++;
        }

        // Sonuçları yazdır
        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > 0) {
                System.out.println(i + " sayısı " + frequencies[i] + " kere tekrar edildi.");
            }
        }
    }
}
