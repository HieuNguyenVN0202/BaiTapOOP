package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"))) {

            String data;
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("Lỗi không đọc đc dữ liệu từ file");
        }
    }
}
