package File;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        try (FileInputStream fin = new FileInputStream("D:\\demo.txt")) {

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc dữ liệu từ file");
        }
    }
}
