import java.util.HashMap;

@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorGrammarBaseVisitor<Integer> {

   private HashMap<String, Integer> memory = new HashMap<>();

   @Override public Integer visitProgram(CalculatorGrammarParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorGrammarParser.StatContext ctx) {
      Integer res = null;

      if (ctx.expr() != null) {
         res = visit(ctx.expr());
      }
      else if (ctx.assignment() != null) {
         res = visit(ctx.assignment());
      }

      System.out.println(res);
      return res;
   }

   @Override public Integer visitAssignID(CalculatorGrammarParser.AssignIDContext ctx) {
      Integer res = visit(ctx.expr());
      String id = ctx.ID().getText();
      this.memory.put(id, res);
      return res;
   }

   @Override public Integer visitExprAddSub(CalculatorGrammarParser.ExprAddSubContext ctx) {
      Integer res = null;

      int e1 = visit(ctx.expr(0));
      int e2 = visit(ctx.expr(1));

      switch (ctx.op.getText()) {
         case "+":
            res = e1 + e2;
            break;
         
         case "-":
            res = e1 - e2;
            break;
      }
      return res;
   }

   @Override public Integer visitExprParent(CalculatorGrammarParser.ExprParentContext ctx) {
      Integer res = visit(ctx.expr());
      return res;
   }

   @Override public Integer visitExprInteger(CalculatorGrammarParser.ExprIntegerContext ctx) {
      Integer res = Integer.parseInt(ctx.Integer().getText());
      return res;
   }

   @Override public Integer visitExprID(CalculatorGrammarParser.ExprIDContext ctx) {
      Integer res = this.memory.get(ctx.ID().getText());
      return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorGrammarParser.ExprMultDivModContext ctx) {
      Integer res = null;
      
      int e1 = visit(ctx.expr(0));
      int e2 = visit(ctx.expr(1));

      switch (ctx.op.getText()) {
         case "*":
            res = e1 * e2;
            break;
      
         case "/":
            res = e1 / e2;
            break;
         
         case "%":
            res = e1 % e2;
            break;

         }
      return res;
   }
}
