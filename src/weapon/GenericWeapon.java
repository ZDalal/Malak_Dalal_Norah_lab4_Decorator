/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

/**
 * GenericWeapon  is abstarct class which contains all share methods and instance variables in all subclasses
 *
 */
public abstract class GenericWeapon implements Weapon
{
	float baseDamage;
	float maxRange;
	float rate_of_Fire;
	float max_Ammo;
	float actual_ammo;
	float damage;
	int no_Attatcments;
	int time;
	float reload_rate_of_fire;
	
	/**
	 * Implement reload()for reload the ammo
	 */
	@Override
	public void reload()
	{
	if(actual_ammo==0)
		setActualAmmo(max_Ammo);
	
	}
	/**
	 * Implement RateOfFire() to manage the rate of fire in each round
	 */
	@Override
	public void RateOfFire()
	{
	if(rate_of_Fire>0)
		{
		rate_of_Fire--;
		actual_ammo--;
		}
	}
	/**
	 * implement setRateofFire set rate of fire
	 */
	@Override
	public void setRateofFire(float rateFire)
	{
		rate_of_Fire=rateFire;
	}
	/**
	 * implement setBaseDamge () set base damage
	 */
	@Override
	public void setBaseDamge(float base_Damage)
	{
		baseDamage=base_Damage;
	}
	/**
	 * implement setMaxrRange() set max range
	 */
	@Override 
	public void setMaxrRange(float max_Range)
	{
		 maxRange=max_Range;
	}
	/**
	 * implement setMaxAmmo() to set max ammo
	 */
	@Override
	public void setMaxAmmo(float maxAmmo)
	{
		 max_Ammo=maxAmmo;
		
	}
	/**
	 * implement setActualAmmo() to set actual
	 */
	@Override
	public void setActualAmmo(float ammo)
	{
		actual_ammo = ammo;
	}
	/**
	 * implement setDamage() to set damage
	 */
	@Override
	public void setDamage(int damage)
	{
		this.damage=damage;
	}
	/**
	 * implement setNoAttatchments() to set number of attachments to each weapon
	 */
	@Override
	public void setNoAttatchments(int Attatchments)
	{
		no_Attatcments=Attatchments;
	}
	/**
	 * implement getBaseDamge() to get base damage
	 */
	@Override
	public float getBaseDamge()
	{
		return baseDamage;
		
	}
	/**
	 * implement getMaxrRange() to get max range
	 */
	@Override
	public float getMaxrRange()
	{
		return maxRange;
	}
	/**
	 * implement getRateFire() to get rate of fire
	 */
	@Override
	public float getRateFire()
	{
		return rate_of_Fire;
	}
	/**
	 * implement getMaxAmmo() to get max ammo
	 */
	@Override
	public float getMaxAmmo()
	{
		return max_Ammo;	
	}
	/**
	 * implement getActualAmmo() to get actual ammo
	 */
	@Override
	public float getActualAmmo()
	{
		return actual_ammo;
	}
	/**
	 * implement getDamage() to get damage
	 */
	public int getDamage()
	{
		return (int) damage;
	}
	/**
	 * implement getNoAttatchments() to get number of attachments for a weapon
	 */
	public int getNoAttatchments()
	{
		return no_Attatcments;
	}
	
	/**
	 * implement updateTime (int time) to know when I reload the weapon
	 */
	public  void updateTime(int time)
	{
		this.time=time;
	  this.setRateofFire(this.reload_rate_of_fire);
	}
}
