package simcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalculatorTest {

	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		
		calc.add(10, 20);
		
		assertEquals(30, calc.getResult());
	}

}
