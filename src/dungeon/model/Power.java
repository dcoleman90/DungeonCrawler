package dungeon.model;

/**
 * This class is the power class - it determines how effective attacks are
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
		if(acceptedStrenght <= 0) {
			this.strength = 1;
		} else {
			this.strength = acceptedStrenght;
		}
		
		if(acceptedForce <= 0 ) {
			this.force = 1;
		} else {
			this.force = acceptedForce;
		}
		
		if (acceptedIntellegance <= 0) {
			this.intellegance = 1;
		} else {
			this.intellegance = acceptedIntellegance;
		}
	}

	/////////////Getters/Setters and Adders  
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public void addStrength(int addedStrength) {
		if (addedStrength + this.strength <= 0) {
			this.strength = 1;
		} else {
			this.strength += addedStrength;
		}
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public void addForce(int addedForce) {
		if (addedForce + this.force <= 0) {
			this.force = 1;
		} else {
			this.force += addedForce;
		}
	}
	public int getIntellegance() {
		return intellegance;
	}

	public void setIntellegance(int intellegance) {
		this.intellegance = intellegance;
	}
	
	public void addIntellegence(int addedIntellegence) {
		if (addedIntellegence + this.intellegance <= 0) {
			this.intellegance = 1;
		} else {
			this.intellegance += addedIntellegence;
		}
	}
}
