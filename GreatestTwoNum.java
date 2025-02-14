import java.util.Scanner;

public class GreatestTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        
        if (a > b) {
            System.out.print("a is greater than b");
        } else {
            System.out.print("b is greater than a");
        }
        
        scanner.close();
    }
}
