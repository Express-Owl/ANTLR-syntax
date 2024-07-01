package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class Sum extends SimpleOp {

    public Sum() {

        super();
        setType("int");
    }

    @Override
    public Integer accept(ArrayOperationGrammarVisitor<?> visitor) {
        return (Integer) visitor.visit(this);
    }


    @Override
    public String toString() {
        return "sum " + this.getData().toString();
    }
}
