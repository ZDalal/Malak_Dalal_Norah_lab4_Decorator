/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package environment;
import lifeform.LifeForm;
import lifeform.MockLifeForm;

import static org.junit.Assert.*;

import org.junit.Test;
/** 
 * The test cases for the Cell class
 */ 
public class TestCell 
{
	/**
	 * At initialization, the Cell should be empty and not contain a    
	 * LifeForm.   
	 */ 
	
	@Test
	public void  testInitialization()   
	{
		Cell cell = new Cell();  
		assertNull(cell.getLifeForm());
	}
	  /** 
	   * Checks to see if we change the LifeForm held by the Cell that   
	   * getLifeForm properly responds to this change.    
	   */ 
	
	@Test
	public void TestSetLifeForm() 
	{
		LifeForm bob = new MockLifeForm("Bob", 40,1);  
		LifeForm fred = new MockLifeForm("Fred", 40,1); 
	    Cell cell = new Cell(); 
	 
	    //when add to empty cell
	    boolean success= cell.addLifeForm(bob); 
	    assertTrue(success); 
        assertEquals(bob,cell.getLifeForm()); 
	   
       //when add to cell that is not empty and this should fail. 
	   success = cell.addLifeForm(fred); 
	   assertFalse(success); 
	   assertEquals(bob,cell.getLifeForm());

	 
	}
	
	  /** 
	   * Checks to see if we change the LifeForm held by the Cell that      
	   */ 
	@Test
	public void TestRemoveLifeForm() 
	{
		
		
		LifeForm entityremove;
        LifeForm bob = new MockLifeForm("Bob", 40,2);  
	    Cell cell = new Cell(); 
	 
	    //when remove  cell that is not empty
	    boolean success= cell.addLifeForm(bob); 
	    assertTrue(success); 
        assertEquals(bob,cell.getLifeForm()); 
        entityremove = cell.removeLifeForm();
 	   //System.out.println(entityremove.getName());
 	    assertNull(cell.getLifeForm());
 	    assertEquals(entityremove,bob);
 	    
 	   //when remove  cell that is  empty
 	    LifeForm entity_remove = cell.removeLifeForm();
	    //System.out.println(cell.getLifeForm());
	    assertNull(cell.getLifeForm());
	    assertEquals(null,entity_remove);
    }
	
}// end the TestCell class
