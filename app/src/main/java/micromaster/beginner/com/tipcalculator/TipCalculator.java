package micromaster.beginner.com.tipcalculator;

/**
 * Created by Rodrigo on 26-Mar-17.
 */

public class TipCalculator {

    public String calculateTip(double billAmount, double tipToCalculate) {
        billAmount *= 1 + tipToCalculate;
        return Double.toString(billAmount);
    }

    public static Double parseBillValue(String tipValue) {
        try {
            return Double.parseDouble(tipValue);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}