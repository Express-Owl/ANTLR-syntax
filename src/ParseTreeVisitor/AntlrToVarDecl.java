package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import Evaluation.Variable;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.VarDecl;

public class AntlrToVarDecl extends ArrayOperationBaseVisitor<VarDecl> {

    private final SymbolTableManager symbolTable;

    public AntlrToVarDecl(SymbolTableManager symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public VarDecl visitVararray(ArrayOperationParser.VararrayContext ctx) {
        VarDecl varDecl = new VarDecl<>(ctx.getChild(1).getText(),ctx.getChild(0).getText());
        Variable var = new Variable<>(ctx.getChild(1).getText(),ctx.getChild(0).getText());
        symbolTable.addSymbol(var);
        return varDecl;
    }

    @Override
    public VarDecl visitInitvararray(ArrayOperationParser.InitvararrayContext ctx) {
        AntlrToArray antlrToArray = new AntlrToArray();
        VarDecl varDecl = new VarDecl<>(ctx.getChild(1).getText(),ctx.getChild(0).getText(),antlrToArray.visit(ctx.getChild(3)));
        Variable var = new Variable<>(ctx.getChild(1).getText(),ctx.getChild(0).getText(),antlrToArray.visit(ctx.getChild(3)));
        symbolTable.addSymbol(var);
        return varDecl;
    }

    @Override
    public VarDecl visitVarint(ArrayOperationParser.VarintContext ctx) {
        VarDecl varDecl = new VarDecl<>(ctx.getChild(1).getText(),ctx.getChild(0).getText());
        Variable var = new Variable<>(ctx.getChild(1).getText(),ctx.getChild(0).getText());
        symbolTable.addSymbol(var);
        return varDecl;
    }

    @Override
    public VarDecl visitInitvarint(ArrayOperationParser.InitvarintContext ctx) {
        VarDecl varDecl = new VarDecl<>(ctx.getChild(1).getText(),ctx.getChild(0).getText(),ctx.getChild(3));
        Variable var = new Variable<>(ctx.getChild(1).getText(),ctx.getChild(0).getText());
        symbolTable.addSymbol(var);
        return varDecl;
    }
}
