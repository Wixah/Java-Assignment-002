/**
 *
 * @author Trevor Hartman
 * @author <Rachelle Iloff>
 *
 * @since Version 1.0
 *
 * created on 2023/01/29
 */
import java.util.Scanner;


public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please type the number of sides.");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n < 1) {
                break;
            }
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;
            System.out.printf("Our PI estimate is : %.10f%n", pi);
            System.out.print("True PI : ");
            System.out.println(pi);

        }
    }
}
