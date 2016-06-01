/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import static org.junit.Assert.* ; 
import org.junit.Test;

import environment.Range;
import weapon.Pistol;
/**
 * 
 *test pistol
 *
 */
public class TestPistol 
{
	/**
	 * test damage+ammo without an attachment
	 */
	@Test
	public void testPistol() 
	{
		Pistol pw = new Pistol();
		Range.distancre=4;
		pw.calculateDamage();
		assertEquals(10,pw.getDamage());
		assertEquals(9,pw.getActualAmmo(),.1);
		//no damage
		Range.distancre=30;
		pw.calculateDamage();
		assertEquals(10,pw.getDamage(),.1);
		assertEquals(8,pw.getActualAmmo(),.1);
        //no ammo
        pw.setActualAmmo(0);
        pw.calculateDamage();
		assertEquals(10,pw.getDamage(),.1);	
		//reload
        pw.setActualAmmo(0);
        pw.reload();
        assertEquals(10,pw.getActualAmmo(),.1);
		
	}

}
