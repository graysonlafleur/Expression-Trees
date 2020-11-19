package edu.wit.cs.comp2000;

public class Cosine extends Expression {
	
	Expression express;
	
	public Cosine(Expression express) {
		this.express = express;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return Math.cos(Math.PI * express.evaluate(x,y));
	}
	
	public String toString() {
		return String.format("cos(pi %s )", express.toString());
	}

}
