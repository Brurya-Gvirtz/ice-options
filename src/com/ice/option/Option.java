package com.ice.option;

public abstract class Option {

	protected double K;
	
	public Option (double K) {
		this.K=K;
	}
	
	public abstract double payoff(double S);
}
