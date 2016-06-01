/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;
/**
 * Interface for all recoveries type 
 */
public interface RecoveryBehavior 
{
	/**
	 * @return currntLifePoints after calculate recovery in it.
	 */
public int calculateRecovery(int currentLife,int maxLife);
}
