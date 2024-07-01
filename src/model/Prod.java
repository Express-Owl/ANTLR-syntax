package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class Prod extends SimpleOp {
    public Prod() {

        super();
        setType("int");
    }

    @Override
    public Integer accept(ArrayOperationGrammarVisitor<?> visitor) {
        return (Integer) visitor.visit(this);
    }


    @Override
    public String toString() {
        return "prod " + this.getData().toString();
    }

}
