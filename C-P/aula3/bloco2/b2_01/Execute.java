@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      for (int i = 0; i < ctx.ID().size(); i++) {
         res = ctx.ID().get(i).getText();
         System.out.println("Hello " + res);
      }
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      String res = null;
      for (int i = 0; i < ctx.ID().size(); i++) {
         res = ctx.ID().get(i).getText();
         System.out.println("Bye " + res);
      }
      return visitChildren(ctx);
      //return res;
   }
}
