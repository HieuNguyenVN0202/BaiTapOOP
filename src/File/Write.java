package File;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        try (BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("D:\\example.txt"))) {
            String s = "Welcome to Java";
            byte[] bytes = s.getBytes();
            bout.write(bytes);
            System.out.println("Ghi dữ liệu vào file thành công");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi dữ liệu vào file");
        }
    }
}
