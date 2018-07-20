package dungeon.testing.power;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import dungeon.model.Power;

class TestSetPower {

	/**
	 * This test will check the set power of 5 all tests should return 5
	 */
	@Test
	void testDefaultPowerThenSetTo5AllShouldReturn5() {
		Power power = new Power();
		power.setForce(5);
		power.setIntellegance(5);
		power.setStrength(5);
		assertEquals(5, power.getForce());
		assertEquals(5, power.getIntellegance());
		assertEquals(5, power.getStrength());
	}
	
	/**
	 * This test will check the set power of 25 all tests should return 25
	 */
	@Test
	void testDefaultPowerThenSetTo25AllShouldReturn25() {
		Power power = new Power();
		power.setForce(25);
		power.setIntellegance(25);
		power.setStrength(25);
		assertEquals(25, power.getForce());
		assertEquals(25, power.getIntellegance());
		assertEquals(25, power.getStrength());
	}
	
	/**
	 * This test will check the set power of 115 all tests should return 115
	 */
	@Test
	void testDefaultPowerThenSetTo115AllShouldReturn115() {
		Power power = new Power();
		power.setForce(115);
		power.setIntellegance(115);
		power.setStrength(115);
		assertEquals(115, power.getForce());
		assertEquals(115, power.getIntellegance());
		assertEquals(115, power.getStrength());
	}
	
	/**
	 * This test will check the set power of -5 all tests should return 0 As power CANNOT be negitive
	 */
	@Test
	void testDefaultPowerThenSetToNeg5AllShouldReturnNeg5() {
		Power power = new Power();
		power.setForce(-5);
		power.setIntellegance(-5);
		power.setStrength(-5);
		assertEquals(0, power.getForce());
		assertEquals(0, power.getIntellegance());
		assertEquals(0, power.getStrength());
	}
	
}
