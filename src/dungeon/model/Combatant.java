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
	private Random fate;
	private int resultOfFate;
	private String name;
	
	/**
	 * This is the default constructor setting all values to their default states
	 */
	public Combatant() {
		this.hp = new Health();
		this.ability = new Ability();
		this.power = new Power();
		this.fate = new Random();
		this.resultOfFate = this.fate.nextInt(100);
		this.name = "Combatant";
	}
	
	public Combatant(Health acceptedHP, Ability acceptedAbility, Power acceptedPower, String name) {
		this.hp = acceptedHP;
		this.ability = acceptedAbility;
		this.power = acceptedPower;
		this.fate = new Random();
		this.resultOfFate = this.fate.nextInt(100);
		this.name = name;
	}
	
	/**
	 * Perform a physical attack
	 * @return 
	 */
    public int attackPhysical(){
    	int attack;
    	attack = this.resultOfFate + this.ability.getPhysical();
    	return attack;
    } 
	
	/**
	 * Perform a mental attack
	 * @return 
	 */
    public int attackMental(){
    	int attack;
    	attack = this.resultOfFate + this.ability.getMental();
    	return attack;
    }
	
	/**
	 * Perform a Spirit Attack
	 * @return 
	 */
    public int attackSpirit(){
    	int attack;
    	attack = this.resultOfFate + this.ability.getSpirit();
    	return attack;
    }
	
	/**
	 * get Physical Defense
	 */
    public int getPhysicalDefence(){
    	int defence;
    	defence = (this.resultOfFate / 2) + this.ability.getPhysical();
    	return defence;
    }
	
	/**
	 * get mental defense
	 */
    public int getMentalDefense(){
    	int defence;
    	defence = (this.resultOfFate / 2) + this.ability.getMental();
    	return defence;
    }
	
	/**
	 * get spirit defense
	 */
    public int getSpiritDefence(){
    	int defence;
    	defence = (this.resultOfFate / 2) + this.ability.getSpirit();
    	return defence;
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
	 * returns the name
	 * @return the Combatant's name
	 */
    public String getName(){
    	return this.name;
    }
	
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
