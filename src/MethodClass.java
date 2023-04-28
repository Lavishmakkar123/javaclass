import java.util.Scanner;

public class MethodClass{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        dosum(a,b);

    }
    static int dosum(int a,int b){
        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("sum is even");
        } else {
            System.out.println("sum is odd");
        } return sum;
    }
}
