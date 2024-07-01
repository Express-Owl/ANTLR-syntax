package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.*;

import java.util.ArrayList;

public class AntlrToSimpleOp extends ArrayOperationBaseVisitor<SimpleOp> {

    SymbolTableManager symbolTableManager;
    public AntlrToSimpleOp(SymbolTableManager symbolTableManager) {
        this.symbolTableManager = symbolTableManager;
    }

    @Override
    public SimpleOp visitMin(ArrayOperationParser.MinContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        ArrayList<Integer> array = arrayVisitor.visit(ctx.getChild(1));
        Min min = new Min();
        min.setData(array);

        return min;
    }

    @Override
    public SimpleOp visitSum(ArrayOperationParser.SumContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        ArrayList<Integer> array = arrayVisitor.visit(ctx.getChild(1));

        Sum sum = new Sum();
        sum.setData(array);

        return sum;
    }

    @Override
    public SimpleOp visitProd(ArrayOperationParser.ProdContext ctx) {

        AntlrToArray arrayVisitor = new AntlrToArray();
        ArrayList<Integer> array = arrayVisitor.visit(ctx.getChild(1));

        Prod prod = new Prod();
        prod.setData(array);

        return prod;
    }

    @Override
    public SimpleOp visitMax(ArrayOperationParser.MaxContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        ArrayList<Integer> array = arrayVisitor.visit(ctx.getChild(1));

        Max max = new Max();
        max.setData(array);

        return max;
    }

    @Override
    public SimpleOp visitSort(ArrayOperationParser.SortContext ctx) {
        AntlrToArray arrayVisitor = new AntlrToArray();
        ArrayList<Integer> array = arrayVisitor.visit(ctx.getChild(1));

        Sort sort = new Sort();
        sort.setData(array);

        return sort;
    }

    public SimpleOp visitConcat(ArrayOperationParser.ConcatContext ctx) {
        AntlrToConcat concatVisitor = new AntlrToConcat(symbolTableManager);
        return concatVisitor.visit(ctx.getChild(1));
    }
}
