package edu.wit.cs.comp2000;

import java.util.Random;

/**
 * A class that creates a grammar tree for a mathematical expression by
 * making random function choices.
 *
 */
public class RandomExpression extends Expression {
	
	Expression root;
	
	public RandomExpression() {
		this.root = buildRandTree(10);
	}
	
	@Override
	public double evaluate(double x, double y) {
		return root.evaluate(x, y);
	}
	

	/**
	 * Build a tree to represent a random math expression.
	 * @param maxDepth The remaining allowed depth of the tree - if it reaches 0,
	 * 		  only consider adding a terminal node.
	 * @return the root of the resulting expression 
	 */
	private Expression buildRandTree(int maxDepth) {
		Expression rValue = new terminalx();
		if(maxDepth > 0)
		{
			--maxDepth;
			Random expression = new Random();
			Double nextDouble = expression.nextDouble();
			if(nextDouble<.3) rValue = new Sine(buildRandTree(maxDepth));
			else if (nextDouble>=.3 && nextDouble<.6) rValue = new Cosine(buildRandTree(maxDepth));
			else if (nextDouble>=.6 && nextDouble<.725) rValue = new Average(buildRandTree(maxDepth), buildRandTree(maxDepth));
			else if (nextDouble>=.725 && nextDouble<.85) rValue = new Multiply(buildRandTree(maxDepth), buildRandTree(maxDepth));
			else {
				Random xORy = new Random();
				if(xORy.nextDouble() > 50) rValue = new terminalx();
				else rValue = new terminaly();
			}
		}
		return rValue;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}


}
