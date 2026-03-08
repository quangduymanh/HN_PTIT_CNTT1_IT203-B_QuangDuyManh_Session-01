package Session01.Baithuchanh;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.print("Nhap tuoi: ");
            String age = scanner.nextLine();
            System.out.print("Nhap email: ");
            String email = scanner.nextLine();
            String userData = UserService.registerUser(name, age, email);
            System.out.println("Dang ky thanh cong!");
            System.out.println(userData);
            UserService.saveUserToFile(userData);

        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Tuoi phai la mot con so!");
        }
        catch (FileNotFoundException e) {
            System.out.println("Loi he thong: " + e.getMessage());
        }
        finally {
            System.out.println("Hoan tat luong xu ly dang ky.");
            scanner.close();
        }
    }
}