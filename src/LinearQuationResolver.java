import java.util.Scanner;

public class LinearQuationResolver {
    public static void main(String[] args) {
        System.out.println("LinearQuationResolver");
        System.out.println("Given a equation as'a*x+b=0'");
        Scanner sc = new Scanner(System.in);
        System.out.println("a= ");
        double a = sc.nextDouble();
        System.out.println("b= ");
        double b = sc.nextDouble();
        if (a == 0) {
            System.out.println("No solution");
        } else {
            if (a != 0) {
                double solution = -b / a;
                System.out.printf("The solution is:%f!", solution);
            } else {
                if (b == 0)
                    System.out.println("The solution is all x!");
            }
        }
    }
}
