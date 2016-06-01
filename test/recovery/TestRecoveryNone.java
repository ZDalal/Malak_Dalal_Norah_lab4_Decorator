/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;

import static org.junit.Assert.*;
import lifeform.Alien;

import org.junit.Test;
/**
 *  Tests the functionality provided by the RecoveryNone class   
 */
public class TestRecoveryNone 
{
	
	@Test
	public void testRecoveryNone() 
	{
		Alien a=new Alien("Bob",40);
		//Testing with no hit,when currentLP = maxLP 
		a.takeHit(0);
		a.recover();
		assertEquals(a.maxLifePoints,a.getCurrentLifePoints());
		//Testing with hit,when currentLP = maxLP (first hit)
		a.takeHit(20);
		a.recover();
		assertEquals(20,a.getCurrentLifePoints());	
		//Testing with hit(when currentLP < maxLP ) and dead
		a.takeHit(30);
		a.recover();
		assertEquals(0,a.getCurrentLifePoints());	
		
	}
	@Test
	public void testInitialization() 
	{
		RecoveryNone rn= new RecoveryNone();
		assertTrue(rn instanceof RecoveryBehavior);
	}
	
	
}
