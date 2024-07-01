package Evaluation;

import model.Affectation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class SymbolTableManager {

    private HashMap<String, Variable> symbolTable = new HashMap<>();
    private List<String> semanticErrors = new ArrayList<>();
    private int currentLine;

    public SymbolTableManager(){}

    public void modifySymbol(Affectation affectation) {
        Variable var = new Variable<>(affectation.getID(),affectation.getType(), affectation.getValue().toString());
        if(checkForSymbolExistance(affectation.getID()) && checkForSimilarType(var)) {
            symbolTable.put(affectation.getID(),var);
        }
    }

    public void addSymbol(Variable var) {
        if(! symbolTable.containsKey(var.getID())) {
            symbolTable.put(var.getID(),var);
        } else {
            semanticErrors.add("Semantic error at command line "+ currentLine +" on variable declaration : '" + addAlreadyExistError(var.getID()));
        }
    }

    public boolean checkForSymbolExistance(String id) {
        if(symbolTable.containsKey(id)) {
            return true;
        } else {
            semanticErrors.add("Semantic error at command line "+ currentLine +"  on variable affectation : '" + addNotExistError(id));
            return false;
        }
    }

    public boolean checkForSimilarType(Variable var) {
        String varID = var.getID();
        String varType = var.getType();
        String typeInTable = symbolTable.get(varID).getType();
        if(Objects.equals(typeInTable, varType)) {
            return true;
        } else {
            semanticErrors.add("Semantic error at command line "+ currentLine +" on variable affectation :" + addInvalidTypeSemanticError(var));
            return false;
        }
    }

    public String addNotExistError(String id) {
        return id + "' does not exists";
    }

    public String addAlreadyExistError(String id) {
        return id + "' already exists";
    }

    public String addInvalidTypeSemanticError(Variable var) {
        String varID = var.getID();
        String varType = var.getType();
        String typeInTable = symbolTable.get(varID).getType();
        return " '" + varID + "' has type " + typeInTable + ", trying to affect " + varType + ".";
    }

    public HashMap<String, Variable> getSymbolTable() {
        return symbolTable;
    }

    public List<String> getSemanticErrors() {
        return semanticErrors;
    }
    
    public int getCurrentLine() { return currentLine;}

    public void setCurrentLine(int i) {
        this.currentLine = i;
    }

}
