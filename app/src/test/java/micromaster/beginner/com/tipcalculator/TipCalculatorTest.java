package micromaster.beginner.com.tipcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rodrigo on 26-Mar-17.
 */
public class TipCalculatorTest {

    private TipCalculator tipCalculator;

    @Before

    public void setUp() throws Exception {

        tipCalculator = new TipCalculator();

    }

    @Test //dado

    public void calculateTip_15() throws Exception {

        Double billAmount = 100.0;

        Double tipToCalculate = 0.15;

        String totalExpected = "115.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        //expected: 100 + (100*15%) = 115.0

        assertEquals(totalExpected, totalAmount);

    }

    @Test

    public void calculateTip_20() throws Exception {

        Double billAmount = 100.0;

        Double tipToCalculate = 0.20;

        String totalExpected = "120.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        assertEquals(totalExpected, totalAmount);

    }

    public void calculateTip_30() throws Exception {

        Double billAmount = 100.0;

        Double tipToCalculate = 0.30;

        String totalExpected = "130.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        assertEquals(totalExpected, totalAmount);

    }

    public void calculateTip_40() throws Exception {

        Double billAmount = 100.0;

        Double tipToCalculate = 0.40;

        String totalExpected = "140.0";

        String totalAmount = tipCalculator.calculateTip(billAmount, tipToCalculate);

        assertEquals(totalExpected, totalAmount);

    }

    public void parseBillValue() throws Exception {

        String billAmount = "100.0";

        Double totalAmount = tipCalculator.parseBillValue(billAmount);

        assertNotNull(totalAmount);

    }
}