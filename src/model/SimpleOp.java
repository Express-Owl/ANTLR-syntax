package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

import java.util.ArrayList;

/**
 * Root class for simple operations
 */
public abstract class SimpleOp extends Instruction{

    // operator not needed because instruction name tells the name of the operator
    // array the operation is performed on
    private ArrayList<Integer> data;
    private String type;

    public SimpleOp() {
        data = new ArrayList<>();
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public String getType() { return type; }

    public void setType(String type) {
        this.type = type;
    }

    public abstract Object accept(ArrayOperationGrammarVisitor<?> visitor);
}
