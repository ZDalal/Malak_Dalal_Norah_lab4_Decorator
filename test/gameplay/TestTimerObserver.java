/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTimerObserver 
{

	@Test
	public void testUpdateTime() 
	{
		MockTimerObserver to= new MockTimerObserver();
		to.updateTime(4);
		assertEquals(4,to.round);
	}

}
