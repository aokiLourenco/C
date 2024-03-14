@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer res = null;
      System.out.println(visit(ctx.expr()));
      return res;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
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

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Integer res = visit(ctx.expr());
      return res;
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = Integer.parseInt(ctx.Integer().getText());
      return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
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
