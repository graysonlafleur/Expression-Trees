package edu.wit.cs.comp2000;

public class Sine extends Expression {

	Expression express;
	
	public Sine(Expression express) {
		this.express = express;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return Math.sin(Math.PI * express.evaluate(x, y));
	}
	
	public String toString() {
		return String.format("sin(pi %s)", express.toString());
	}
	
}
