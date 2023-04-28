import java.util.Scanner;

public class Calculatorwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = 0;

        boolean flag = true;
        do {

            System.out.println("Press 1 for Sum");
            System.out.println("Press 2 for Sub");
            System.out.println("Press 3 for Multiply");
            System.out.println("Press 4 for Divide");
            System.out.println("Press 5 for Exit");
            operator = sc.nextInt();

            switch (operator) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    System.out.println(a / b);
                    break;
                case 5:
                    System.out.println("Are you sure you want to exit. Press (5) to exit or any other input to continue");
                    operator = sc.nextInt();
                    break;
                default:
                    System.out.println("incorrect  operator");
                    break;
            }
        } while (operator != 5);
    }
}




