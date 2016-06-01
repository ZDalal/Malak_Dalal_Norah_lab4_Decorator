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
public class Chain_Gun extends GenericWeapon
{
	public int damage;
	public Chain_Gun ()
	{
	baseDamage=(float)15.0;
	maxRange=(float)30.0;
	rate_of_Fire=(float)4.0;
	max_Ammo=(float)40.0;
	actual_ammo=(float)40.0;
	}
	
	/**
	 * This method calculate damage for Chain Gun weapon, 
	 * the farther the target is the more damage it does to the target
	 */
	@Override
	public int calculateDamage() 
	{
	
		if(Range.distancre>0 && Range.distancre<=30 && actual_ammo >0)
		{
		  damage= (int) (baseDamage*(Range.distancre/maxRange));	
          setDamage(damage);
		}
		actual_ammo--;
		rate_of_Fire--;
		return (int) getDamage();
	}

}//end the class