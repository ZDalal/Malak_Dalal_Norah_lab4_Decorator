/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;
/**
 * Used to receive updates from a subject that tracks
 * information about time.
 *
 */
public interface TimeObserver 
{
	/**
	 * To update time that change from a subject
	 * @param time
	 */
	public void updateTime(int time);
}
