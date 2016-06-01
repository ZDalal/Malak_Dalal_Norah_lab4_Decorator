/**
 * Team Members:Dalal,Malak,Nora
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import static org.junit.Assert.*; 

import org.junit.Test;

import environment.Range;
import weapon.Plasma_Connon;
/**
 * 
 *test Plasma_Connon 
 *
 */
public class TestPlasma_Connon
{
	/**
	 * test damage+ammo without an attachment
	 */
	@Test
	public void initialization() 
	{
		Plasma_Connon pc=new Plasma_Connon();
		Range.distancre=4;
		pc.calculateDamage();
		assertEquals(50,pc.getDamage());
		//no damage
		Range.distancre=40;
		pc.calculateDamage();
		assertEquals(50,pc.getDamage());
		//reload
		pc.setActualAmmo(0);
		pc.reload();
		assertEquals(4,pc.getActualAmmo(),10);	
		//no ammo-no damage
		Range.distancre=4;
		pc.setActualAmmo(0);
		pc.calculateDamage();
		assertEquals(50,pc.getDamage());
	}

}
