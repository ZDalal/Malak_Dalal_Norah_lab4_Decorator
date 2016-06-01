/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Range;
import exceptions.MyNewException;
/**
 * test all the functionality of Stabilizer
 */
public class TestStabilizer 
{
	/**
     * test damage for one Stabilizer
     * @throws MyNewException
     */
	@Test(expected = MyNewException.class)
	public void testInitializationStabilizer() throws MyNewException 
	{
		Weapon weapon = (Plasma_Connon)new Plasma_Connon();
		Attachments sta= (Stabilizer) new Stabilizer(weapon);
		Range.distancre=4;
		weapon.calculateDamage();
		weapon.setActualAmmo(0);
		sta.calculateDamage();
		assertEquals(62,sta.getDamage());	
	}
	/**
     * test damage for ScopAndStabilizer
     * @throws MyNewException
     */
	@Test(expected = MyNewException.class)
	public void testScopAndStabilizer() throws MyNewException
	{
		Weapon weapon = (Plasma_Connon)new Plasma_Connon();
		Attachments scop= (Scope) new Scope(weapon);
		Attachments sta= (Stabilizer) new Stabilizer(weapon);
		Range.distancre=4;
		//scope
		scop.calculateDamage();
		assertEquals(90,scop.getDamage(),01);
		//situation 1 , actualammo not equal 0
		sta.calculateDamage();
		assertEquals(90,sta.getDamage(),.01); 
		//situation 1 , actualammo equal 0
		weapon.setActualAmmo(0);
		sta.calculateDamage();
		assertEquals(112,sta.getDamage(),.01);

	}
	/**
	 * test for Stabilizer And Stabilizer
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testStabilizerAndStabilizer() throws MyNewException
	{
		Weapon weapon = (Plasma_Connon)new Plasma_Connon();
		Attachments sta1= (Stabilizer) new Stabilizer(weapon);
		Attachments sta2= (Stabilizer) new Stabilizer(weapon);
		Range.distancre=4;
		weapon.calculateDamage();
		weapon.setActualAmmo(0);
		sta1.calculateDamage();
		assertEquals(62,sta1.getDamage());	 
	    sta2.calculateDamage();
		assertEquals(62,sta2.getDamage(),01);	
	}
	/**
	 * test for Power Booster And Stabilizer
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testPowerAndStabilizer() throws MyNewException
	{
		Weapon weapon = (Plasma_Connon)new Plasma_Connon();
		Attachments pow= (PowerBooster) new PowerBooster(weapon);
		Attachments sta2= (Stabilizer) new Stabilizer(weapon);
		Range.distancre=4;
		weapon.setActualAmmo(4);
		pow.calculateDamage();
		assertEquals(87,pow.getDamage(),01);
    	sta2.calculateDamage();
		assertEquals(87,sta2.getDamage());
	}
	/**
	 * test No more than two Attachment
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testNoMorEAttachments() throws MyNewException 
	{
		Weapon weapon = (Plasma_Connon)new Plasma_Connon();
		Attachments sta1= (Stabilizer) new Stabilizer(weapon);
		Attachments sta2= (Stabilizer) new Stabilizer(weapon);
		//should be fails 
		Attachments sta3= (Stabilizer) new Stabilizer(weapon);
		
	}
	
}
