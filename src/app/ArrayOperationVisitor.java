package app;

import Evaluation.SymbolTableManager;
import EvaluationWithVisitor.ArrayOperationGrammarDoInterpretVisitor;
import antlr.ArrayOperationLexer;
import antlr.ArrayOperationParser;
import model.Program;
import ParseTreeVisitor.AntltToProgram;
import Utils.SyntaxErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ArrayOperationVisitor {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: file name\n");
        } else {
            String fileName = args[0];
            ArrayOperationParser parser = getParser(fileName);
            // tell ANTLR to build a parse tree
            // parse from the start synbol 'prog'
            ParseTree antlrAST = parser.program();

            // parsing may have found syntactic error, which is bad!

            // Option Final -> BEGIN
            // a solution to know if this was the case, we need a listener associated with the parser

            //only go ahead if there is no syntax error detected by the parser
            if (Utils.SyntaxErrorListener.hasError) {
                /* let the syntax error be reported */

            } else {  // the program has no syntax error, may be semantic ones
                // create an object to store symbols ans semantic errors
                SymbolTableManager symbolTable = new SymbolTableManager();
                // create a visitor for converting the part tree into a Program/Expression object
                AntltToProgram progVisitor = new AntltToProgram(symbolTable);
                Program prog = progVisitor.visit(antlrAST);
                // pour interprétation
                if (symbolTable.getSemanticErrors().isEmpty()) {
                    ArrayOperationGrammarDoInterpretVisitor interpretVisitor = new ArrayOperationGrammarDoInterpretVisitor(symbolTable);
                    interpretVisitor.visit(prog);
                } else {
                    for (String err : symbolTable.getSemanticErrors()) {
                        System.out.println(err);
                    }
                }

            }

        }
    }

    // helper method, the same for every grammar
    /*
     * Here the type of parser and lexer are specific to the
     * grammar name ArrayOperation.g4
     */
    private static ArrayOperationParser getParser(String fileName) {
        ArrayOperationParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            ArrayOperationLexer lexer = new ArrayOperationLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // parser initialisation
            parser = new ArrayOperationParser(tokens);

            // Syntax error error handling
            parser.removeErrorListeners();  // default listener
            parser.addErrorListener(new SyntaxErrorListener());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }
}
