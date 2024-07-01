package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

import java.util.ArrayList;

public class Sort extends SimpleOp {

    public Sort() {
        super();
        setType("array");
    }

    @Override
    public ArrayList<Integer> accept(ArrayOperationGrammarVisitor<?> visitor) {
        return (ArrayList<Integer>) visitor.visit(this);
    }


    @Override
    public String toString() {
        return "sort " + this.getData().toString();
    }

}
