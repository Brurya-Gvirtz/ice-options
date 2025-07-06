package com.ice.model;

public class LogNormalModel extends Model{

	public LogNormalModel(double S0, double sigma, double T) {
		super(S0, sigma, T);
	}

	@Override
	public double SimulateModelPrice(double X) {
		return S0 * Math.exp(-0.5 * sigma * sigma * T + sigma * X * Math.sqrt(T));
	}

}
