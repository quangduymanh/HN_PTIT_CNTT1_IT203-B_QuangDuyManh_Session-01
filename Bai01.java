package Session01;
import java.util.Scanner;
public class Bai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nhap nam sinh: ");
            String namSinhStr = sc.nextLine();
            int namSinh = Integer.parseInt(namSinhStr);
            int tuoi = 2026 - namSinh;
            System.out.println("Tuoi cua ban la: " + tuoi);
        } catch (NumberFormatException e) {
            System.out.println("Loi: Ban phai nhap nam sinh bang so!");
        } finally {
            sc.close();
            System.out.println("Thuc hien don dep tai nguyen trong finally");
        }
    }
}