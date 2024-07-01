package ParseTreeVisitor;

import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;

import java.util.ArrayList;

public class AntlrToArray extends ArrayOperationBaseVisitor<ArrayList<Integer>> {

    public AntlrToArray() {}

    @Override
    public ArrayList<Integer> visitArray(ArrayOperationParser.ArrayContext ctx) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for(int i = 1; i < ctx.getChildCount(); i+=2 ) {
            intArray.add(Integer.valueOf(ctx.getChild(i).getText()));
        }
        return intArray;
    }
}
