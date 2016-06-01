/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package gameplay;
/**
 * should be implemented by any concrete subject that
 * is part of an observer pattern
 *
 */

public interface Timer 
{
	/**
	 * Add an observer to subject's list of observers.
	 * @param oboserver
	 */
    public void addTimeObserver(TimeObserver observer);
    /**
	 * Remove an observer from the subject's list of observers.
	 * @param oboserver
	 */
    public void removeTimeObserver(TimeObserver observer);
    /**
     * Inform all observers of a change.
     */
    public void timeChanged();
}
