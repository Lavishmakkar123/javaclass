import java.util.Scanner;

public class javaaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        while (input != 5){
            System.out.println("enter value");
             input = sc.nextInt();
            System.out.println("user input:" + input);
        }
    }
}
