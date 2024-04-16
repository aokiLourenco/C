import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class CSVtoHTML extends CSVBaseVisitor<ST> {
   
   private STGroup templates = new STGroupFile("html.stg");

   @Override public ST visitProgram(CSVParser.ProgramContext ctx) {
      ST st = templates.getInstanceOf("XmlMultiline");
      st.add ("tag", "table");
      st.add ("entry", "CENAS");
      return st;
      //return st;
   }

   @Override public ST visitStat(CSVParser.StatContext ctx) {
      ST st = null;
      return visitChildren(ctx);
      //return st;
   }

   @Override public ST visitLine(CSVParser.LineContext ctx) {
      ST st = null;
      return visitChildren(ctx);
      //return st;
   }

   @Override public ST visitField(CSVParser.FieldContext ctx) {
      ST st = null;
      return visitChildren(ctx);
      //return st;
   }
}
