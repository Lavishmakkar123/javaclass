import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user name");
        String user = sc.next();
        switch (user) {
            case "Lavishmakkar":
                System.out.println("Your password is Lavish");
                break;
            case "Tanyakaur":
                System.out.println("Your password is Tanya");
                break;
            case "Sorb":
                System.out.println("Your password is sorb");
                break;
            default:
                System.out.println("Invalid username");
                break;
        }
    }
}
