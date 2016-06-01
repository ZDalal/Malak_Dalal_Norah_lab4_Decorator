/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Range;

import weapon.Chain_Gun;
import weapon.Pistol;
import weapon.Plasma_Connon;
/**
 *  Tests the functionality provided by the LifeForm class   
 */
public class TestLifeForm 
{
	//All these test bellow for decoder pattern
	
	/**
	 * Test if life form can pick up and drop the weapon
	 */
	@Test
	public void pickupAndRemoveWeapon()
	{
		LifeForm entity1 = new MockLifeForm("Bob", 40,5);
		Pistol pw = new Pistol();
		Pistol pw2 = new Pistol();
		//can pickup a weapon
		entity1.pickup(pw);
		assertEquals(entity1.weapon,pw);
		//cannot pickup another weapon
		entity1.pickup(pw2);
		assertEquals(entity1.weapon,pw);
		//Drop a weapon
		entity1.drop();
		assertNull(entity1.weapon);
	}
	/**
	 * Test damage for the lifeform either with weapon or not
	 */
	@Test
	public void testWeaponDamage()
	{
		// test for pistol weapon
		LifeForm entity1 = new MockLifeForm("Bob", 40,5);
		LifeForm entity2 = new MockLifeForm("fred", 20,5);
		Pistol pw = new Pistol();
		Range.distancre=4;
		//uses weapon for damage with ammo.
		entity1.pickup(pw);
		entity1.attack(entity2);
		assertEquals(10,entity2.currentLifePoints);
		assertEquals(9,pw.getActualAmmo(),.01);
		//use attack strength for damage if weapon has no ammo.
		pw.setActualAmmo(0);
		entity1.attack(entity2);
		assertEquals(5,entity2.currentLifePoints);
		assertEquals(0,pw.getActualAmmo(),.01);
		
	    // attacks strength does 0 damage if range >10 feet
		Range.distancre=11;
		entity1.attack(entity2); 
		assertEquals(5,entity2.currentLifePoints);
		assertEquals(0,pw.getActualAmmo(),.01);
		//can reload
		pw.setActualAmmo(0);
		pw.reload();
		assertEquals(pw.getMaxAmmo(),pw.getActualAmmo(),.01);
		//test two different range
		//out of range
		Range.distancre=30;
		entity1.attack(entity2);
		//System.out.println(entity2.currentLifePoints);
		assertEquals(5,entity2.currentLifePoints);
	
		// test for  weapon Chain gun
		LifeForm entity3 = new MockLifeForm("Bob", 40,5);
		LifeForm entity4 = new MockLifeForm("fred", 20,5);
		Chain_Gun cg=new Chain_Gun();		
		Range.distancre=4;
		//uses weapon for damage with ammo.
		entity3.pickup(cg);
		entity3.attack(entity4);
		assertEquals(18,entity4.currentLifePoints);
		assertEquals(39,cg.getActualAmmo(),.01);

		//use attack strength for damage if weapon has no ammo.
		cg.setActualAmmo(0);
		entity3.attack(entity4);
		assertEquals(13,entity4.currentLifePoints);
		assertEquals(0,cg.getActualAmmo(),.01);
		Range.distancre=11;
	    // attacks strength does 0 damage if range >10 feet
		entity3.attack(entity4);
		assertEquals(13,entity4.currentLifePoints);
		assertEquals(0,cg.getActualAmmo(),.01);
		//can reload
		cg.setActualAmmo(0);
		cg.reload();
		assertEquals(cg.getMaxAmmo(),cg.getActualAmmo(),.01);
		
		// test for  weapon Plasma_Connon
		LifeForm entity5 = new MockLifeForm("Bob", 40,5);
		LifeForm entity6 = new MockLifeForm("fred", 100,5);
		Plasma_Connon pc=new Plasma_Connon();		
		Range.distancre=4;
		//uses weapon for damage with ammo.
		entity5.pickup(pc);
		entity5.attack(entity6);
		assertEquals(50,entity6.currentLifePoints);
		assertEquals(3,pc.getActualAmmo(),.01);
		//use attack strength for damage if weapon has no ammo.
		pc.setActualAmmo(0);
		entity5.attack(entity6);
		assertEquals(45,entity6.currentLifePoints);
		assertEquals(0,pc.getActualAmmo(),.01);
		Range.distancre=11;
	    // attacks strength does 0 damage if range >10 feet
		entity5.attack(entity6);
		assertEquals(45,entity6.currentLifePoints);
		//can reload
		pc.setActualAmmo(0);
		pc.reload();
		assertEquals(cg.getMaxAmmo(),cg.getActualAmmo(),.01);
	}
	
	
	//All these test bellow for observer code
	/**
	 * To check for attack when set new value to attack,
	 *  and as default.
	 */
	@Test
	public void testAttack()
	{
		 LifeForm entity1 = new MockLifeForm("Bob", 40,5);
		 LifeForm entity2 = new MockLifeForm("fred", 20,2);
		 //getAttacksstrength
		 assertEquals(5,entity1.getAttack());
		 assertEquals(2,entity2.getAttack());
		 
		 //Attack method
		 entity1.attack(entity2);
		 assertEquals(15, entity2.getCurrentLifePoints());
		 
		// A LifeForm with CurrentLifePoints=0 do not cause damage
		 LifeForm entity3 = new MockLifeForm("Bob", 0,5);
		 LifeForm entity4 = new MockLifeForm("fred", 20,2);
		 entity3.attack(entity4);
		 Range.distancre=4;
		 assertEquals(15, entity4.getCurrentLifePoints());
	}
	/**
	 * can track passage of time. 
	 */
	@Test
	public void testUpdateTime()
	{
		LifeForm entity1; 
		entity1 = new MockLifeForm("Bob", 40,5);
		entity1.updateTime(5);
		assertEquals(5,entity1.time);
	}
	
	//All these test bellow for Strategy Pattern

  /**
   * When a LifeForm is created, it should know its name and how   
   * many life points it has.    
   */      
	@Test
	public void testInitialization()  
	 {  
		LifeForm entity ; 
		entity = new MockLifeForm("Bob", 40,5);  
	    assertEquals("Bob", entity.getName());  
	    assertEquals(40, entity.getCurrentLifePoints());
	 } 
	
	/**
	 * Test value of currentLifePoints after call takeHit method
	 */
	@Test
	public void testtakehit() 
	{
		LifeForm entity ; 
		entity = new MockLifeForm("Bob", 40,5);
		//takeHit after the first attack when 
		entity.takeHit(20);
		assertEquals(20,entity.getCurrentLifePoints());
		// takeHit when currentLP>0
		entity.takeHit(5);
		assertEquals(15,entity.getCurrentLifePoints());
		// takeHit when currentLP=0
		entity.takeHit(15);
		assertEquals(0,entity.getCurrentLifePoints());
		}
}


