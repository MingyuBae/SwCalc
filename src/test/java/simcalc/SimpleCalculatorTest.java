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
	
	@Test
	public void testSub(){
		SimpleCalculator calc = new SimpleCalculator();

		calc.sub(10,  20);
		
		assertEquals(-10, calc.getResult());
	}
	
	@Test
	public void testMulti(){
		SimpleCalculator calc = new SimpleCalculator();

		calc.multi(10, 20);
		
		assertEquals(200, calc.getResult());	
	}
	
	@Test
	public void testDiv(){
		SimpleCalculator calc = new SimpleCalculator();

		calc.div(100,  20);
		
		assertEquals(5, calc.getResult());
	}
	
	@Test
	public void testInc(){
		SimpleCalculator calc = new SimpleCalculator();

		calc.inc(100);
		assertEquals(100, calc.getResult());
		
		calc.inc(200);
		assertEquals(300, calc.getResult());
	}
}
