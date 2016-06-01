/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package environment;

import lifeform.LifeForm;

/** 
 * A Cell that can hold a LifeForm.   
 */  

public class Cell 
{
    // Instant of class LifeForm 	
	LifeForm entiry ;
		
	/**
	 * Constructor	
	 */
	public  Cell()
	{
	}
	
	/**
	 * To get the current lifeForm 
	 */
	public LifeForm getLifeForm()
	{
		return entiry;
	}
			
	 /** 
	  * Tries to add the LifeForm to the Cell.  Will not add if a   
	  *  LifeForm is already present.  
	  *  @ return true if the LifeForm was added to the Cell, false otherwise.   
	  */  
	 public boolean addLifeForm(LifeForm lf)
	 {   
		 if(entiry != null)
	       {
		      return false;
		   }
	     else 
	    	 entiry=lf;
	    	 return true;	
	 }
	/**
	 * Tries to remove the LifeForm from the Cell.
	 */
	 public LifeForm removeLifeForm()
	 {      
		  LifeForm temp;
		  temp= entiry;
		  entiry=null;
		  return temp;
	}

}//end class cell
