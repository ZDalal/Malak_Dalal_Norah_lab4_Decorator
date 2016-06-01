/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package lifeform;
/**
 *  Tests the functionality provided by the Human class   
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestHuman 
{
	//All these test bellow for observer code
	/**
	 * To check for attack as default.
	 */
	@Test
	public void testAttacDefult()
	{ 
		 Human human1 = new Human("Bob", 40,10); 
		 assertEquals(5,human1.getAttack());
	}
	/**
	 * To test the value of ArmorPoints and CurrentLifePoints
	 * in different saturation 
	 */
	@Test
	public void testtakeHit()
	{
		// armorPoints>damage
	   
	    Human human1 = new Human("Bob", 40,10);  
	    Human human2 = new Human("fred", 40,15); 
		human1.attack(human2);
	    assertEquals(40,human2.getCurrentLifePoints());
		
		//0<armor<damage
		Human human3 = new Human("Bob", 40,10);  
		Human human4 = new Human("fred", 40,3); 
		human3.attack(human4);
	    assertEquals(38,human4.getCurrentLifePoints());

	    //armoe==attac
	    Human human5,human6 ; 
		human5 = new Human("Bob", 40,10);  
		human6 = new Human("fred", 40,5); 
		human5.attack(human6);
	    assertEquals(35,human6.getCurrentLifePoints());
    }
	//All these test bellow for Strategy Pattern

	/**
	   * When a Human is created, it should know its name,how   
	   * many life points it has,and armor points.
	   */ 
	@Test
	public void testInitialization()  
	 {  
		Human human ; 
		human = new Human("Bob", 40,5);  
		assertTrue(human instanceof Human);
	    
	 }  
	@Test
	public void testArmor()
	{
		//Test set and get ArmorPoints
		Human human ; 
		human = new Human("Bob", 40,10); 
	    int armor=3;
	    human.setArmorPoints(armor);
	    assertEquals(armor,human.getArmorPoints());
	   
	    // Test border case , when the armor pints is <0
	    human = new Human("Bob", 40,-5);  
	    assertEquals(0,human.getArmorPoints()); 
		
	    //Test border case , when the armor pints is =>0
		human = new Human("Bob", 40,10);  
	    assertEquals(10,human.getArmorPoints()); 
	   
	    
	}
}
