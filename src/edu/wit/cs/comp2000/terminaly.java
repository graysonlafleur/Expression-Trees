package edu.wit.cs.comp2000;

public class terminaly extends Expression {
	
	Expression express;
	
	public terminaly() {
		//this.express = express;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return y;
	}
	
	public String toString() {
		return "y";
	}

}
