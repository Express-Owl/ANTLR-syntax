package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import Evaluation.Variable;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.Affectation;
import model.SimpleOp;

public class AntlrToAffectation extends ArrayOperationBaseVisitor<Affectation> {

    private SymbolTableManager symbolTableManager;
    public AntlrToAffectation(SymbolTableManager symbolTableManager) {
        this.symbolTableManager = symbolTableManager;
    }

    @Override
    public Affectation visitAffectsimpleop(ArrayOperationParser.AffectsimpleopContext ctx) {
        AntlrToSimpleOp antlrToSimpleOp = new AntlrToSimpleOp(symbolTableManager);
        SimpleOp operation = antlrToSimpleOp.visit(ctx.getChild(2));
        Variable var = new Variable<>(ctx.getChild(0).getText(),operation.getType(),operation.getData());
        symbolTableManager.checkForSymbolExistance(ctx.getChild(0).getText());
        symbolTableManager.checkForSimilarType(var);
        return new Affectation<>(ctx.getChild(0).getText(),operation.getType(),operation.getData());
    }

    @Override
    public Affectation visitAffectarray(ArrayOperationParser.AffectarrayContext ctx) {
        AntlrToArray antlrToArray = new AntlrToArray();
        Variable var = new Variable<>(ctx.getChild(0).getText(),"array",antlrToArray.visit(ctx.getChild(2)));
        symbolTableManager.checkForSymbolExistance(ctx.getChild(0).getText());
        symbolTableManager.checkForSimilarType(var);
        return new Affectation<>(ctx.getChild(0).getText(),"array",antlrToArray.visit(ctx.getChild(2)));
    }


    @Override
    public Affectation visitAffectint(ArrayOperationParser.AffectintContext ctx) {
        Variable var = new Variable<>(ctx.getChild(0).getText(),"int",ctx.getChild(2));
        symbolTableManager.checkForSymbolExistance(ctx.getChild(0).getText());
        symbolTableManager.checkForSimilarType(var);
        return new Affectation<>(ctx.getChild(0).getText(),"int",ctx.getChild(2));
    }
}
