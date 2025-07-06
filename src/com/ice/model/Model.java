package com.ice.model;

public abstract class Model {

	protected double S0, sigma, T;
	
	public Model(double S0, double sigma, double T) {
		this.S0 = S0;
		this.sigma = sigma;
		this.T = T;
	}
	
	public abstract double SimulateModelPrice(double X);
}
