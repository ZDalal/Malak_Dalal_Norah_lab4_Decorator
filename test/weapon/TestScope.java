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
import weapon.Attachments;
import weapon.Pistol;
import weapon.Weapon;
import weapon.PowerBooster;
import weapon.Scope;
/**
 * test all the functionality of scope
 */
public class TestScope 
{
     /**
      * test damage for one scope
      * @throws MyNewException
      */
	@Test(expected = MyNewException.class)
	public void TestInitializationScope() throws MyNewException 
	{
	Range.distancre=4;
	Weapon weapon = (Pistol) new Pistol();
	Attachments scop=  (Scope) new Scope(weapon);
	scop.calculateDamage();
	assertEquals(18,scop.getDamage());

	}
	/**
	 * test damage with two scopes
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testScopAndSScop() throws MyNewException
	{
		Weapon weapon = (Pistol)new Pistol();
		Attachments scop1= new Scope(weapon);
		Attachments scop2= new Scope(weapon);
		Range.distancre=4;
		scop1.calculateDamage();
		assertEquals(18,scop1.getDamage());
		scop2.calculateDamage();
		assertEquals(33,scop2.getDamage());
	}
	/**
	 * test damage of Stabilizer And Scope
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testStabilizerAndScop() throws MyNewException 
	{
		Weapon weapon = (Pistol)new Pistol();
		Attachments  sta=  new  Stabilizer(weapon);
		Attachments scop= new Scope(weapon);
		Range.distancre=4;
		weapon.setActualAmmo(0);
		sta.calculateDamage();
		 assertEquals(12,sta.getDamage());
		scop.calculateDamage();
		assertEquals(22,scop.getDamage());
		
	}
	/**
	 * test damage of powerBooster And Scope
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testpowerBoosterAndScop() throws MyNewException 
	{
		Weapon weapon = (Pistol)new Pistol();
		Attachments  powerBooster=  new  PowerBooster(weapon);
		Attachments scop= new Scope(weapon);
		Range.distancre=4;
		weapon.setActualAmmo(6);
		powerBooster.calculateDamage();
		assertEquals(15,powerBooster.getDamage(),.1);
		scop.calculateDamage();
		assertEquals(27,scop.getDamage());
	
		
	}
	/**
	 * test No more than two Attachment
	 * @throws MyNewException
	 */
	@Test(expected = MyNewException.class)
	public void testNoMorEAttachments() throws MyNewException 
	{
		Weapon weapon = (Pistol)new Pistol();
		Attachments scop1= new Scope(weapon);
		Attachments  scope2=  new Scope(weapon);
		//should be fails 
		Attachments  scope3=  new  Scope(weapon);
		
	}
}

