/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import environment.Range;
/**
 * It is a kind of weapon, that has special equation and attributes 
 *
 */
public class Plasma_Connon extends GenericWeapon
{
	public int damage;
	/**
	 * Constructor 1
	 */
	public Plasma_Connon ()
	{
		baseDamage=(float) 50.0;
		maxRange=(float) 20.0;
		rate_of_Fire=(float) 1.0;
		max_Ammo=(float) 4.0;
		actual_ammo=(float) 4.0;
		
	}
	/**
	 * This method calculate damage for Plasma Cannon weapon, 
	 * every time is fired it weakens the power it has for the next shot.
	 */
	@Override
	public int calculateDamage() 
	{
		
		if(Range.distancre>0 && Range.distancre<=20 && actual_ammo >0)
		{
		  damage=(int) (baseDamage*(actual_ammo/max_Ammo));
		  setDamage(damage);
		}
		actual_ammo--;
		rate_of_Fire--;
		return (int) getDamage();
	}
}//end the class
