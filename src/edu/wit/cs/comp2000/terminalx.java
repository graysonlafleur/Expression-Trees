package edu.wit.cs.comp2000;

public class terminalx extends Expression {

	Expression express;
	
	public terminalx() {
		//this.express = express;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return x;
	}
	
	public String toString() {
		return "x";
	}
	
}
