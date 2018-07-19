package dungeon.model;


/**This class is the Player class it will implement 
 * 
 * @author Drew Coleman
 *
 */
public class Player extends Combatant{
	private String name;
	
	/**
	 * This is the default constructor which builds a default combatant 
	 * @param name is the name of the player
	 */
	public Player(String acceptedName) {
		super();
		if (acceptedName == null) {
			throw new IllegalArgumentException("The Player's name cannot be null");
		}
		this.name = acceptedName;
	}
	
	public Player(Health acceptedHP, Ability acceptedAbility, Power acceptedPower, String name) {
		super(acceptedHP, acceptedAbility, acceptedPower, name);
	}
	
	/**
	 * returns the name
	 * @return the Combatant's name
	 */
    public String getName(){
    	return this.name;
    }
	
    /**
     * sets the name to the accepted value
     */
    public void setName(String acceptedName) {
    	if (acceptedName == null) {
			throw new IllegalArgumentException("The Player's name cannot be null");
		}
    	this.name = acceptedName;
    }
	

}
