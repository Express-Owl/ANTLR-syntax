package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class VarOut<V> extends Instruction {

    private final String ID;
    // construct a varOut from an id
    public VarOut (String ID) {
        this.ID = ID;
    }

    // for the purpose of the evaluation of the program while printing the symbols table @Override
    public String toString() {
        return "VarOut{" + "ID=" + ID + "} ";
    }


    @Override
    public Object accept(ArrayOperationGrammarVisitor<?> visitor) {
        return visitor.visit(this);
    }

    public String getID() { return ID;}
}
