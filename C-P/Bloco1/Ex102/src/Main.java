import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> variables = new HashMap<>();

        System.out.println("Enter an expression (e.g., n = 10; 4 * n; n = n + 1; n + 5):");
        String input = scanner.nextLine();

        String[] statements = input.split(";");

        scanner.close();

        for (String statement : statements) {
            String[] parts = statement.split("\\s*=\\s*");
            if (parts.length == 2) {
                String varName = parts[0].trim();
                double varValue = evaluateExpression(parts[1].trim(), variables);
                variables.put(varName, varValue);
            } else {
                double result = evaluateExpression(statement.trim(), variables);
                System.out.println(" = " + result);
            }
        }
    }

    private static double evaluateExpression(String expression, HashMap<String, Double> variables) {
        String[] parts = expression.split("\\s+");
        double result = 0;

        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];

            if (part.matches("[+\\-*/]")) {
                continue;
            }

            if (variables.containsKey(part)) {
                parts[i] = Double.toString(variables.get(part));
            }
        }

        String joinedExpression = String.join(" ", parts);
        String[] expressionParts = joinedExpression.split("\\s+");
        result = Double.parseDouble(expressionParts[0]);

        for (int i = 1; i < expressionParts.length - 1; i += 2) {
            String operator = expressionParts[i];
            double operand = Double.parseDouble(expressionParts[i + 1]);

            switch (operator) {
                case "+":
                    result += operand;
                    break;
                case "-":
                    result -= operand;
                    break;
                case "*":
                    result *= operand;
                    break;
                case "/":
                    if (operand != 0) {
                        result /= operand;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        return Double.NaN;
                    }
                    break;
                default:
                    System.err.println("Invalid operator");
                    return Double.NaN;
            }
        }

        return result;
    }
}
