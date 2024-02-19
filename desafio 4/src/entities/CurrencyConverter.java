package entities;

public class CurrencyConverter {

    public static double amountDollar;
    public static double dollarPrice;

    public static double dollarConverter() {
       return amountDollar * dollarPrice * (1.0 + 0.06);
    }
}


            // Diferente jeito  de fazer

//    public static double IOF = 0.06;
//    public static double dollarToReal (double amount, double dollarPrice) {
//        return amount * dollarPrice * (1.0 + IOF);
//    }


