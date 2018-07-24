package dungeon.model;

import java.util.Random;

/**
 * This class inherits from Combatant and is an abstract class
 * @author Drew Coleman
 * @version 07/17/2018
 *
 */
public abstract class Combatant implements CombatantInterface {
	private Health hp;
	private Ability ability;
	private Power power;
	private int resultOfFate;

	
	/**
	 * This is the default constructor setting all values to their default states
	 */
	public Combatant() {
		this.hp = new Health();
		this.ability = new Ability();
		this.power = new Power();
		this.resetFate();
	}
	
	public Combatant(Health acceptedHP, Ability acceptedAbility, Power acceptedPower) {
		this.hp = acceptedHP;
		this.ability = acceptedAbility;
		this.power = acceptedPower;
		this.resetFate();
	}
	
	public void resetFate() {
		this.resultOfFate = new Random().nextInt(100) + 1;
	}
	
	/**
	 * Perform a physical attack
	 * @return 
	 */
    public int attackPhysical(){
    	return this.getOffenceChance() + this.ability.getPhysical();
    } 
	
	/**
	 * Perform a mental attack
	 * @return 
	 */
    public int attackMental(){
    	return this.getOffenceChance() + this.ability.getMental();
    }
	
	/**
	 * Perform a Spirit Attack
	 * @return 
	 */
    public int attackSpirit(){
    	return this.getOffenceChance() + this.ability.getSpirit();
    }
	
	/**
	 * get Physical Defense
	 */
    public int getPhysicalDefence(){
    	int defence;
    	defence = (this.getDefence()) + this.ability.getPhysical();
    	return defence;
    }
	
	/**
	 * get mental defense
	 */
    public int getMentalDefense(){
    	int defence;
    	defence = (this.getDefence()) + this.ability.getMental();
    	return defence;
    }
	
	/**
	 * get spirit defense
	 */
    public int getSpiritDefence(){
    	int defence;
    	defence = (this.getDefence()) + this.ability.getSpirit();
    	return defence;
    }
    
    /**
     * This method gets number for defense for the three abilities
     * @return 2/3 of this.resultOfFate
     */
    private int getDefence() {
    	this.resetFate();
    	return (int)(this.resultOfFate * 0.66);
    }
    
    private int getOffenceChance() {
    	this.resetFate();
    	return (int)(this.resultOfFate);
    }
	
    
    
    public int getPhysical() {
    	return this.ability.getPhysical();
    }
    
    public int getMental() {
    	return this.ability.getMental();
    }
    
    public int getSpirit() {
    	return this.ability.getSpirit();
    } 
    
	/**
	 * Physical Attack damage
	 * @return strength
	 */
    public int getStrength(){
    	return this.power.getStrength();
    }
	
	/**
	 * Mental attack damage
	 * @return intelligence
	 */
    public int getIntellegance(){
    	return this.power.getIntellegance();
    }
	
	/**
	 * Spirit attack damage
	 * @return force
	 */
    public int getForce(){
    	return this.power.getForce();
    }
	
	/**
	 * Returns true if it is the players turn
	 * @return true only if it is the players turn
	 */
    
   // public boolean getIsMyTurn(){}
	
	/**
	 * returns amount of health
	 * @return health
	 */
    public int getHealthRemaining(){
    	return this.hp.getHealth();
    }
	
	/**
	 * returns true if the combatant is dead
	 */
    public boolean isDead(){
    	return this.hp.isDead();
    }

	/**
	 * adds health to the combatant
	 */
    public void addHealth(int healthGained){
    	this.hp.addHealth(healthGained);
    }
	
	/**
	 * removes health from the combatant
	 */
    public void removeHealth(int healthLost){
    	this.hp.removeHealth(healthLost);
    }
}
