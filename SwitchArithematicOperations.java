import java.util.*;

public class SwitchArithematicOperations {
    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the secound number: ");
        int b = scanner.nextInt();

        System.out.println("Enter the operation \n a = Add \n b = Sub \n c = Mul \n d = Div");
        String operation = scanner.next();

        switch (operation) {
            case "a":
                result = a + b;
                System.out.println("Result: "+ result);
                break;
            case "b":
                result = a - b;
                System.out.println("Result: "+ result);
                break;
            case "c":
                result = a * b;
                System.out.println("Result: "+ result);
                break;
            case "d":
                result = a / b;
                System.out.println("Result: "+ result);
                break;
            default:
                 System.out.println("Enter valid operation");
                break;
        }

        scanner.close();
    }
}
