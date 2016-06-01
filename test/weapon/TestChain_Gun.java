/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Range;
import weapon.Chain_Gun;

/**
 * 
 *test Chain_Gun 
 *
 */
public class TestChain_Gun
{
/**
 * test damage+ammo without an attachment
 */
	@Test
	public void testChainGun() 
	{
		Chain_Gun cg=new Chain_Gun();
		Range.distancre=4;
		cg.calculateDamage();
		assertEquals(2,cg.getDamage());
		//no damage
		Range.distancre=40;
		cg.calculateDamage();
		assertEquals(2,cg.getDamage());
		//reload
		cg.setActualAmmo(0);
		cg.reload();
		assertEquals(40,cg.getActualAmmo(),10);
		//no ammo
		Range.distancre=4;
		cg.setActualAmmo(0);
		 cg.calculateDamage();
		 assertEquals(2,cg.getDamage(),10);
		 
	}

}
