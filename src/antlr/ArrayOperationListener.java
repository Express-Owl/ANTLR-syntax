// Generated from D:/Home/Documents/DUT3/Syntax/projet/untitled/src/antlr/ArrayOperation.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayOperationParser}.
 */
public interface ArrayOperationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayOperationParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArrayOperationParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArrayOperationParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleopinstruction(ArrayOperationParser.SimpleopinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleopinstruction(ArrayOperationParser.SimpleopinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVardeclinstruction(ArrayOperationParser.VardeclinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVardeclinstruction(ArrayOperationParser.VardeclinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationinstruction(ArrayOperationParser.AffectationinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationinstruction(ArrayOperationParser.AffectationinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVaroutinstruction(ArrayOperationParser.VaroutinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVaroutinstruction(ArrayOperationParser.VaroutinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSum(ArrayOperationParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSum(ArrayOperationParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSumid(ArrayOperationParser.SumidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSumid(ArrayOperationParser.SumidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterProd(ArrayOperationParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitProd(ArrayOperationParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prodid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterProdid(ArrayOperationParser.ProdidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prodid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitProdid(ArrayOperationParser.ProdidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMax(ArrayOperationParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMax(ArrayOperationParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code maxid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMaxid(ArrayOperationParser.MaxidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code maxid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMaxid(ArrayOperationParser.MaxidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMin(ArrayOperationParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMin(ArrayOperationParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMinid(ArrayOperationParser.MinidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMinid(ArrayOperationParser.MinidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSort(ArrayOperationParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSort(ArrayOperationParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sortid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSortid(ArrayOperationParser.SortidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sortid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSortid(ArrayOperationParser.SortidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterConcat(ArrayOperationParser.ConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitConcat(ArrayOperationParser.ConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVararray(ArrayOperationParser.VararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVararray(ArrayOperationParser.VararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvararray(ArrayOperationParser.InitvararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvararray(ArrayOperationParser.InitvararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVarint(ArrayOperationParser.VarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVarint(ArrayOperationParser.VarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvarint(ArrayOperationParser.InitvarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvarint(ArrayOperationParser.InitvarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectsimpleop(ArrayOperationParser.AffectsimpleopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectsimpleop(ArrayOperationParser.AffectsimpleopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectarray(ArrayOperationParser.AffectarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectarray(ArrayOperationParser.AffectarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectint(ArrayOperationParser.AffectintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectint(ArrayOperationParser.AffectintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatwithid}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 */
	void enterConcatwithid(ArrayOperationParser.ConcatwithidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatwithid}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 */
	void exitConcatwithid(ArrayOperationParser.ConcatwithidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatwitharray}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 */
	void enterConcatwitharray(ArrayOperationParser.ConcatwitharrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatwitharray}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 */
	void exitConcatwitharray(ArrayOperationParser.ConcatwitharrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayOperationParser#varout}.
	 * @param ctx the parse tree
	 */
	void enterVarout(ArrayOperationParser.VaroutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationParser#varout}.
	 * @param ctx the parse tree
	 */
	void exitVarout(ArrayOperationParser.VaroutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayOperationParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ArrayOperationParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ArrayOperationParser.ArrayContext ctx);
}