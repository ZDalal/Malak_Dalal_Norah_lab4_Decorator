/**
 * Team Members:Dalal,Malak,Norah
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
package weapon;

/**
 * Each attachments modify the weapon in one or more way
 *
 */

public abstract class Attachments implements Weapon
{
	Weapon weapon;
	int damage;
	
    /**
     * Abstract method will define in each attachments class
     */
	public abstract int calculateDamage();
	
	/**
	 * Implement reload()for reload the ammo for the weapon
	 */
	@Override
	public void reload()
	{
		if(weapon.getActualAmmo()==0)
			setActualAmmo(weapon.getMaxAmmo());	
	}
	/**
	 * Implement RateOfFire() to manage the rate of fire in each round for the weapon
	 */
	@Override
	public void RateOfFire()
	{
		if(weapon.getRateFire()>0)
		{
			float rate_of_Fire=(int) (weapon.getRateFire()-1);
			weapon.setRateofFire(rate_of_Fire);
			float actual_ammo=weapon.getActualAmmo()-1;
			weapon.setActualAmmo(actual_ammo);
		}
	}
	/**
	 * implement setRateofFire set rate of fire
	 */
	@Override
	public void setRateofFire(float rateFire)
	{
		weapon.setRateofFire(getRateFire());
	}
	
	/**
	 * implement setBaseDamge () set base damage
	 */
	@Override
	public void setBaseDamge(float base_Damage)
	{
		weapon.setBaseDamge(base_Damage);
	}
	
	/**
	 * implement setMaxrRange() set max range
	 */
	@Override
	public void setMaxrRange(float max_Range)
	{
	}
	/**
	 * implement setMaxAmmo() to set max ammo
	 */
	@Override
	public void setMaxAmmo(float maxAmmo)
	{
	}
	
	/**
	 * implement setActualAmmo() to set actual
	 */
	@Override
	public void setActualAmmo(float ammo)
	{
		weapon.setActualAmmo(ammo);
	}
	/**
	 * implement setDamage() to set damage
	 */
	@Override
	public void setDamage(int damage)
	{
		weapon.setDamage(damage);
	}
    /**
     * implement setNoAttatchments() to set number of attachments to each weapon
     */
	@Override
	public void setNoAttatchments(int Attatchments)
	{
		weapon.setNoAttatchments(Attatchments);
	}
	/**
	 * implement getBaseDamge() to get base damage
	 */
	@Override
	public float getBaseDamge()
	{
		return weapon.getBaseDamge();
		
	}
	/**
	 * implement getMaxrRange() to get max range
	 */
	@Override
	public float getMaxrRange()
	{
		return weapon.getMaxrRange();
	}
	/**
	 * implement getRateFire() to get rate of fire
	 */
	@Override
	public float getRateFire()
	{
		return weapon.getRateFire();
	}
	
	/**
	 * implement getMaxAmmo() to get max ammo
	 */
	@Override
	public float getMaxAmmo()
	{
		return weapon.getMaxAmmo();
	}
	
	/**
	 * implement getActualAmmo() to get actual ammo
	 */
	@Override
	public float getActualAmmo()
	{
		return weapon.getActualAmmo();
	}
	
	/**
	 * implement updateTime (int time) to know when I reload the weapon
	 */
	@Override
	public void updateTime(int time)
	{
		weapon.updateTime(time);
	}
	
	/**
	 * implement getDamage() to get damage
	 */
	@Override
	public int getDamage()
	{
		return (int) weapon.getDamage();
	}
	
	/**
	 * implement getNoAttatchments() to get number of attachments for a weapon
	 */
	@Override
	public int getNoAttatchments()
	{
		return weapon.getNoAttatchments();
	}
}
