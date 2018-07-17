package dungeon.model;

/**
 * This is the Combatant class it is an interface and will be used as the base for both player and monster classes
 * @author Drew Coleman
 * @version 07/17/2018
 *
 */
public interface Combatant {
	
	/**
	 * Perform a physical attack
	 */
	void attackPhysical(); 
	
	/**
	 * Perform a mental attack
	 */
	void attackMental();
	
	/**
	 * Perform a Spirit Attack
	 */
	void attackSpirit();
	
	/**
	 * get Physical Defense
	 */
	int getPhysicalDefence();
	
	/**
	 * get mental defense
	 */
	int getMentalDefense();
	
	/**
	 * get spirit defense
	 */
	int getSpiritDefence();
	
	/**
	 * Physical Attack damage
	 * @return strength
	 */
	int getStrength();
	
	/**
	 * Mental attack damage
	 * @return intelligence
	 */
	int getIntellegance();
	
	/**
	 * Spirit attack damage
	 * @return force
	 */
	int getForce();
	
	/**
	 * Returns true if it is the players turn
	 * @return true only if it is the players turn
	 */
	boolean getIsMyTurn();
	
	/**
	 * returns the name
	 * @return the Combatant's name
	 */
	String getName();
	
	/**
	 * returns amount of health
	 * @return health
	 */
	int getHealthRemaining();

}
