/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;

import static org.junit.Assert.*;




import org.junit.Test;

import weapon.MockWeapon;

/**
 *  Tests the functionality provided by the SimpleTimer class   
 */
public class TestSimpleTimer 
{
	@Test
	public void testSetupSimpleTime() 
	{
		//50
		MockWeapon mock=new MockWeapon();
		SimpleTimer t= new SimpleTimer();
		t.addTimeObserver(mock);
		t.setRound(2);
		//t.timeChanged();
		//assertEquals(2,mock.round);
		
		
		
	}
	/**
	   * When a SimpleTime is created, it should know its object from Timer
	   * and its size ==0 
	   */   
	@Test
	public void testInitialization() 
	{
		SimpleTimer t= new SimpleTimer();
		assertEquals(0,t.round);
		assertEquals(0,t.theObservers.size());
		assertTrue(t instanceof Timer);
	}
	
	/**
	 * Test updates time correctly with and without observer object.
	 */
	@Test
	public void testUpdateTime() 
	{
		SimpleTimer st= new SimpleTimer();
		MockSimpleTimerObserver mock1 = new MockSimpleTimerObserver();
		MockSimpleTimerObserver mock2 = new MockSimpleTimerObserver();
		//without observe
		assertEquals(0,mock1.myTime);
		assertEquals(0,mock2.myTime);
		//with observe
		st.addTimeObserver(mock1);
		st.addTimeObserver(mock2);
        st.timeChanged();
	    assertEquals(st.getRound(),mock1.myTime);
	    assertEquals(st.getRound(),mock1.myTime);
	 }
	/**
	 * Test add and remove simpleTimerObserver to ArrayList
	 */
	@Test
	public void testAddAndRemove() 
	{
		SimpleTimer st= new SimpleTimer();
		MockSimpleTimerObserver mock = new MockSimpleTimerObserver();
		//test add
		st.addTimeObserver(mock);
		assertEquals(1,st.getObservers().size());
		assertEquals(mock,st.getObservers().get(0));
		//test remove
		st.removeTimeObserver(mock);
		assertEquals(0,st.getObservers().size());
	}
	/**
	 * To check observer receive time updates
	 */
	@Test
	public void testReciveTimeUpdate()
	{
		SimpleTimer st= new SimpleTimer();
		MockSimpleTimerObserver mock1 = new MockSimpleTimerObserver();
		st.addTimeObserver(mock1);
		st.setRound(6);
		st.timeChanged();
		assertEquals(6,mock1.myTime);
	}
	/**
	 * In my plane I decided that SimpleTime should send an update 
	 * out every second
	 * @throws InterruptedException
	 */
	@Test
	public void testSimpleTimerAsThread() throws InterruptedException
	{
		SimpleTimer st= new SimpleTimer();
		MockSimpleTimerObserver mock1 = new MockSimpleTimerObserver();
		st.addTimeObserver(mock1);
		st.setRound(0);
		st.start();
		Thread.sleep(250);
		for(int x=0; x<5;x++)
		{
			st.setRound(x);
			st.updateRound();
			assertEquals(x+1,st.getRound());
			Thread.sleep(1000);
		}
	 }
	
	
	
	/**
	 * class for testing SimpleTimer.
	 */
	public class MockSimpleTimerObserver implements TimeObserver
	{
		public int myTime=0;


		/**
		 * To update time that change from a subject
		 * @param time
		 */
		@Override
		public void updateTime(int time)
		{
			myTime=time;
		}
	}
}//end 