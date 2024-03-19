@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculator04BaseVisitor<Integer> {

   @Override public Integer visitProgram(SuffixCalculator04Parser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(SuffixCalculator04Parser.StatContext ctx) {
      Integer res = null;
      System.out.println(visit(ctx.expr()));
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitExprNumber(SuffixCalculator04Parser.ExprNumberContext ctx) {
      Integer res = Integer.parseInt(ctx.NUMBER().getText());
      return res;
   }

   @Override public Integer visitExprSuffix(SuffixCalculator04Parser.ExprSuffixContext ctx) {
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

         case "+":
            res = e1 + e2;
            break;

         case "-":
            res = e1 - e2;
            break;
      }
      return res;
   }
}
