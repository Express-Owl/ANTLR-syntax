package EvaluationWithVisitor;

import Evaluation.SymbolTableManager;
import Evaluation.Variable;
import model.*;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayOperationGrammarDoInterpretVisitor implements ArrayOperationGrammarVisitor<Object> {

    public SymbolTableManager symbolTable;
    public ArrayOperationGrammarDoInterpretVisitor(SymbolTableManager symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Object visit(SimpleOp simpleOp) {
        return simpleOp;
    }

    @Override
    public Object visit(VarDecl varDecl) {
        return varDecl.getValue();
    }

    public Object visit(Affectation affectation) {
        Variable var = symbolTable.getSymbolTable().get(affectation.getID());

        symbolTable.modifySymbol(affectation);
        return var;
    }

    public Object visit(VarOut varOut) {
        return symbolTable.getSymbolTable().get(varOut.getID());
    }

    @Override
    public String visit(Program program) {
        System.out.println("Symbol table before interpretation : \n" + symbolTable.getSymbolTable());
        System.out.println("Program interpretation: Begin");
        for (Instruction instruction : program.instructions) {
            // expression.accept(this) will trigger a call to the right visit method
            // output a line with the source code and the produced value (form accept()->visit())
            // for VariableDeclration Void is produced
            Object test = instruction.accept(this);
            System.out.println(instruction + " is " + instruction.accept(this));
        }
        System.out.println("Program interpretation: End");
        System.out.println("Symbol table after interpretation : \n" + symbolTable.getSymbolTable());
        return "";
    }

    @Override
    public Integer visit(Max max) {
        return Collections.max(max.getData());
    }

    @Override
    public Integer visit(Min min) {
        return Collections.min(min.getData());
    }

    @Override
    public Integer visit(Prod prod) {
        int result = 1;
        for(int num: prod.getData()) {
            result = result * num;
        }
        return result;
    }

    @Override
    public ArrayList<Integer> visit(Sort sort) {
        ArrayList<Integer> sortedData = (ArrayList<Integer>) sort.getData().clone();
        Collections.sort(sortedData);
        return sortedData;
    }

    @Override
    public Integer visit(Sum sum) {

        int result = 0;
        for(int num: sum.getData()) {
            result = result + num;
        }
        return result;
    }
}
