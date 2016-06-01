/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package lifeform;


import environment.Range;
import weapon.Weapon;
import gameplay.TimeObserver;

/**
 *  Keeps track of the information associated with a simple 
 *  life form.Also provides the functionality related to the 
 *  life form.   
 */  
public abstract class LifeForm implements TimeObserver
{

 //Keep the name and current life points of the lifeForm	
 protected String myName; 
 protected int currentLifePoints;
 protected int attacks_strength;
 public int time;
 protected Weapon weapon;

 /**
  * Lifeform can pickup a weapon
  */
 public void pickup(Weapon weap)
 {
	if(this.weapon==null)
	{
 this.weapon=weap;
	}

 }
 /**
  * Lifeform can drop a weapon
  */
 public void drop()
 {
	this.weapon=null;
 }
 
 /** 
  * Create an instance    
  * @param name the name of the lifeForm   
  * @param points the current starting life points of the life form   
  */  
   public LifeForm(String name,int points, int strength)
   {
	 myName=name;
	 if(points>0)
	 {
	 currentLifePoints=points;
	 }
	 attacks_strength=strength;
	 weapon=null;
   }

  /**
   * Constructor 2
   */
   public LifeForm()
   {
   }
   
 /** 
  * @return the name of the lifeForm.    
  */  
   public String getName()  
   {  
      return myName;  
   }  

/**
 * Return the current lifeForm 
 */
   public int getCurrentLifePoints()  
   {  
     return currentLifePoints;  
   }  
   
   /**
    * Take some points from currentlifePoints.
    */
  public void takeHit(int damage)
  {
	  if(currentLifePoints>damage)
	  {
		  currentLifePoints=currentLifePoints- damage;
	  }
	  else
		  currentLifePoints=0;  
  
  }
  /**
   * Allow 
   * @param attacks_strength
   */
  public void attack(LifeForm lifeform)
  {
	  if(this.weapon==null || this.weapon.getActualAmmo()==0 && Range.distancre<=5)
	  {
	  if(lifeform.currentLifePoints>0)
		 lifeform.takeHit(getAttack());
	  }
	  else if  (this.weapon.getActualAmmo()>0 && Range.distancre<=this.weapon.getMaxrRange())
	  {
		  lifeform.currentLifePoints=lifeform.currentLifePoints-this.weapon.calculateDamage();
	  }
		  
		  
	  
  }
  /**
   * @return strength 
   */
  public int getAttack()
  {
 return attacks_strength;
  }
  /**
   * To set new value for strength
   */
  public void setAttack(int att)
  {
   this.attacks_strength=att;
  }
  /**
   * To update time
   */
  public void updateTime(int time)
  {
	 this.time=time;
  }
//5-27
  

 
} // end the class LifeForm


