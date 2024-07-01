package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.Program;

public class AntltToProgram extends ArrayOperationBaseVisitor<Program> {
    private final SymbolTableManager symbolTable;

    public AntltToProgram(SymbolTableManager symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Program visitProgram(ArrayOperationParser.ProgramContext ctx) {
        Program prog = new Program();

        AntlrToInstruction instructionVisitor = new AntlrToInstruction(symbolTable);

        for (int i = 0; i < ctx.getChildCount()-1; i++) {
            symbolTable.setCurrentLine(i+1);
            prog.addInstruction(instructionVisitor.visit(ctx.getChild(i)));
        }

        return prog;
    }
}
