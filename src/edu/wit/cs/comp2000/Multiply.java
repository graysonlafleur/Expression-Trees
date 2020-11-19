package edu.wit.cs.comp2000;

public class Multiply extends Expression {

	Expression express1;
	Expression express2;
	
	public Multiply(Expression express1, Expression express2) {
		this.express1 = express1;
		this.express2 = express2;
	}
	
	@Override
	public double evaluate(double x, double y) {
		return express1.evaluate(x, y) * express2.evaluate(x,y);
	}
	
	public String toString() {
		return String.format("%s * %s", express1.toString(), express2.toString());
	}

}
