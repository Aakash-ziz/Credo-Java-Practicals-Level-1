import java.util.*;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Num : ");
        int a = scanner.nextInt();

        int factorial = 1;

        for (int i = 0; i <= a; i++) {
            if (i == 0) {
                System.out.println("Factorial of " + i + " is " + i);
                continue;
            }
            factorial *= i; 
            System.out.println("Factorial of " + i + " is " + factorial);
        }
        scanner.close();
    }
}
