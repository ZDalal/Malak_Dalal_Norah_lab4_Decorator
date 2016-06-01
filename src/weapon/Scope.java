/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import environment.Range;
import exceptions.MyNewException;
/**
 * It is a kind of attachments, that has special 
 * equation to calculate damage 
 */
public class Scope extends Attachments
{
  public int scopeDamage;
	/**
	 * Constructed 1 
	 */
  public Scope(Weapon weapon) throws MyNewException 
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
   * The scope improves the accuracy of the weapon. 
   */
	@Override
	public int calculateDamage() 
	{
        if(weapon.getDamage() == 0 )
        {
        	scopeDamage=(int)(weapon.calculateDamage()*(1+(weapon.getMaxrRange()-Range.distancre)/weapon.getMaxrRange()));
        	setDamage(scopeDamage);
        }
        else 
        {
       	     scopeDamage=(int)(weapon.getDamage()*(1+(weapon.getMaxrRange()-Range.distancre)/weapon.getMaxrRange()));
        	weapon.setDamage(scopeDamage);
       	}
		return (int) weapon.getDamage();
	}	
}//end the class