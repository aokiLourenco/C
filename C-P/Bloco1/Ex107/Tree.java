package Ex107;

import java.util.*;

import Ex107.Close;

class Tree {

    public static final Scanner sc = null;
    private Tree leftExpression;
    private Tree rightExpression;
    private String operator;
    private double value;

    boolean isValid;

    private static boolean isOperator(String symbol) {
        String[] operators = new String[]{"+", "-", "*", "/"};
        boolean isOperator = false;

        for (int i = 0; !isOperator && i < 4; i++) {
            isOperator = operators[i].equals(symbol);
        }

        return isOperator;
    }

    public Tree(Close arg) {
        super();

        this.leftExpression = null;
        this.rightExpression = null;
        this.operator = null;
        this.isValid = true;

        if (!sc.hasNext()) {
            this.isValid = false;
        } else {
            if (sc.hasNextDouble()) {
                this.value = sc.nextDouble();
                return;
            }

            this.operator = sc.next();
            this.leftExpression = new Tree(arg);
            this.rightExpression = new Tree(arg);
            if (isOperator(this.operator) && this.leftExpression.isValid && this.rightExpression.isValid) {
                this.isValid = true;
            } else {
                this.isValid = false;
            }
        }
    }

    public final void printExpression() {
        if (rightExpression.isValid && !this.isValid) {
            throw new AssertionError();
        } else if (this.operator == null) {
            System.out.print(this.value);
        } else {
            System.out.print("(");
            this.leftExpression.printExpression();
            System.out.print(this.operator);
            this.rightExpression.printExpression();
            System.out.print(")");
        }
    }

    public final double evaluate() {
        if (rightExpression.isValid && !this.isValid) {
            throw new AssertionError();
        } else {
            double result = 0.0;
            if (this.operator == null) {
                result = this.value;
            } else {
                double leftValue = this.leftExpression.evaluate();
                double rightValue = this.rightExpression.evaluate();
                if (this.operator.equals("+")) {
                    result = leftValue + rightValue;
                } else if (this.operator.equals("-")) {
                    result = leftValue - rightValue;
                } else if (this.operator.equals("*")) {
                    result = leftValue * rightValue;
                } else if (this.operator.equals("/")) {
                    result = leftValue / rightValue;
                }
            }

            return result;
        }
    }
}
