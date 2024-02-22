package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static String convert(double value, double amount) {
		double result = value * amount + (value * amount * IOF);
		 return String.format("%.2f", result);
		
	}
}
