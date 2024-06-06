package Week6.Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumNumbersFromFile {
    public static void main(String[] args) {
        String fileName = "numbers.txt";
        int sum = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Her satırdaki sayıyı int'e dönüştürüp toplama ekleyelim
                int number = Integer.parseInt(line);
                sum += number;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Toplamı ekrana yazdıralım
        System.out.println("Toplam: " + sum);
    }
}
