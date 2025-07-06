package com.ice.option;

public class SquareOption extends Option{

	public SquareOption(double K) {
		super(K);
	}

	@Override
	public double payoff(double S) {
		return S * S;
	}

}
