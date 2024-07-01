package EvaluationWithVisitor;

import model.*;

public interface ArrayOperationGrammarVisitor<R> {

    R visit(SimpleOp simpleOp);
    R visit(VarDecl varDecl);
    R visit(Affectation Affectation);

    R visit(VarOut vVarOut);
    R visit(Program program);
    R visit(Max max);
    R visit(Min min);
    R visit(Prod prod);
    R visit(Sort sort);
    R visit(Sum sum);
}
