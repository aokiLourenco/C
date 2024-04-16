import java.io.*;
import java.util.*;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
@SuppressWarnings("CheckReturnValue")

public class Numbers extends NumbersBaseListener {

   private Map<String, Integer> numbers = ;

   @Override public void enterFile(NumbersParser.FileContext ctx) {
   }

   @Override public void exitFile(NumbersParser.FileContext ctx) {
   }

   @Override public void enterLine(NumbersParser.LineContext ctx) {
   }

   @Override public void exitLine(NumbersParser.LineContext ctx) {
      
   }


   @Override public void enterEveryRule(ParserRuleContext ctx) {
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
