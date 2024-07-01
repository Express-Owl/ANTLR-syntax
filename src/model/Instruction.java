package model;

import EvaluationWithVisitor.ArrayOperationGrammarVisitor;

/**
 * In case several types of instruction are developed
 */
public abstract class Instruction {
    public abstract Object accept(ArrayOperationGrammarVisitor<?> visitor);
    //public abstract R accept(ArrayOperationGrammarVisitor<?> visitor);
}
