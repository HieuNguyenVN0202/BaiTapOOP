package File;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\test.txt"))) {

            String string = "Minecraft is the best";
            writer.write(string);
            System.out.println("Ghi dữ liệu vào file thành công");
        } catch (IOException e) {
            System.out.println("Lỗi không ghi đc dữ liệu vào file");
        }
    }
}
