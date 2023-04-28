import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username");
        String password = sc.next();

        switch(password) {
            case "Tom123":
                System.out.println("password is Tomy");
                break;
            case "Lavish123":
                System.out.println("Password is Lavish");
                break;
            case "Makkar123":
                System.out.println("Password is makkar");
                break;
            default:
                System.out.println("Invalid username");
                break;
        }


    }
}
