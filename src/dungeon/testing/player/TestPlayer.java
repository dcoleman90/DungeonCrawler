package dungeon.testing.player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import dungeon.model.Ability;
import dungeon.model.Health;
import dungeon.model.Player;
import dungeon.model.Power;

class TestPlayer {
	private Health hp;
	private Ability ability;
	private Power power;

	public void setUpPlayerWeak5() {
		this.hp = new Health(5);
		this.ability = new Ability(5, 5, 5);
		this.power = new Power(5, 5, 5);
	}
	
	public void setUpPlayerNormal10() {
		this.hp = new Health(10);
		this.ability = new Ability(10, 10, 10);
		this.power = new Power(10, 10, 10);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * This test will insure that a default player returns the expected values from
	 * the 8 attributes
	 */
	@Test
	void testDefaultPlayerShouldReturn8DefaultValues() {
		Player player1 = new Player("Player1");
		assertEquals(10, player1.getHealthRemaining());
		assertEquals(0, player1.getPhysical());
		assertEquals(0, player1.getMental());
		assertEquals(0, player1.getSpirit());
		assertEquals(1, player1.getIntellegance());
		assertEquals(1, player1.getForce());
		assertEquals(1, player1.getStrength());
		assertEquals("Player1", player1.getName());
	}

	/**
	 * This test will insure that the 4 param player returns the expected values
	 * from the 8 attributes
	 */
	@Test
	void testFourParamPlayerShouldReturn8ValuesFromTheWeakPlayerReturnsAll5s() {
		this.setUpPlayerWeak5();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		assertEquals(5, player1.getHealthRemaining());

		assertEquals(5, player1.getPhysical());
		assertEquals(5, player1.getSpirit());
		assertEquals(5, player1.getMental());

		assertEquals(5, player1.getStrength());
		assertEquals(5, player1.getForce());
		assertEquals(5, player1.getIntellegance());

		assertEquals("Player1", player1.getName());
	}

	/**
	 * This test will insure that all the parameters for attack and defense return
	 * within the Weak Player's range from 5 to 105
	 */
	@Test
	void testWeakPlayerAttackShouldReturnBetween5And105() {
		this.setUpPlayerWeak5();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		for (int count = 0; count < 10000; count++) {
			int attackMental = player1.attackMental();
			int attackStrength = player1.attackPhysical();
			int attackSpirit = player1.attackSpirit();
			if (attackMental > 105 || attackStrength > 105 || attackSpirit > 105) {
				fail("Attack rolled too high Strength" + attackStrength + " Mental " + attackMental + " Spirit "
						+ attackSpirit);
			} else if (attackMental < 6 || attackStrength < 6 || attackSpirit < 6) {
				fail("Attack rolled too Low Strength" + attackStrength + " Mental " + attackMental + " Spirit "
						+ attackSpirit);
			}
		}
	}
	
	/**
	 * This test will insure that all the parameters for defense and defense return
	 * within the Weak Player's range from 5 to 71 (height of 66 + 5)
	 */
	@Test
	void testWeakPlayerDefenseShouldReturnBetween5And105() {
		this.setUpPlayerWeak5();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		for (int count = 0; count < 10000; count++) {
			int defenseMental = player1.getMentalDefense();
			int defenseStrength = player1.getSpiritDefence();
			int defenseSpirit = player1.getMentalDefense();
			if (defenseMental > 71 || defenseStrength > 71 || defenseSpirit > 71) {
				fail("Defense rolled too high Strength" + defenseStrength + " Mental " + defenseMental + " Spirit "
						+ defenseSpirit);
			} else if (defenseMental < 5 || defenseStrength < 5 || defenseSpirit < 5) {
				fail("Defense rolled too Low Strength" + defenseStrength + " Mental " + defenseMental + " Spirit "
						+ defenseSpirit);
			}
		}
	}
	
	/**
	 * This test will insure that the 4 param player returns the expected values
	 * from the 8 attributes
	 */
	@Test
	void testFourParamPlayerShouldReturn8ValuesFromTheNormalPlayerReturnsAll5s() {
		this.setUpPlayerNormal10();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		assertEquals(10, player1.getHealthRemaining());

		assertEquals(10, player1.getPhysical());
		assertEquals(10, player1.getSpirit());
		assertEquals(10, player1.getMental());

		assertEquals(10, player1.getStrength());
		assertEquals(10, player1.getForce());
		assertEquals(10, player1.getIntellegance());

		assertEquals("Player1", player1.getName());
	}

	/**
	 * This test will insure that all the parameters for attack and defense return
	 * within the Normal Player's range from 10 to 105
	 */
	@Test
	void testNormalPlayerAttackShouldReturnBetween5And105() {
		this.setUpPlayerNormal10();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		for (int count = 0; count < 10000; count++) {
			int attackMental = player1.attackMental();
			int attackStrength = player1.attackPhysical();
			int attackSpirit = player1.attackSpirit();
			if (attackMental > 110 || attackStrength > 110 || attackSpirit > 110) {
				fail("Attack rolled too high Strength" + attackStrength + " Mental " + attackMental + " Spirit "
						+ attackSpirit);
			} else if (attackMental < 11 || attackStrength < 11 || attackSpirit < 11) {
				fail("Attack rolled too Low Strength" + attackStrength + " Mental " + attackMental + " Spirit "
						+ attackSpirit);
			}
		}
	}
	
	/**
	 * This test will insure that all the parameters for defense and defense return
	 * within the Normal Player's range from 10 to 71 (height of 66 + 10)
	 */
	@Test
	void testNormalPlayerDefenseShouldReturnBetween5And105() {
		this.setUpPlayerNormal10();
		Player player1 = new Player(this.hp, this.ability, this.power, "Player1");
		for (int count = 0; count < 10000; count++) {
			int defenseMental = player1.getMentalDefense();
			int defenseStrength = player1.getSpiritDefence();
			int defenseSpirit = player1.getMentalDefense();
			if (defenseMental > 76 || defenseStrength > 76 || defenseSpirit > 76) {
				fail("Defense rolled too high Strength" + defenseStrength + " Mental " + defenseMental + " Spirit "
						+ defenseSpirit);
			} else if (defenseMental < 10 || defenseStrength < 10 || defenseSpirit < 10) {
				fail("Defense rolled too Low Strength" + defenseStrength + " Mental " + defenseMental + " Spirit "
						+ defenseSpirit);
			}
		}
	}
	
}
