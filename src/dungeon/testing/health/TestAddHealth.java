package dungeon.testing.health;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dungeon.model.Health;

class TestAddHealth {

	/**
	 * This test will check the default constructor 
	 */
	@Test
	void testDefaultConstructorShouldReturn10() {
		Health health = new Health();
		assertEquals(10, health.getHealth());
	}

	/**
	 * This test checks the one param constructor
	 */
	@Test
	void testOneParamConstructorAccept15ShouldReturn15() {
		Health health = new Health(15);
		assertEquals(15, health.getHealth());

	}
	
	/**
	 * This test will check add add health after calling the one param constructor
	 */
	@Test
	void test1ParamConstructorAdd5HealthToAllShouldReturn16() {
		Health health = new Health(11);
		health.addHealth(5);
		assertEquals(16, health.getHealth());

	}
	
	/**
	 * this test checks the removeHealth method
	 */
	@Test
	void testRemoveHealth5From15ShouldReturn10() {
		Health health = new Health(15);
		health.removeHealth(5);
		assertEquals(10, health.getHealth());
	}
	
	/**
	 * this test checks the removeHealth method can successfully trigger the isDead to be true
	 */
	@Test
	void testRemoveHealth15From14ShouldReturnIsDeadTrue() {
		Health health = new Health(14);
		health.removeHealth(15);
		assertEquals(true, health.isDead());
		
	}
	
	/**
	 * this test checks the removeHealth method can successfully trigger the isDead to be true
	 */
	@Test
	void testRemoveHealth14From14ShouldReturnIsDeadTrue() {
		Health health = new Health(14);
		health.removeHealth(14);
		assertEquals(true, health.isDead());
		
	}
}
