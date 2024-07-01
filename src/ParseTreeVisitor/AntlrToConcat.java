package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import Evaluation.Variable;
import antlr.ArrayOperationParser;
import model.Concat;
import model.Instruction;
import model.SimpleOp;

import java.util.ArrayList;
import java.util.Collection;

public class AntlrToConcat extends AntlrToSimpleOp {
    private SymbolTableManager symbolTableManager;

    public AntlrToConcat(SymbolTableManager symbolTableManager) {
        super(symbolTableManager);
        this.symbolTableManager = symbolTableManager;
    }

    @Override public Concat visitConcatwithid(ArrayOperationParser.ConcatwithidContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        Concat concat = new Concat();
        ArrayList<Integer> value = new ArrayList<>();
        Variable var;
        for (int i = 0; i < ctx.getChildCount(); i+=2) {
            var = symbolTableManager.getSymbolTable().get(ctx.getChild(i));
            if (var.getType().equals("array")) {
                value.addAll((Collection<? extends Integer>) var.getValue());
            } else {
                symbolTableManager.addInvalidTypeSemanticError(var);
            }
        }
        return concat;
    }

    @Override public Concat visitConcatwitharray(ArrayOperationParser.ConcatwitharrayContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        Concat concat = new Concat();
        return concat;
    }
}
