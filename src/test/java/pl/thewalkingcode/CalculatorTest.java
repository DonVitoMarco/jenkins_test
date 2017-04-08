package pl.thewalkingcode;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addTest() throws Exception {
        assertEquals(10, Calculator.add(5, 5));
    }

}