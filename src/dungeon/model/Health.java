package dungeon.model;

public class Health {
	private int healthPoints;
	boolean isDead;

	/**
	 * This is the default value it sets healthPoints to 10
	 */
	public Health() {
		this.healthPoints = 10;
		this.isDead = false;
	}

	/**
	 * This is the one parameter constructor for Health it sets this.healthPoints to the accepted value
	 * @param acceptedHealth is the accepted value for this.healthPoints
	 */
	public Health(int acceptedHealth) {
		if (acceptedHealth > 0) {
			this.healthPoints = acceptedHealth;
		} else {
			this.healthPoints = 1;
		}
		this.isDead = false;
	}

	/**
	 * This method sets isDead to true sets this.healthPoints to 0;
	 */
	public void instantKill() {
		this.isDead = true;
		this.healthPoints = 0;
	}

	/**
	 * This method checks this.healthPoints and insures it is above zero else this.isDead
	 * is set to true
	 * 
	 * @return this.isDead
	 */
	public boolean checkForDeath() {
		if (this.healthPoints <= 0) {
			this.isDead = true;
		}
		return this.isDead;
	}

	/**
	 * Is the getter for this.healthPoints
	 * @return this.healthPoints
	 */
	public int getHealth() {
		return this.healthPoints;
	}

	/**
	 * This method sets the healthPoints at the accepted value
	 * @param healthPoints is the accepted value for this.healthPoints
	 */
	public void setHealth(int healthPoints) {
		this.healthPoints = healthPoints;
	}

	/**
	 * getter for isDead
	 * @return return isDead
	 */
	public boolean isDead() {
		this.checkForDeath();
		return this.isDead;
	}

	/**
	 * This method sets isDead to the accepted value
	 * @param isDead = sets this.isDead to the accepted value
	 */
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	/**
	 * This method adds the addedHealth to  this.healthPoints 
	 * @param addedHealth is the healthPoints added
	 */
	public void addHealth(int addedHealth) {
		this.healthPoints += addedHealth;
	}
	
	/**
	 * This method removes the removeHealth from this.healthPoints
	 * @param removeHealth is the removed healthPoints
	 */
	public void removeHealth(int removeHealth) {
		this.healthPoints -= removeHealth;
	}
}
