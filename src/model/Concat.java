package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

import java.util.ArrayList;

public class Concat extends SimpleOp{


    public Concat(){
        super();
        setType("array");
    }

    @Override
    public Object accept(ArrayOperationGrammarVisitor<?> visitor) {
        return null;
    }

    public String toString() {
        return "concat " + this.getData().toString();
    }
}
