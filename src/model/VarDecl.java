package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

public class VarDecl<V> extends Instruction{

    private final String ID;
    private final String type;
    private V value;
    // construct a VarDecl without initialisation
    public VarDecl (String ID, String type) {
        this.ID = ID;
        this.type = type;
    }
    // construct a VarDecl with initialisation
    public VarDecl(String ID, String type, V value) {
        this.ID = ID;
        this.type = type; // int or array
        this.value = value;
    }
    public String getID() {
        return ID;
    }
    public String getType() { return type; }
    public V getValue() { return value; }
    // for the purpose of the evaluation of the program while printing the symbols table @Override
    public String toString() {
        return "VarDecl{" + "ID=" + ID + ", type=" + type + ", value=" + value + '}' ;
    }


    @Override
    public Object accept(ArrayOperationGrammarVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
