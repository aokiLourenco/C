import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {

        Stack<Double> numberStack = new Stack<>();

        while(scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                numberStack.push(scanner.nextDouble());
            } else {
                double result = 0.0;
                String operator;
                String input;
                if (!(input = operator = scanner.next()).equals("+") && !input.equals("-") && !input.equals("*") && !input.equals("/")) {
                    System.err.println("ERROR: invalid operator!");
                    System.exit(1);
                }

                if (numberStack.isEmpty()) {
                    System.err.println("ERROR: two operands missing!");
                    System.exit(2);
                }

                double operand1 = numberStack.peek();
                numberStack.pop();
                if (numberStack.isEmpty()) {
                    System.err.println("ERROR: one operand missing!");
                    System.exit(3);
                }

                double operand2 = numberStack.peek();
                numberStack.pop();
                if (operator.equals("+")) {
                    result = operand2 + operand1;
                } else if (operator.equals("-")) {
                    result = operand2 - operand1;
                } else if (operator.equals("*")) {
                    result = operand2 * operand1;
                } else if (operator.equals("/")) {
                    if (operand1 == 0.0) {
                        System.err.println("ERROR: divide by zero!");
                        System.exit(4);
                    }

                    result = operand2 / operand1;
                }

                numberStack.push(result);
            }

            if (numberStack.isEmpty()) {
                throw new AssertionError();
            }

            System.out.print("Stack: ".concat(String.valueOf(numberStack)));
            System.out.println();
        }
    }

    static {
        scanner = new Scanner(System.in);
    }
}