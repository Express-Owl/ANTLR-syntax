package ParseTreeVisitor;

import Evaluation.SymbolTableManager;
import antlr.ArrayOperationBaseVisitor;
import antlr.ArrayOperationParser;
import model.Instruction;

public class AntlrToInstruction extends ArrayOperationBaseVisitor<Instruction> {

    private SymbolTableManager symbolTableManager;

    public AntlrToInstruction(SymbolTableManager symbolTableManager) {
        this.symbolTableManager = symbolTableManager;
    }

    @Override
    public Instruction visitSimpleopinstruction(ArrayOperationParser.SimpleopinstructionContext ctx) {
        AntlrToSimpleOp simpleOpVisitor = new AntlrToSimpleOp(symbolTableManager);

        return simpleOpVisitor.visit(ctx.getChild(0));
    }
    @Override
    public Instruction visitVardeclinstruction(ArrayOperationParser.VardeclinstructionContext ctx) {
        AntlrToVarDecl varDelcVisitor = new AntlrToVarDecl(symbolTableManager);
        return varDelcVisitor.visit(ctx.getChild(0));
    }
    @Override
    public Instruction visitAffectationinstruction(ArrayOperationParser.AffectationinstructionContext ctx) {
        AntlrToAffectation affectationVisitor = new AntlrToAffectation(symbolTableManager);
        return affectationVisitor.visit(ctx.getChild(0));
    }
    @Override
    public Instruction visitVaroutinstruction(ArrayOperationParser.VaroutinstructionContext ctx) {
        AntlrToVarOut varOutVisitor = new AntlrToVarOut(symbolTableManager);
        return varOutVisitor.visit(ctx.getChild(0));
    }
}
