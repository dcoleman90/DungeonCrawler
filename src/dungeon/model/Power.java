package dungeon.model;

/**
 * This class is the power class - it determines how effective attacks are
 * 
 * @author Drew Coleman
 *
 */
public class Power {
	private int strength;
	private int force;
	private int intellegance;

	/**
	 * This is the default constructor it sets all Power variables to 1
	 */
	public Power() {
		this.strength = 1;
		this.force = 1;
		this.intellegance = 1;
	}

	public Power(int acceptedStrenght, int acceptedForce, int acceptedIntellegance) {
		this.strength = this.parameterCheck(acceptedStrenght);
		this.force = this.parameterCheck(acceptedForce);
		this.intellegance = this.parameterCheck(acceptedIntellegance);
	}

	private int parameterCheck(int acceptedValue) {
		int returnedValue = 0;
		if (acceptedValue < 1) {
			returnedValue = 0;
		} else {
			returnedValue = acceptedValue;
		}
		return returnedValue;
	}

	/**
	 * Getters/Setters and Adders
	 * 
	 * Getters perform as expected
	 * 
	 * Setters will not allow a negative value to be applied all negative values are
	 * turned to one
	 * 
	 * Adders add the accepted value to the score - if the added value is negitive
	 * AND would cause the value to equal 0 or less then the value is reset to 1
	 */

	public int getStrength() {
		return strength;
	}

	public void setStrength(int addedStrength) {
		this.strength = this.parameterCheck(addedStrength);
	}

	public void addStrength(int addedStrength) {
		this.strength += addedStrength;
		this.strength = this.parameterCheck(this.strength);
	}

	public int getForce() {
		return force;
	}

	public void setForce(int addedForce) {
		this.force = this.parameterCheck(addedForce);
	}

	public void addForce(int  addedForce) {
		this.force += addedForce;
		this.force = this.parameterCheck(this.force);
	}

	public int getIntellegance() {
		return intellegance;
	}

	public void setIntellegance(int acceptedValue) {
		this.intellegance = this.parameterCheck(acceptedValue);
	}

	public void addIntellegence(int addedIntellegence) {
		this.intellegance += addedIntellegence;
		this.intellegance = this.parameterCheck(this.intellegance);
	}
}
