package dungeon.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import dungeon.model.Power;

class TestAddAbility {

	/**
	 * This test will check add ability from the default constructor
	 */
	@Test
	void testDefaultConstructorAdd5PowerToAllShouldReturn6ForAll() {
		Power powers = new Power();
		powers.addForce(5);
		powers.addIntellegence(5);
		powers.addStrength(5);
		assertEquals(6, powers.getStrength());
		assertEquals(6, powers.getForce());
		assertEquals(6, powers.getIntellegance());
	}

	/**
	 * This test will check add ability from the default constructor
	 */
	@Test
	void testDefaultConstructorAdd15PowerToAllShouldReturn16ForAll() {
		Power powers = new Power();
		powers.addForce(15);
		powers.addIntellegence(15);
		powers.addStrength(15);
		assertEquals(16, powers.getStrength());
		assertEquals(16, powers.getForce());
		assertEquals(16, powers.getIntellegance());
	}

	/**
	 * This test will check add ability from the three param constructor
	 */
	@Test
	void test3ParamConstructorAdd5PowerToAllShouldReturn16ForAll() {
		Power powers = new Power(11, 11, 11);
		powers.addForce(5);
		powers.addIntellegence(5);
		powers.addStrength(5);
		assertEquals(16, powers.getStrength());
		assertEquals(16, powers.getForce());
		assertEquals(16, powers.getIntellegance());
	}

	/**
	 * This test will check add ability from the default constructor adding power
	 * twice
	 */
	@Test
	void testDefaultConstructorAddPowerTwiceToForceShouldReturn686() {
		Power powers = new Power();
		powers.addForce(5);
		powers.addIntellegence(5);
		powers.addStrength(5);
		powers.addForce(2);
		assertEquals(6, powers.getStrength());
		assertEquals(8, powers.getForce());
		assertEquals(6, powers.getIntellegance());
	}

	/**
	 * This test will check add ability from the default constructor adding negative
	 * power
	 */
	@Test
	void testDefaultConstructorAddNegitivePowerTwiceToForceShouldReturn626() {
		Power powers = new Power();
		powers.addForce(5);
		powers.addIntellegence(5);
		powers.addStrength(5);
		powers.addForce(-4);
		assertEquals(6, powers.getStrength());
		assertEquals(2, powers.getForce());
		assertEquals(6, powers.getIntellegance());
	}

	/**
	 * This test will check add ability from the default constructor adding negative
	 * power should force the power to stop at 1
	 */
	@Test
	void testDefaultConstructorAddNegitivePowerTwiceToForceShouldReturn611() {
		Power powers = new Power();
		powers.addForce(5);
		powers.addIntellegence(5);
		powers.addStrength(5);
		powers.addForce(-10);
		powers.addStrength(-55);
		assertEquals(1, powers.getStrength());
		assertEquals(1, powers.getForce());
		assertEquals(6, powers.getIntellegance());
	}
}
