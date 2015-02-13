package test;

import static org.junit.Assert.*;
import multiformat.Rational;

import org.junit.Before;
import org.junit.Test;

/**
 * Testclass for divide by zero of a Rational
 * @author tugge
 * Version 1.0 
 */
public class TestDivideByZero {
	
	Rational test;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		test = new Rational(1);
	}

	@Test
	public void test() {
		Rational testresult = test.div(new Rational(0));
		if (testresult == null){
			fail("Not yet implemented");
		}
	}
}
