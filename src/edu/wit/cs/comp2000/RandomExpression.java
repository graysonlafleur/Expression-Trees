package edu.wit.cs.comp2000;

/**
 * A class that creates a grammar tree for a mathematical expression by
 * making random function choices.
 *
 */
public class RandomExpression extends Expression {
	
	Expression root;
	
	public RandomExpression() {
		// TODO: Implement method
	}
	
	@Override
	public double evaluate(double x, double y) {
		// TODO: Implement method
		return Double.NEGATIVE_INFINITY;
	}
	

	/**
	 * Build a tree to represent a random math expression.
	 * @param maxDepth The remaining allowed depth of the tree - if it reaches 0,
	 * 		  only consider adding a terminal node.
	 * @return the root of the resulting expression 
	 */
	private Expression buildRandTree(int maxDepth) {
		// TODO: Implement method
		return null;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}


}
