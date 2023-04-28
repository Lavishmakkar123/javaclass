import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a==b) {
            System.out.println("Equal");
        } else if (a>b) {
            System.out.println("Greater than B");
        } else {
            System.out.println("Smaller than B");
            }
    }
}
