/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import exceptions.MyNewException;
/**
 * It is a kind of attachments, that has special 
 * equation to calculate damage 
 */
public class Stabilizer extends Attachments
{
	int stabilizer_damage;
	/**
	 * Constructed 1 
	 */
	public Stabilizer(Weapon weapon) throws MyNewException 
	{
	 if(weapon.getNoAttatchments()<2)
	  {   
		super.weapon=weapon;
		 weapon.setNoAttatchments(weapon.getNoAttatchments()+1);
	  }
		 
	 else  throw new MyNewException("A weapon cannot have more than one attatchments"); 
	}
	 /**
	   * To modify the calculate damage, 
	   * The Stabilizer provides auto reload ability. 
	   * Every time the weapon is fired, if it is reduced to 0 ammo
	   * the weapon is automatically reloaded.
	   */
	@Override
	public int calculateDamage() 
	{
		if(weapon.getActualAmmo()== 0)
		{	
			weapon.reload();
		    if(weapon.getDamage()== 0)
		      {
			   stabilizer_damage=(int) (weapon.calculateDamage()+(weapon.calculateDamage()*.25));
			   weapon.setDamage(stabilizer_damage);
			  }
		    else
		      {
			   stabilizer_damage=(int) (weapon.getDamage()+(weapon.getDamage()*.25));
			   weapon.setDamage(stabilizer_damage);
		      }
		    return (int)  weapon.getDamage();
        }
		else 
		 {
			return (int) weapon.getDamage();
		 }
	}
}//end the class
