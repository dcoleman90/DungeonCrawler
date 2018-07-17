package dungeon.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import dungeon.model.Ability;

class TestAblityConstructors {

	/**
	 * This test will check the default constructor Spirit stat should return 0
	 */
	@Test
	void testDefaultConstructorSpiritShouldReturn0() {
		Ability scoreSheet = new Ability();
		assertEquals(0, scoreSheet.getSpirit());
	}

	/**
	 * This test will check the default constructor Mental stat should return 0
	 */
	@Test
	void testDefaultConstructorMentalShouldReturn0() {
		Ability scoreSheet = new Ability();
		assertEquals(0, scoreSheet.getMental());
	}

	/**
	 * This test will check the default constructor physical stat should return 0
	 */
	@Test
	void testDefaultConstructorPhysicalShouldReturn0() {
		Ability scoreSheet = new Ability();
		assertEquals(0, scoreSheet.getPhysical());
	}

	/**
	 * This test will check the three parameter constructor with stats of 1
	 */
	@Test
	void test3ParamConstructorStatsOf1() {
		Ability scoreSheet = new Ability(1, 1, 1);
		assertEquals(1, scoreSheet.getSpirit());
		assertEquals(1, scoreSheet.getMental());
		assertEquals(1, scoreSheet.getPhysical());
	}

	/**
	 * This test will check the three parameter constructor with stats of 10
	 */
	@Test
	void test3ParamConstructorStatsOf10() {
		Ability scoreSheet = new Ability(10, 10, 10);
		assertEquals(10, scoreSheet.getSpirit());
		assertEquals(10, scoreSheet.getMental());
		assertEquals(10, scoreSheet.getPhysical());
	}

	/**
	 * This test will check the three parameter constructor with stats of 5 9 and 8
	 */
	@Test
	void test3ParamConstructorStatsOf598() {
		Ability scoreSheet = new Ability(5, 9, 8);
		assertEquals(5, scoreSheet.getPhysical());
		assertEquals(9, scoreSheet.getSpirit());
		assertEquals(8, scoreSheet.getMental());
	}

	/**
	 * This test will insure the three parameter constructor resets values when they
	 * are above the acceptable limit
	 */
	@Test
	void test3ParamConstructorWhenStatsOutSideAcceptableLimit() {
		Ability scoreSheet = new Ability(-90, 100, 1000);
		assertEquals(-80, scoreSheet.getPhysical());
		assertEquals(80, scoreSheet.getSpirit());
		assertEquals(80, scoreSheet.getMental());
	}
}
