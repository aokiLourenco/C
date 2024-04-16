package Ex107;

import Ex107.Tree;
import Ex107.Close;

public class e107 {

    public static void main (String[] args) {
        Tree expressionTree;
        Close inputProvider = new Close();
        
        if (!(expressionTree = new Tree(inputProvider)).isValid ) {
            System.err.println("ERROR: invalid prefix expression!");
            System.exit(1);
        }

        expressionTree.printExpression();
        System.out.println(" = " + expressionTree.evaluate());
    }
}