package dungeon.testing.power;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import dungeon.model.Power;

class TestPowerConstructors {

	/**
	 * This test will test the default constructor
	 */
	@Test
	void testDefaultConstructorExpected1ForAllValues() {
		Power powers = new Power();
		assertEquals(1, powers.getStrength());
		assertEquals(1, powers.getForce());
		assertEquals(1, powers.getIntellegance());
	}

	/**
	 * This test will test the three parameter constructor with values of 1
	 */
	@Test
	void test3ParamConstructorWithValuesOf1() {
		Power powers = new Power(1, 1, 1);
		assertEquals(1, powers.getStrength());
		assertEquals(1, powers.getForce());
		assertEquals(1, powers.getIntellegance());
	}

	/**
	 * This test will insure that the three parameter constructor resets all 0
	 * values to 1
	 */
	@Test
	void test3ParamConstructorWithValuesOf0ResetsTo1() {
		Power powers = new Power(0, 0, 0);
		assertEquals(0, powers.getStrength());
		assertEquals(0, powers.getForce());
		assertEquals(0, powers.getIntellegance());
	}

	/**
	 * This test will insure that the three parameter constructor resets all
	 * negative values to 1
	 */
	@Test
	void test3ParamConstructorWithNegitiveValuesResetsTo1() {
		Power powers = new Power(-5, -10, -20);
		assertEquals(0, powers.getStrength());
		assertEquals(0, powers.getForce());
		assertEquals(0, powers.getIntellegance());
	}

	/**
	 * This test will test the three parameter constructor with values of 5
	 */
	@Test
	void test3ParamConstructorWithValuesOf5() {
		Power powers = new Power(5, 5, 5);
		assertEquals(5, powers.getStrength());
		assertEquals(5, powers.getForce());
		assertEquals(5, powers.getIntellegance());
	}

	/**
	 * This test will test the three parameter constructor with differing values
	 */
	@Test
	void test3ParamConstructorWithValuesOf51090() {
		Power powers = new Power(5, 10, 90);
		assertEquals(5, powers.getStrength());
		assertEquals(10, powers.getForce());
		assertEquals(90, powers.getIntellegance());
	}

	/**
	 * This test will test the three parameter constructor with differing values
	 * including some negative which will be reset to one
	 */
	@Test
	void test3ParamConstructorWithValuesOf5Neg1015() {
		Power powers = new Power(5, -5, 15);
		assertEquals(5, powers.getStrength());
		assertEquals(0, powers.getForce());
		assertEquals(15, powers.getIntellegance());
	}
}
