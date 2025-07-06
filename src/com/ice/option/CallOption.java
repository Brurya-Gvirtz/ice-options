package com.ice.option;

public class CallOption extends Option{

	public CallOption(double K) {
		super(K);
	}

	@Override
	public double payoff(double S) {
		return Math.max(S-K, 0);
	}

}
