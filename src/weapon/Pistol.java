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
public class Pistol extends GenericWeapon
{
	
	/**
	 * Constructor 1
	 */
	public Pistol()
	{
		baseDamage=(float) 10.0;
		maxRange=(float) 25.0;
		rate_of_Fire=(float) 2.0;
		max_Ammo=(float) 10.0;
		actual_ammo=(float) 10.0;	
	}
	
	/**
	 * This method calculate damage for pistol weapon, 
	 * it does more damage the closer you are to the target
	 */
	@Override
	public int calculateDamage() 
	{
		if(Range.distancre>0 && Range.distancre<=25 && actual_ammo >0)
		  {
			damage=(int) (baseDamage*((maxRange-Range.distancre+5)/maxRange));
			setDamage((int) damage);
			actual_ammo--;
			rate_of_Fire--;
		  }
		else if (Range.distancre>26 && actual_ammo >0)
		 {
			actual_ammo--;
			rate_of_Fire--;	
		 }
		
		return (int) getDamage();
	}
}//end the class
