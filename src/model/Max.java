package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class Max extends SimpleOp {
    public Max() {
        super();
        setType("int");
    }

    @Override
    public Integer accept(ArrayOperationGrammarVisitor<?> visitor) {
        return (Integer) visitor.visit(this);
    }


    @Override
    public String toString() {
        return "max " + this.getData().toString();
    }
}
