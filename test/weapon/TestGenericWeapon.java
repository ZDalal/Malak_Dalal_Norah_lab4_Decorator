/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

import static org.junit.Assert.*;
import gameplay.SimpleTimer;

import org.junit.Test;

/**
 * test all functionality of generic weapon
 */
public class TestGenericWeapon 
{
	/**
	 * to Initialize new weapon
	 */
	@Test
	public void testInitialization()
	{
		MockWeapon mock= new MockWeapon();
		mock.baseDamage=10;
		mock.maxRange=25;
		mock.rate_of_Fire=2;
		mock.max_Ammo=10;
		mock.actual_ammo=10;
		mock.reload_rate_of_fire=mock.getRateFire();
		assertEquals(10,mock.getBaseDamge(),.01);
		assertEquals(25,mock.getMaxrRange(),.01);
		assertEquals(2,mock.getRateFire(),.01);
		assertEquals(10,mock.getMaxAmmo(),.01);
		assertEquals(10,mock.getActualAmmo(),.01);
		//use ammo when fired
		SimpleTimer t= new SimpleTimer();
		t.addTimeObserver(mock);
		t.setRound(1);
		t.timeChanged();
		mock.RateOfFire();
		assertEquals(9,mock.getActualAmmo(),.01);
		assertEquals(1,mock.getRateFire(),.01);
		mock.RateOfFire();
		assertEquals(8,mock.getActualAmmo(),.01);
		assertEquals(0,mock.getRateFire(),.01);
		mock.RateOfFire();
		assertEquals(8,mock.getActualAmmo(),.01);
		assertEquals(0,mock.getRateFire(),.01);
		//rate of fire works correctly with simple timer, and can be reloaded 
		t.setRound(2);
		t.timeChanged();
		assertEquals(2,mock.getRateFire(),.01);
		mock.RateOfFire();
		assertEquals(7,mock.getActualAmmo(),.01);
		
	}
}
