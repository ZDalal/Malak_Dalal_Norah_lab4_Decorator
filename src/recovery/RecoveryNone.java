/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;

import recovery.RecoveryBehavior;
/**
 * The class encapsulating the RecoveryNone.
 */
public class RecoveryNone implements RecoveryBehavior 
{

	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		return currentLife;
	}

}
