package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class Affectation<V> extends Instruction{

    private String ID;

    private String type;
    private final V value;
    // Affect a value to a VarDecl.
    public Affectation (String ID,String type,V value) {
        this.ID = ID;
        this.value = value;
        this.type = type;
    }

    public Object getValue() {return value;}

    // for the purpose of the evaluation of the program while printing the symbols table @Override
    public String toString() {
        return "Affectation{" + "ID=" + ID + ", value=" + value + '}' ;
    }


    @Override
    public Object accept(ArrayOperationGrammarVisitor<?> visitor) {
        return visitor.visit(this);
    }

    public String getID() {return ID;}

    public String getType() {return type;}
}
