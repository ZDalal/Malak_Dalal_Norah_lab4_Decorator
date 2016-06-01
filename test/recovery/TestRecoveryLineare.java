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
 *  Tests the functionality provided by the RecoveryLinear class   
 */
public class TestRecoveryLineare 
{
	/**
	 * Testing with no hurt,and currentLP=maxLP  
	 */
	@Test
	public void noRecoveryWhenNotHurt() 
	{
		RecoveryLinear rl= new RecoveryLinear(3);
		int max=30;
		int r= rl.calculateRecovery(max, max);
		assertEquals(max,r);
	}
	
	/**
	 * Testing with whit hurt, and check border case
	 * @throws MyNewException 
	 */
	@Test
	public void testRecoveryLineare() throws MyNewException 
	{
		//Testing with hit,when currentLP=maxLP (40)
		Alien a=new Alien("Bob",40,new RecoveryLinear(5),3);
		a.takeHit(20);
		a.recover();
		assertEquals(25,a.getCurrentLifePoints());
		
		//Testing with hit,when 0<maxLP-currentLP<Steps(recover to maxLp w/o going over)
		//Testing border case, current life points must be equal or less max life points
		//if it is become larger than max, it must be equal max 
		Alien a1=new Alien("Bob",40,new RecoveryLinear(25),3);
		a1.takeHit(20);
		a1.recover();
		assertEquals(a1.maxLifePoints,a1.getCurrentLifePoints());
		
		//Testing with hit,when Steps<maxLP-currentLP(recover full step)
		Alien a2=new Alien("Bob",40,new RecoveryLinear(5),3);
		a2.takeHit(30);
		a2.recover();
		assertEquals(15,a2.getCurrentLifePoints());
		
		//Testing border case9(when currentLP = 0 ), current life points less 0 that means dead and current=0
		Alien a3=new Alien("Bob",40,new RecoveryLinear(2),3);
		a3.takeHit(40);
		a3.recover();
		assertEquals(0,a3.getCurrentLifePoints());
				
		
	}
	
	@Test
	public void testInitialization() 
	{
		RecoveryLinear rl= new RecoveryLinear(3);
		assertTrue(rl instanceof RecoveryBehavior);
	}
	
}
