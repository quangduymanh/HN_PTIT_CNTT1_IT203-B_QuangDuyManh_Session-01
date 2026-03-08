package Session01.Baithuchanh;
import java.io.FileNotFoundException;
public class UserService {
    public static String registerUser(String name, String ageInput, String email)
            throws InvalidAgeException, InvalidEmailException {
        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (NumberFormatException e) {
            throw e;
        }
        if (age < 18) {
            throw new InvalidAgeException("Loi nghiep vu: Tuoi khong du de dang ky he thong.");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Loi nghiep vu: Email khong hop le.");
        }
        return "Ten: " + name + ", Tuoi: " + age + ", Email: " + email;
    }
    public static void saveUserToFile(String userData) throws FileNotFoundException {
        throw new FileNotFoundException("Khong tim thay file luu tru.");

    }
}