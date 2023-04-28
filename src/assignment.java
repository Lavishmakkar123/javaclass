import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("value :" + input);
        if (input > 10) {
            System.out.println("input is greater");
            } else if ( input == 0) {
            System.out.println("input is zero");
        } else if (input < 0) {
            System.out.println("input is negative");
        } else if (input > 0) {
            System.out.println("input is positve");
        } else {
            System.out.println("Invalid value");
        }
    }
}
