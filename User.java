package Session01;
import java.io.IOException;
public class User {
    private String name;
    private int age;

    public User(String name) {
        this.name = name;
    }
    // Defensive Programming
    public void printName() {

        if (name != null) {
            System.out.println("Ten nguoi dung: " + name);
        } else {
            System.out.println("Ten nguoi dung chua duoc cap nhat.");
        }

    }
    public void setAge(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Tuoi khong the am!");
        }

        this.age = age;
    }
    public int getAge() {
        return age;
    }
    // Checked Exception
    public void saveToFile() throws IOException {

        throw new IOException("Loi khi ghi file nguoi dung!");

    }
    public static void main(String[] args) {
        User user = new User("Manh");
        user.printName();
        try {
            user.setAge(20);
            System.out.println("Tuoi: " + user.getAge());

            user.setAge(-5);
        } catch (InvalidAgeException e) {
            Logger.logError(e.getMessage());

        }
        try {

            user.saveToFile();
        } catch (IOException e) {
            Logger.logError(e.getMessage());

        }
        System.out.println("Chuong trinh van tiep tuc chay.");
    }
}