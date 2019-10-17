/**
 * 
 */
package tp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Virginie Van den Schrieck
 *
 */
class FractionTest {
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction()}.
	 */
	@Test
	void testFraction() {
		Fraction f = new Fraction();
		assertEquals(f.getNumerator(),0);
		assertNotEquals(f.getDenominator(),0);
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction(int, int)}.
	 */
	@Test
	void testFractionIntInt() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.getNumerator(),1);
		assertEquals(f.getDenominator(),2);
		f = new Fraction(2,-4);
		assertEquals(f.getNumerator(),-1);
		assertEquals(f.getDenominator(),2);
		f = new Fraction(-8,-4);
		assertEquals(f.getNumerator(),2);
		assertEquals(f.getDenominator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#Fraction(int, tp.Fraction)}.
	 */
	@Test
	void testFractionIntFraction() {
		//Test 1+1/2
		Fraction f = new Fraction(1,2);
		Fraction m = new Fraction(1,f);
		assertEquals(m.getNumerator(),3);
		assertEquals(m.getDenominator(),2);
		//Test 2 + 4/2
		f = new Fraction(4,2);
		m = new Fraction(2,f);
		assertEquals(m.getNumerator(),4);
		assertEquals(m.getDenominator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#getNumerator()}.
	 */
	@Test
	void testGetNumerator() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.getNumerator(),1);
	}

	/**
	 * Test method for {@link tp.Fraction#setNumerator(int)}.
	 */
	@Test
	void testSetNumerator() {
		Fraction f = new Fraction(1,2);
		f.setNumerator(4);
		assertEquals(f.getNumerator(),2);
	}

	/**
	 * Test method for {@link tp.Fraction#getDenominator()}.
	 */
	@Test
	void testGetDenominator() {
		Fraction f = new Fraction(1,2);
		assertEquals(f.getDenominator(),2);
		f = new Fraction(2,4);
		assertEquals(f.getDenominator(),2);
	}

	/**
	 * Test method for {@link tp.Fraction#setDenominator(int)}.
	 */
	@Test
	void testSetDenominator() {
		Fraction f = new Fraction(1,2);
		f.setDenominator(4);
		assertEquals(f.getDenominator(),4);
		f = new Fraction(2,3);
		f.setDenominator(4);
		assertEquals(f.getDenominator(),2);
		//Test the case of the null denominator
		//Method fails silently, i.e. no change to the fraction
		
		f.setDenominator(0);
		assertEquals(f.getDenominator(),2);
		
	}

	/**
	 * Test method for {@link tp.Fraction#toString()}.
	 */
	@Test
	void testToString() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.toString(), "1/2");
		f = new Fraction(0,4);
		assertEquals(f.toString(), "0");
		f = new Fraction(4,4);
		assertEquals(f.toString(), "1");
		f = new Fraction(-1,4);
		assertEquals(f.toString(), "-1/4");
		f = new Fraction(1,-4);
		assertEquals(f.toString(), "-1/4");
		f = new Fraction(4,3);
		assertEquals(f.toString(), "4/3");
		
	}

	/**
	 * Test method for {@link tp.Fraction#asMixedNumber()}.
	 */
	@Test
	void testAsMixedNumber() {
		Fraction f = new Fraction(2,4);
		assertEquals(f.asMixedNumber(), "1/2");
		f = new Fraction(0,4);
		assertEquals(f.toString(), "0");
		f = new Fraction(4,4);
		assertEquals(f.toString(), "1");
		f = new Fraction(-1,4);
		assertEquals(f.toString(), "-1/4");
		f = new Fraction(1,-4);
		assertEquals(f.toString(), "-1/4");
		f = new Fraction(4,3);
		assertEquals(f.toString(), "1 + 1/3");
		
	}

	/**
	 * Test method for {@link tp.Fraction#add(tp.Fraction)}.
	 */
	@Test
	void testAdd() {
		// 1/2 + 2/4 = 1
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,4);
		Fraction f3 = new Fraction(1,1);
		assertEquals(f1.add(f2), f3);
		// 1/5 + 1/5 = 2/5 -> use twice the same param
		f1 = new Fraction(1,5);
		f3 = new Fraction(1,5);
		assertEquals(f1.add(f1), f3);
		// 1/2 + 2/3 = 7/6
		f1 = new Fraction(1,2);
		f2 = new Fraction(2,3);
		f3 = new Fraction(7,6);
		assertEquals(f1.add(f2), f3);
		// 1/2 + -2/3 = -1/6
		f1 = new Fraction(1,2);
		f2 = new Fraction(-2,3);
		f3 = new Fraction(-1,6);
		assertEquals(f1.add(f2), f3);
		// 1/2 + 0/3 = 1/2
		f1 = new Fraction(1,2);
		f2 = new Fraction(0,3);
		assertEquals(f1.add(f2), f1);
	}

	/**
	 * Test method for {@link tp.Fraction#soustract(tp.Fraction)}.
	 */
	@Test
	void testSoustract() {
		// 1/2 - -2/4 = 1
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,-4);
		Fraction f3 = new Fraction(1,1);
		assertEquals(f1.soustract(f2), f3);
		// 1/5 - 1/5 = 0 -> use twice the same param
		f1 = new Fraction(1,5);
		f3 = new Fraction(0,5);
		assertEquals(f1.soustract(f1), f3);
		// 1/2 - 2/3 = -1/6
		f1 = new Fraction(1,2);
		f2 = new Fraction(2,-3);
		f3 = new Fraction(-1,6);
		assertEquals(f1.soustract(f2), f3);
		// 1/2 - -2/3 = 7/6
		f1 = new Fraction(1,2);
		f2 = new Fraction(-2,3);
		f3 = new Fraction(7,6);
		assertEquals(f1.soustract(f2), f3);
		// 1/2 - 0/3 = 0
		f1 = new Fraction(1,2);
		f2 = new Fraction(0,3);
		assertEquals(f1.soustract(f2), f1);
	}

	/**
	 * Test method for {@link tp.Fraction#multiply(tp.Fraction)}.
	 */
	@Test
	void testMultiply() {
		// 1/2 * 1/3 = 1/6
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,3);
		Fraction f3 = new Fraction(1,6);
		assertEquals(f1.multiply(f2), f3);
		// 1/5 * 1/5 = 1/25 -> use twice the same param
		f1 = new Fraction(1,5);
		f3 = new Fraction(1,25);
		assertEquals(f1.multiply(f1), f3);
		// 1/5 * 1/5 = 1/25 -> use twice the same param
		f1 = new Fraction(1,5);
		f2 = new Fraction(1,-2);
		f3 = new Fraction(-1,10);
		assertEquals(f1.multiply(f2), f3);
		// 1/5 * 0 = 0 
		f1 = new Fraction(1,5);
		f2 = new Fraction(0,-2);
		f3 = new Fraction(0,10);
		assertEquals(f1.multiply(f2), f3);
		// 4 * -1/4 = -1 
		f1 = new Fraction(4,1);
		f2 = new Fraction(1,-4);
		f3 = new Fraction(-1,1);
		assertEquals(f1.multiply(f2), f3);
		// 4 * 1/2 = 2 
		f1 = new Fraction(4,1);
		f2 = new Fraction(1,2);
		f3 = new Fraction(2,1);
		assertEquals(f1.multiply(f2), f3);		
	}

	/**
	 * Test method for {@link tp.Fraction#divide(tp.Fraction)}.
	 */
	@Test
	void testDivide() {
		// 1/2 : 1/3 = 3/2
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,3);
		Fraction f3 = new Fraction(6,1);
		assertEquals(f1.divide(f2), f3);
		// 1/5 : 1/5 = 1 -> use twice the same param
		f1 = new Fraction(1,5);
		f3 = new Fraction(1,1);
		assertEquals(f1.divide(f1), f3);
		// 2/3 : 2 = 1/3 
		f1 = new Fraction(2,3);
		f2 = new Fraction(2,1);
		f3 = new Fraction(1,3);
		assertEquals(f1.divide(f2), f3);
		// 2/3 : 4/3 = 1/2 
		f1 = new Fraction(2,3);
		f2 = new Fraction(4,3);
		f3 = new Fraction(1,2);
		assertEquals(f1.divide(f2), f3);
	}

	/**
	 * Test method for {@link tp.Fraction#raiseToPower(int)}.
	 */
	@Test
	void testRaiseToPower() {
		// 1/2 pw 2
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(2,1);
		Fraction f3 = new Fraction(1,4);
		assertEquals(f1.raiseToPower(f2), f3);
		// 1/4 pw 1/2 = sqrt(1/4) = 1/2
		f1 = new Fraction(1,4);
		f2 = new Fraction(1,2);
		assertEquals(f1.raiseToPower(f2), f2);
		// 3/4 pw 0 = 1
		f1 = new Fraction(1,4);
		f2 = new Fraction(0,2);
		f3 = new Fraction(1,1);
		assertEquals(f1.raiseToPower(f2), f3);
		// 3/4 pw -1 = 4/3
		f1 = new Fraction(3,4);
		f2 = new Fraction(-1,1);
		f3 = new Fraction(4,3);
		assertEquals(f1.raiseToPower(f2), f3);
		// 3/4 pw 1 = 3/4
		f1 = new Fraction(3,4);
		f2 = new Fraction(1,1);
		assertEquals(f1.raiseToPower(f2), f1);				
		
		
	}

	/**
	 * Test method for {@link tp.Fraction#isZero()}.
	 */
	@Test
	void testIsZero() {
		Fraction zero = new Fraction(0,2);
		assertTrue(zero.isZero());
		Fraction nonZero = new Fraction(3,4);
		assertFalse(nonZero.isZero());
	}

	/**
	 * Test method for {@link tp.Fraction#isInteger()}.
	 */
	@Test
	void testIsInteger() {
		Fraction integer = new Fraction(2,2);
		Fraction zero = new Fraction(0,2);
		Fraction notInteger = new Fraction(1,2);
		Fraction negativeInt = new Fraction(-1,2);
		assertTrue(integer.isInteger());
		assertTrue(zero.isInteger());
		assertFalse(notInteger.isInteger());
		assertTrue(negativeInt.isInteger());
	}

	/**
	 * Test method for {@link tp.Fraction#isNegative()}.
	 */
	@Test
	void testIsNegative() {
		Fraction pos = new Fraction(1,2);
		Fraction zero = new Fraction(0,2);
		Fraction neg = new Fraction(-1,2);
		assertTrue(neg.isNegative());
		assertFalse(pos.isNegative());
		assertFalse(zero.isNegative());
	}

	/**
	 * Test method for {@link tp.Fraction#equals(tp.Fraction)}.
	 */
	@Test
	void testEquals() {
		Fraction f1 =  new Fraction(1,2);
		Fraction f2 = new Fraction(2,4);
		Fraction f3 = new Fraction(1,2);
		Fraction f4 = new Fraction(1,3);
		assertTrue(f1.equals(f2));
		assertTrue(f2.equals(f1));
		assertTrue(f1.equals(f3));
		assertTrue(f1.equals(f1));
		assertFalse(f1.equals(f4));
		
	}

	/**
	 * Test method for {@link tp.Fraction#isGreaterThan(tp.Fraction)}.
	 */
	@Test
	void testIsGreaterThan() {
		Fraction f1 =  new Fraction(1,2);
		Fraction f2 = new Fraction(2,4);
		Fraction f3 = new Fraction(1,2);
		Fraction f4 = new Fraction(1,3);
		Fraction f5 = new Fraction(-1,2);
		Fraction f6 = new Fraction(1,-3);
		
		assertEquals(f1.compareTo(f2), 0);
		assertEquals(f1.compareTo(f1),0);
		assertTrue(f1.compareTo(f4)>0);
		assertTrue(f4.compareTo(f1)<0);
		assertTrue(f1.compareTo(f5)>0);
		assertTrue(f5.compareTo(f1)<0);
		assertTrue(f6.compareTo(f5)>0);
		assertTrue(f5.compareTo(f6)<0);
			
		
	}

	/**
	 * Test method for {@link tp.Fraction#isUnitFraction()}.
	 */
	@Test
	void testIsUnitFraction() {
		Fraction f1 = new Fraction(1,2);
		assertTrue(f1.isUnitFraction());
		Fraction f2 = new Fraction(3,2);
		assertFalse(f2.isUnitFraction());
		Fraction f3 = new Fraction(2,3);
		assertFalse(f3.isUnitFraction());
		Fraction zero = new Fraction(0,3);
		assertFalse(zero.isUnitFraction());
		Fraction one = new Fraction(1,1);
		assertTrue(one.isUnitFraction());
	}

	/**
	 * Test method for {@link tp.Fraction#isProperFraction()}.
	 */
	@Test
	void testIsProperFraction() {
		Fraction f1 = new Fraction(1,2);
		assertTrue(f1.isProperFraction());
		Fraction f2 = new Fraction(3,2);
		assertFalse(f2.isProperFraction());
		Fraction f3 = new Fraction(1,1);
		assertFalse(f3.isProperFraction());
		Fraction f4 = new Fraction(0,1);
		assertFalse(f4.isProperFraction());
	}

	/**
	 * Test method for {@link tp.Fraction#isAdjacentTo(tp.Fraction)}.
	 */
	@Test
	void testIsAdjacentTo() {
		//1/2 - 1/3 = 1/6
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(1,3);
		assertTrue(f1.isAdjacentTo(f2));
		
		// 1/2 - 1/5 = 3/10
		f1 = new Fraction(1,2);
		f2 = new Fraction(1,5);
		assertFalse(f1.isAdjacentTo(f2));
		
		// 1/2 - 0 = 1/2
		f1 = new Fraction(1,2);
		f2 = new Fraction(0,5);
		assertTrue(f1.isAdjacentTo(f2));
		
		// 2/3 - 1 = -1/3
		f1 = new Fraction(2,3);
		f2 = new Fraction(1,1);
		assertTrue(f1.isAdjacentTo(f2));

	}

	/**
	 * Test method for {@link tp.Fraction#toDouble()}.
	 */
	@Test
	void testToDouble() {
		assertEquals((new Fraction(1,2)).toDouble(),0.5,0);
		assertEquals((new Fraction(1,1)).toDouble(),1,0);
		assertEquals((new Fraction(-1,3)).toDouble(),-0.333,0.001);
		assertEquals((new Fraction(0,3)).toDouble(),0,0);
	}

	/**
	 * Test method for {@link tp.Fraction#clone()}.
	 */
	@Test
	void testClone() {
		Fraction f = new Fraction(1,2);
		assertEquals(f.clone(), f);
	}

}
