import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
        
        scanner.close();
    }
}
