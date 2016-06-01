/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package recovery;
/**
 * The class encapsulating the RecoveryFractional.
 */
public class RecoveryFractional implements RecoveryBehavior 
{
  private double percentRecovery;
	
  /**
   * construct
   */
  public RecoveryFractional(double percent)
	{
		percentRecovery=percent;
	}
  
	@Override
	public int calculateRecovery(int currentLife, int maxLife) 
	{
		double rec=percentRecovery*currentLife;
		
		if(currentLife<=0)
		{
			currentLife=0;
		}
		else if(currentLife<maxLife)
		{
		  currentLife=(int) (currentLife+rec);
		  if(currentLife>=maxLife)
		  currentLife=maxLife;
		}
		return currentLife;
	}
}// end RecoveryFractional class
