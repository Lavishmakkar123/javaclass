import java.util.Scanner;

public interface PrimitiveDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = sc.nextDouble();
        double π = 3.14;
        double mul =  π * radius * radius;
        System.out.println(mul);

    }
}


