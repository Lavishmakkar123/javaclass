import java.util.Scanner;

public class AssignmentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value");
        int a = sc.nextInt();

        if (a > 10) {
            System.out.println("a is greater than 10");
        } else if (a < 0) {
            System.out.println("a is lesser than 0");
        } else if (a == 0) {
            System.out.println("a is zero");
        } else if (a > 0) {
            System.out.println("a is greaten than 0");

        }
    }
}
