package com.ice.main;

import com.ice.model.LogNormalModel;
import com.ice.model.Model;
import com.ice.model.NormalModel;
import com.ice.option.CallOption;
import com.ice.option.Option;
import com.ice.option.PutOption;
import com.ice.option.SquareOption;
import com.ice.option.StraddleOption;
import com.ice.pricer.MonteCarloPricer;

public class Main {

	public static void main(String[] args) {
		//Input for example
		double S0 = 100.0;
		double T = 1;
		double K = 100.0;
		double sigma = 0.2;
		int N = 100000;
		String optionType = "Call";
		String modelType = "LogNormal";
		
		Option option = switch (optionType) {
		   case "Call" -> new CallOption(K);
		   case "Put" -> new PutOption(K);
		   case "Straddle" -> new StraddleOption(K);
		   case "Square" -> new SquareOption(K);
		   default -> throw new IllegalArgumentException("Unknown OptionType");
		};
		
		Model model = switch (modelType) {
			case "LogNormal" -> new LogNormalModel(S0, sigma, T);
			case "Normal" -> new NormalModel(S0, sigma, T);
			default -> throw new IllegalArgumentException("Unknown ModelType");
		};
		
		double price = MonteCarloPricer.CalculatePrice(model, option, N);
		System.out.printf("Option Price: %.4f\n", price);
	}
}
