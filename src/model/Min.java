package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class Min extends SimpleOp {
    public Min() {
        super();
        setType("int");
    }

    @Override
    public Integer accept(ArrayOperationGrammarVisitor<?> visitor) {
        return (Integer) visitor.visit(this);
    }

    @Override
    public String toString() {
        return "min " + this.getData().toString();
    }
}
