import java.util.Scanner;

public class AgeStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Congrats, you are eligible for driving");
        } else {
            System.out.println("Oops, you are not eligible for driving");
        }
    }
}