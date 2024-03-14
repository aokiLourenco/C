@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(SuffixCalculatorParser.StatContext ctx) {
      Integer res = null;
      System.out.println(visit(ctx.expr()));
      return res;
   }

   @Override public Integer visitExpr(SuffixCalculatorParser.ExprContext ctx) {
      Integer res = null;
      
      e1 = visit(ctx.op(0));
      e2 = visit(ctx.op(1));

      switch (ctx.op(2).getText()) {
         case "+":
            
            break;
      
         default:
            break;
      }

      return res;
   }
}
