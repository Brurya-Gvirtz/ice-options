package com.ice.model;

public class NormalModel extends Model{

	public NormalModel(double S0, double sigma, double T) {
		super(S0, sigma, T);
	}

	@Override
	public double SimulateModelPrice(double X) {
		return S0 + sigma * X * Math.sqrt(T);
	}

}
