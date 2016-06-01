/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

/**
 * Weapon class holds by lifeform
 * 
 */

import gameplay.TimeObserver;

public interface Weapon extends TimeObserver
{
	/**
	 *  to calculate damage for the weapon
	 */
	public int calculateDamage();
	/**
	 * to reload the ammo
	 */
	public void reload();
	/**
	 * to manage the rate of fire in each round
	 */
	public void RateOfFire();
	/**
	 * set rate of fire
	 */
	public void setRateofFire(float rateFire);
	/**
	 * set base damage
	 */
	public void setBaseDamge(float baseDamage);
	/**
	 * set max range
	 */
	public void setMaxrRange(float maxRange);
	/**
	 * set max ammo
	 */
	public void setMaxAmmo(float ammo);
	/**
	 * set actual ammo
	 */
	public void setActualAmmo(float ammo);
	/**
	 * set damage
	 */
	public void setDamage(int damage);
	/**
	 * set the number of attachements
	 */
	public void setNoAttatchments(int Attatchments);
	/**
	 * get base damage
	 */
	public float getBaseDamge();
	/**
	 * get max range
	 */
	public float getMaxrRange();
	/**
	 * get rate of fire
	 */
	public float getRateFire();
	/**
	 * get max ammo
	 */
	public float getMaxAmmo();
	/**
	 * get actual ammo
	 */
	public float getActualAmmo();
	/**
	 * get damage
	 */
	public int getDamage();
	/**
	 * get number of attachments
	 */
	public int getNoAttatchments();

}
