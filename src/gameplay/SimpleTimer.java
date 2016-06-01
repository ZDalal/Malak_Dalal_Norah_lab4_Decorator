/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;

import java.util.ArrayList;


/**
 * The class encapsulating the SimpleTimer.
 */

public class SimpleTimer extends Thread implements Timer 
{
	/**
	 * ArrayList supports Java's use of generics. This allows me to specify
	 * what type of information ArrayList can hold.
	 */
	ArrayList <TimeObserver> theObservers = new ArrayList <TimeObserver>();
	public int round;
	/**
	 * implement the run method to tell Java the timechange
	 *  actions to take while it run in the background.
	 */
	@Override
	public void run()
	{
		while(true)
		{
			updateRound();
			timeChanged();
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void updateRound() 
	{
round++;
	}

	/**
	 * Add the object to the list of observer.
	 */
	@Override
	public void addTimeObserver(TimeObserver observer) 
	{
		theObservers.add(observer);
	}

	/**
	 * Remove the object from the list of observer.
	 */
	@Override
	public void removeTimeObserver(TimeObserver observer) 
	{
		theObservers.remove(observer);
	}
	
	/**
	 * Let the observers know something has happened.
	 */
	@Override
	public void timeChanged() 
	{
		for (int index =0; index< theObservers.size(); index++)
		{
			TimeObserver observer = theObservers.get(index);
			observer.updateTime(getRound());
			
		}

	}
	
	/**
	 * @return the value of round.
	 */
	public int getRound() 
	{
		return round;
	}
	
	/**
	 * To set new value to round.
	 */
	public void setRound(int x)
	{
		round=x;
	}
	
	/**
	 * @return ArrayList that contains observer object
	 */
	public ArrayList <TimeObserver> getObservers() 
	{
		
		return theObservers;
	}
}// end the class
