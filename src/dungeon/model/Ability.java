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
	 */
	public Ability(int acceptedPhysical, int acceptedSpirit, int acceptedMental) {
		this.physical = acceptedPhysical;
		this.spirit = acceptedSpirit;
		this.mental = acceptedMental;
	}

	//// Getter/Setters and adders which add the accepted value to the corresponding
	//// ability
	public int getPhysical() {
		return physical;
	}

	public void setPhysical(int physical) {
		this.physical = physical;
	}

	public void addPhysical(int addedPhysical) {
		this.physical += addedPhysical;
	}

	public int getSpirit() {
		return spirit;
	}

	public void setSpirit(int spirit) {
		this.spirit = spirit;
	}

	public void addSpirit(int acceptedSpirit) {
		this.spirit += acceptedSpirit;
	}

	public int getMental() {
		return mental;
	}

	public void setMental(int mental) {
		this.mental = mental;
	}

	public void addMental(int acceptedMental) {
		this.mental += acceptedMental;
	}
}
