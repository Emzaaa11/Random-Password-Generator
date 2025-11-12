import java.util.Random;

public class PasswordGenerator {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder pass = new StringBuilder();
        Random r = new Random();

        for(int i = 0; i < 8; i++) {
            pass.append(chars.charAt(r.nextInt(chars.length())));
        }

        System.out.println("Password: " + pass);
    }
}
