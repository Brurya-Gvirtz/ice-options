package com.ice.option;

public class StraddleOption extends Option{

	public StraddleOption(double K) {
		super(K);
	}

	@Override
	public double payoff(double S) {
		return Math.abs(S-K);
	}

}
