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
 * test all the functionality of PowerBoster
 */
public class TestPowerBoster {
	/**
     * test damage for one PowerBoster
     * @throws MyNewException
     */
	@Test(expected = MyNewException.class)
	public void TestInitializationPower() throws MyNewException 
	{
		Weapon weapon = (Chain_Gun)new Chain_Gun();
		Attachments power= (PowerBooster) new PowerBooster(weapon);
		Range.distancre=4;
		weapon.setActualAmmo(5);
		power.calculateDamage();
		assertEquals(2,power.getDamage(),.1);
	}
	/**
	 * test for Scope And Power
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void tesScopAndPow() throws MyNewException
	{
		Weapon weapon = (Chain_Gun)new Chain_Gun();
		Attachments scop= (Scope) new Scope(weapon);
		Attachments pow= (PowerBooster) new PowerBooster(weapon);
		Range.distancre=4;
		scop.calculateDamage();
		 assertEquals(3,scop.getDamage(),.1);
 		weapon.setActualAmmo(5);
		pow.calculateDamage();	
	    assertEquals(3,pow.getDamage(),.01);
	}
	/**
	 * test for Stabilizer And Power
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void tesStablizAndPow() throws MyNewException
	{
		Weapon weapon = (Chain_Gun)new Chain_Gun();
		Attachments stab= (Stabilizer) new Stabilizer(weapon);
		Attachments pow= (PowerBooster) new PowerBooster(weapon);
		Range.distancre=4;
		weapon.setActualAmmo(0);
		stab.calculateDamage();
		assertEquals(2,stab.getDamage(),.01);
		weapon.setActualAmmo(5);
		pow.calculateDamage();
	    assertEquals(2,pow.getDamage(),.01);
	}
	/**
	 * test for Power And Power
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void PowerAndPower() throws MyNewException
	{
		Weapon weapon = (Chain_Gun)new Chain_Gun();
		Attachments cg1= (PowerBooster) new PowerBooster(weapon);
		Attachments cg2= (PowerBooster) new PowerBooster(weapon);
		weapon.setActualAmmo(5);
		Range.distancre=4;
		cg1.calculateDamage();
		assertEquals(2,cg1.getDamage(),.01);
		cg2.calculateDamage();
       assertEquals(2,cg2.getDamage(),.01);

		
	}
	/**
	 * test No more than two Attachment
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testNoMorEAttachments() throws MyNewException 
	{
		Weapon weapon = (Pistol)new Pistol();
		Attachments cg1= (PowerBooster) new PowerBooster(weapon);
		Attachments  cg2= (PowerBooster) new PowerBooster(weapon);

		Attachments  cg3= (PowerBooster) new PowerBooster(weapon);

	}
	
}
