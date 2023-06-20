package exercise.util;

public class CurrencyConvert {

	private static final double IOF = 0.06;
	
	
	public static double AmountPaidReal(double dollarPrice, double dollarsBought) {
		double amountNotIofDollar = dollarPrice * dollarsBought;
		double amountIofDollar = amountNotIofDollar * IOF;
		return amountNotIofDollar + amountIofDollar;
	}
	
}
