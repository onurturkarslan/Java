package Week6.Java.Notepad;

import java.io.*;
import java.util.Scanner;


public class NotepadApp {
    public static void main(String[] args) {
        // Dosya ismi
        String fileName = "notlar.txt";

        // Dosyadan metni oku ve ekrana yazdır
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            System.out.println("Önceki metin:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı. Yeni bir dosya oluşturulacak.");
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası.");
        }

        // Kullanıcıdan metin girişi al
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        // Metni dosyaya yaz
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(metin);
            printWriter.close();
            System.out.println("Metin dosyaya kaydedildi.");
        } catch (IOException e) {
            System.out.println("Dosya yazma hatası.");
        }
    }
}
