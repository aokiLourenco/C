import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double input2, input1, result;
        char op;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an expression (e.g., 2 + 2):");
        String input = scanner.nextLine();

        String[] parts = input.split("\\s+"); // Split input by whitespace
        if (parts.length != 3) {
            System.out.println("Invalid input format!");
            return;
        }

        input1 = Double.parseDouble(parts[0]);
        input2 = Double.parseDouble(parts[2]);

        op = parts[1].charAt(0);
        result = 0;

        switch (op) {
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '/':
                if (input2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = input1 / input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            default:
                System.err.println("Wrong operator");
        }

        System.out.println(" = " + result);
    }
}