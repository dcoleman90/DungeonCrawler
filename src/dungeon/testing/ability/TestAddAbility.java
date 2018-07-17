package dungeon.testing.ability;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dungeon.model.Ability;

class TestAddAbility {

	/**
	 * This test will check add ability from the default constructor
	 */
	@Test
	void testDefaultConstructorAdd5AbilityToAllShouldReturn5ForAll() {
		Ability abilitys = new Ability();
		abilitys.addSpirit(5);
		abilitys.addMental(5);
		abilitys.addPhysical(5);
		assertEquals(5, abilitys.getPhysical());
		assertEquals(5, abilitys.getSpirit());
		assertEquals(5, abilitys.getMental());
	}

	/**
	 * This test will check add ability from the default constructor
	 */
	@Test
	void testDefaultConstructorAdd15AbilityToAllShouldReturn15ForAll() {
		Ability abilitys = new Ability();
		abilitys.addSpirit(15);
		abilitys.addMental(15);
		abilitys.addPhysical(15);
		assertEquals(15, abilitys.getPhysical());
		assertEquals(15, abilitys.getSpirit());
		assertEquals(15, abilitys.getMental());
	}

	/**
	 * This test will check add ability from the three param constructor
	 */
	@Test
	void test3ParamConstructorAdd5AbilityToAllShouldReturn16ForAll() {
		Ability abilitys = new Ability(11, 11, 11);
		abilitys.addSpirit(5);
		abilitys.addMental(5);
		abilitys.addPhysical(5);
		assertEquals(16, abilitys.getPhysical());
		assertEquals(16, abilitys.getSpirit());
		assertEquals(16, abilitys.getMental());
	}

	/**
	 * This test will check add ability from the default constructor adding ability
	 * twice
	 */
	@Test
	void testDefaultConstructorAddAbilityTwiceToForceShouldReturn686() {
		Ability abilitys = new Ability();
		abilitys.addSpirit(5);
		abilitys.addMental(5);
		abilitys.addPhysical(5);
		abilitys.addSpirit(2);
		assertEquals(5, abilitys.getPhysical());
		assertEquals(7, abilitys.getSpirit());
		assertEquals(5, abilitys.getMental());
	}

	/**
	 * This test will check add ability from the default constructor adding negative
	 * ability
	 */
	@Test
	void testDefaultConstructorAddNegitiveAbilityTwiceToForceShouldReturn626() {
		Ability abilitys = new Ability();
		abilitys.addSpirit(5);
		abilitys.addMental(5);
		abilitys.addPhysical(5);
		abilitys.addSpirit(-4);
		assertEquals(5, abilitys.getPhysical());
		assertEquals(1, abilitys.getSpirit());
		assertEquals(5, abilitys.getMental());
	}

	/**
	 * This test will check add ability from the default constructor adding negative
	 * ability should force the ability to stop at 1
	 */
	@Test
	void testDefaultConstructorAddNegitiveAbilityTwiceToForceShouldReturn611() {
		Ability abilitys = new Ability();
		abilitys.addSpirit(5);
		abilitys.addMental(5);
		abilitys.addPhysical(5);
		abilitys.addSpirit(-10);
		abilitys.addPhysical(-55);
		assertEquals(-50, abilitys.getPhysical());
		assertEquals(-5, abilitys.getSpirit());
		assertEquals(5, abilitys.getMental());
	}
}
