/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;

import static org.junit.Assert.*;
import lifeform.Alien;

import org.junit.Test;

import exceptions.MyNewException;
/**
 *  Tests the functionality provided by the RecoveryFractional class   
 */
public class TestRecoveryFractional 
{
	/**
	 * Testing with no hurt
	 */
	@Test
	public void noRecoveryWhenNotHurt() 
	{
		RecoveryFractional rf= new RecoveryFractional(.3);
		int max=30;
		int r= rf.calculateRecovery(max, max);
		assertEquals(max,r);
	}
	@Test
	public void testRecoveryFractional() throws MyNewException 
	{
				//Testing with hit,when currentLP=maxLP(first hit) 
				Alien a=new Alien("Bob",40,new RecoveryFractional(.5),2);
				a.takeHit(20);
				a.recover();
				assertEquals(30,a.getCurrentLifePoints());
	
				//Testing with hit,when 0<maxLP-currentLP<fraction*currentLP(recover to maxLp w/o going over)
				//Testing border case, current life points must be equal or less max life points
				//if it is become larger than max, it must be equal max
				Alien a1=new Alien("Bob",40,new RecoveryFractional(.5),2);
				a1.takeHit(1);
				a1.recover();
				assertEquals(a1.maxLifePoints,a1.getCurrentLifePoints());
				
				//Testing with hit,when fraction*currentLP<maxLP-currentLP(recover full step)
				Alien a2=new Alien("Bob",40,new RecoveryFractional(.5),2);
				a2.takeHit(20);
				a2.recover();
				assertEquals(30,a2.getCurrentLifePoints());
				
				//Testing border case(when currentLP = 0), current life points less 0 that means dead and current=0
				Alien a3=new Alien("Bob",40,new RecoveryFractional(.5),2);
				a3.takeHit(60);
				a3.recover();
				assertEquals(0,a3.getCurrentLifePoints());
				
	}
	
	@Test
	public void testInitialization() 
	{
		RecoveryFractional rf= new RecoveryFractional(.3);
		assertTrue(rf instanceof RecoveryBehavior);
	}

}
