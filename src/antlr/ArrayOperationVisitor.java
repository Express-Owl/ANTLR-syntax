// Generated from D:/Home/Documents/DUT3/Syntax/projet/untitled/src/antlr/ArrayOperation.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayOperationParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayOperationVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayOperationParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArrayOperationParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleopinstruction(ArrayOperationParser.SimpleopinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclinstruction(ArrayOperationParser.VardeclinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationinstruction(ArrayOperationParser.AffectationinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaroutinstruction(ArrayOperationParser.VaroutinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ArrayOperationParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumid(ArrayOperationParser.SumidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(ArrayOperationParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prodid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProdid(ArrayOperationParser.ProdidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(ArrayOperationParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maxid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaxid(ArrayOperationParser.MaxidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(ArrayOperationParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinid(ArrayOperationParser.MinidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(ArrayOperationParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sortid}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortid(ArrayOperationParser.SortidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concat}
	 * labeled alternative in {@link ArrayOperationParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcat(ArrayOperationParser.ConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararray(ArrayOperationParser.VararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvararray(ArrayOperationParser.InitvararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarint(ArrayOperationParser.VarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvarint(ArrayOperationParser.InitvarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectsimpleop(ArrayOperationParser.AffectsimpleopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectarray(ArrayOperationParser.AffectarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectint(ArrayOperationParser.AffectintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatwithid}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatwithid(ArrayOperationParser.ConcatwithidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatwitharray}
	 * labeled alternative in {@link ArrayOperationParser#arrayconcat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatwitharray(ArrayOperationParser.ConcatwitharrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayOperationParser#varout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarout(ArrayOperationParser.VaroutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayOperationParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ArrayOperationParser.ArrayContext ctx);
}