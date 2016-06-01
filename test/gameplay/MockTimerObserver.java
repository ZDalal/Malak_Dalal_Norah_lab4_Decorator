/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;

public class MockTimerObserver implements TimeObserver
{
public   int round;
	@Override
	public void updateTime(int time) 
	{
		this.round=time;
		
	}
	

}
