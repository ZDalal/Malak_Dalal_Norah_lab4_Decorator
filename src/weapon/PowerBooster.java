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
public class PowerBooster extends Attachments
{
	public int powerBoosterDamage;
	int Attatchments;
	/**
	 * Constructed 1 
	 */
	public PowerBooster(Weapon weapon) throws MyNewException 
	 {
		if(weapon.getNoAttatchments()<2)
		  {   
			  super.weapon=weapon;
			  weapon.setNoAttatchments(weapon.getNoAttatchments()+1);
		  }
		 else  throw new MyNewException("A weapon cannot have more than one attatchments"); 
	 }
	
	 /**
	   * To modify the calculate damage 
	   * The PowerBooster increase the damage done by
	   * the weapon similar to how the Plasma Gun computes
	   * the damage it does.
	   */
	@Override
	public int calculateDamage() 
	{
	  if(weapon.getDamage() == 0)
		{    	  
		  powerBoosterDamage= (int) ((weapon.calculateDamage()*((1+(weapon.getActualAmmo()/weapon.getMaxAmmo())))));
		  setDamage(powerBoosterDamage);
		}
	  else 
		{
		  powerBoosterDamage= (int) ((weapon.getDamage()*(1+(weapon.getActualAmmo()/weapon.getMaxAmmo()))));
		  setDamage(powerBoosterDamage);
		}
		
	  return (int) weapon.getDamage();
	}
}//end the class
