package File;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        try (FileOutputStream fout = new FileOutputStream("D:\\demo.txt")) {

            String content = "Welcome to .....";
            byte[] bytes = content.getBytes();
            fout.write(bytes);
            System.out.println("Ghi dữ liệu vào file thành công !");
        } catch (IOException e) {
            System.out.println("Lỗi khi thực hiện ghi dữ liệu vào file");
        }
    }
}
