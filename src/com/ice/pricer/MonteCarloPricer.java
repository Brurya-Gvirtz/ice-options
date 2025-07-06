package com.ice.pricer;
import java.util.Random;

import com.ice.model.Model;
import com.ice.option.Option;

public class MonteCarloPricer {
	
	public static double CalculatePrice(Model model, Option option, int N) {
		Random random = new Random();
		double sum =0;
		
		for(int i = 0; i < N; i++) {
			double X = random.nextGaussian();
			double ST = model.SimulateModelPrice(X);
			sum += option.payoff(ST); 
		}
		return sum/N; //the avg
		
	}
}
