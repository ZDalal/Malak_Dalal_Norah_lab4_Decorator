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
 * The test cases for the Environment class
 */
public class TestEnvironment 
{
	/**
	 * At initialization, the Environment should be empty and not contain a    
	 * Cell.   
	 */ 
	@Test
	public void  testInitialization()   
	{
	   
		Environment env=new Environment(2,3);
		assertNull(env.Cells[0][0].getLifeForm());	
		
	}
	
	  /** 
	   * Checks to see if we add cell in Environment    
	   */ 
	
	@Test
	public void TestSetCell() 
	{
		LifeForm entity,entity1;
		entity = new MockLifeForm("bob", 40,1);  
		entity1 = new MockLifeForm("fred", 40,1);
		Environment env=new Environment(2,3);
		// add cell to correct row and col in  empty cell in Environment
		boolean success= env.addLifeForm(0, 0, entity);
		assertTrue(success); 
		// add cell to correct row and col , but the cell has the same info. 
		success= env.addLifeForm(0, 0, entity);
		assertFalse(success); 
		
		// add cell to correct row and col , but the cell has the different info. 
		success= env.addLifeForm(0, 0, entity1);
		assertTrue(success);
		 //Border test
		
		// add cell to incorrect row and col
		success= env.addLifeForm(3,5, entity);
		assertFalse(success); 
	}
	  /** 
	   * Checks to see if we delete the Cell from Environment      
	   */ 
	@Test
	public void TestRemoveLifeForm() 
	{
		 
	   // when remove cell from environment that is not empty
		LifeForm bob = new MockLifeForm("bob", 40,1);
		Environment env=new Environment(2,3);
		boolean success= env.addLifeForm(1, 0, bob);
		assertTrue(success); 
		LifeForm entity=env.removeLifeForm(1,0);
		assertNull(env.Cells[1][0]);
		assertEquals(entity,bob);
		
		// when remove cell from environment that is empty
		Environment env1=new Environment(2,3);
		LifeForm entity1=env1.removeLifeForm(1,0);
		assertNull(env.Cells[1][0]);
	    assertEquals(entity1,null);
	}
}
