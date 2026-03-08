package Session01;
import java.io.IOException;
public class Bai04 {
    // Method C
    public static void saveToFile() throws IOException {
        // giả lập lỗi ghi file
        throw new IOException("Loi khi ghi file!");
    }
    // Method B
    public static void processUserData() throws IOException {
        saveToFile(); // gọi method C
    }
    // Method A
    public static void main(String[] args) {

        try {
            processUserData(); // gọi method B
        } catch (IOException e) {
            System.out.println("Da bat loi: " + e.getMessage());
        }

        System.out.println("Chuong trinh tiep tuc chay.");
    }
}