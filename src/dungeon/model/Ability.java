package dungeon.model;

/**
 * This is the ability class - the values be used to tell how easy it is to hit
 * or defend from the corresponding attacks
 * 
 * @author Drew Coleman
 * @version 07/17/2018
 */
public class Ability {
	private int physical;
	private int spirit;
	private int mental;

	/**
	 * This is the default constructor it sets all the values to zero
	 */
	public Ability() {
		this.physical = 0;
		this.spirit = 0;
		this.mental = 0;
	}

	/**
	 * This constructor sets all the values to their corresponding accepted value
	 * 
	 * @param acceptedPhysical
	 *            = physical
	 * @param acceptedSpirit
	 *            = spirit
	 * @param acceptedMental
	 *            = mental
	 *            
	 * All parameters are capped at an 80/-80 
	 * 
	 */
	public Ability(int acceptedPhysical, int acceptedSpirit, int acceptedMental) {
		this.physical = this.parameterCheck(acceptedPhysical);
		this.spirit = this.parameterCheck(acceptedSpirit);
		this.mental = this.parameterCheck(acceptedMental);
	}

	//// Getter/Setters and adders which add the accepted value to the corresponding
	//// ability
	
	public int parameterCheck(int acceptedValue) {
		int returnedValue = 0;
		if (acceptedValue > 80) {
			returnedValue = 80;
		} else if (acceptedValue < -80) {
			returnedValue = -80;
		} else {
			returnedValue = acceptedValue;
		}
		return returnedValue;
	}
	
	/**
	 * Getter for physical
	 * @return this.physical
	 */
	public int getPhysical() {
		return this.physical;
	}

	/**
	 * Setter for physical will not allow it to surpass 80
	 * @param acceptedPhysical
	 */
	public void setPhysical(int acceptedPhysical) {
		this.physical = this.parameterCheck(acceptedPhysical);
	}

	public void addPhysical(int addedPhysical) {
		this.physical += addedPhysical;
		this.physical = this.parameterCheck(this.physical);
	}

	public int getSpirit() {
		return spirit;
	}

	public void setSpirit(int spirit) {
		this.spirit = this.parameterCheck(spirit);
	}

	public void addSpirit(int addedSpirit) {
		this.spirit += addedSpirit;
		this.spirit = this.parameterCheck(this.spirit);
	}

	public int getMental() {
		return mental;
	}

	public void setMental(int mental) {
		this.mental = this.parameterCheck(mental);
	}

	public void addMental(int addedMental) {
		this.mental += addedMental;
		this.mental = this.parameterCheck(this.mental);
	}
}
