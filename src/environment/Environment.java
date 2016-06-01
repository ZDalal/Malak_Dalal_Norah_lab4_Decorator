/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package environment;
import lifeform.LifeForm;

/**
 * To store a grid of cell instance in array two dimensional
 */
public class Environment 
{
	Cell [] [] Cells= new Cell[2][3];
	/**
	 * Constructor	
	 */
	public Environment(int row, int col)
	{
		for( row=0;row<2;row++)
		{ 
		  for( col=0;col<3;col++)
		  {
			Cells[row][col]= new Cell();
		  }
		}
	}
	 /** 
	  * Tries to add the Cell to the Environment.  Will not add  if 
	  * the row and col are invalid or if a LifeForm is already in that Cell.
	  *  @ return true if successfully added, false otherwise.   
	  */  
	public boolean addLifeForm(int row, int col, LifeForm entity)
	{
	 if( (row==0 || row==1) && (col>=0 ||  col<=2) && (Cells[row][col].getLifeForm() !=entity))
	  {
		 Cells[row][col].addLifeForm(entity);
         return true;
	  }
		       
	 else 
	  {
		return false;
	  }
	}
	/**
	 * Tries to remove the Cell from the Environment.
	 */
	public LifeForm removeLifeForm(int row, int col)
	{
		 LifeForm enitiy_remove;
		 enitiy_remove=Cells[row][col].getLifeForm();
		 Cells[row][col]=null;
		 return enitiy_remove;
		
	}
} // end the class Environment
