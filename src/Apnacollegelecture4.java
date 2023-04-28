import java.util.Scanner;

public class Apnacollegelecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = sc.nextInt();
        for (int i = 1; i <= even; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}