/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;
/**
 * The class encapsulating the RecoveryLinear.
 */
public class RecoveryLinear implements RecoveryBehavior
{
   private int recoveryStep;

   /**
    * construct
    */
   public RecoveryLinear(int step)
   {
	recoveryStep=step;
   }
   
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		if(currentLife<=0)
		{
			currentLife=0;
		}
		else if(currentLife<maxLife)
		{
			currentLife=currentLife+recoveryStep;
		}
		 if(currentLife>maxLife)
		 {
			currentLife=maxLife;
		}
		return currentLife;
	}
}//end the RecoveryLinear
