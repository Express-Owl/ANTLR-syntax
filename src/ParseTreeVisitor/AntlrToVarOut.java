package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.VarOut;

public class AntlrToVarOut extends ArrayOperationBaseVisitor<VarOut> {

    private final SymbolTableManager symbolTable;

    public AntlrToVarOut(SymbolTableManager symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public VarOut visitVarout(ArrayOperationParser.VaroutContext ctx) {
        symbolTable.checkForSymbolExistance(ctx.getChild(0).getText());
        return new VarOut(ctx.getChild(0).getText());
    }

}
