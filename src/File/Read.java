package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream("D:\\example.txt"))) {

            int data;
            while ((data = bin.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc dữ liệu");
        }
    }
}
