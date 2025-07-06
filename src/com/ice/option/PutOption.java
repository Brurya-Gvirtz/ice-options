package com.ice.option;

public class PutOption extends Option{

	public PutOption(double K) {
		super(K);
	}

	@Override
	public double payoff(double S) {
		return Math.max(K-S, 0);
	}

}
