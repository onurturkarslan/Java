package Week6.Java.Numbers;

import java.io.*;

public class SumNumbersFromFile {
    public static void main(String[] args) {

        String data = "5\n10\n20\n12\n33\n";
        try {
            FileWriter fWriter = new FileWriter("numbers2.txt", false);
            BufferedWriter bWriter = new BufferedWriter(fWriter);
            bWriter.write(data);
            bWriter.close();

            FileReader fReader = new FileReader("numbers2.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            int sum = 0;
            while ((line = bReader.readLine()) != null){
                try {
                    int num = Integer.parseInt(line);
                    sum += num;
                    System.out.println("Okunan değer :" + num);

                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }

            }
            System.out.println("Sonuç :" + sum);
            bReader.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
