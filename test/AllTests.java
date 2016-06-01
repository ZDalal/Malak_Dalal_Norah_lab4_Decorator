/**
 *  Name:Norah Alqahtani
 *  Course:CSC 561
 *  Instructor: Dr. Girard
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import environment.TestCell;
import environment.TestEnvironment;
import gameplay.TestSimpleTimer;
import gameplay.TestTimerObserver;

import lifeform.TestAlien;
import lifeform.TestHuman;
import lifeform.TestLifeForm;

import recovery.TestRecoveryFractional;
import recovery.TestRecoveryLineare;
import recovery.TestRecoveryNone;
import weapon.TestChain_Gun;
import weapon.TestGenericWeapon;
import weapon.TestPistol;
import weapon.TestPlasma_Connon;
import weapon.TestPowerBoster;
import weapon.TestScope;
import weapon.TestStabilizer;

@RunWith(Suite.class)
@SuiteClasses({ TestCell.class, TestEnvironment.class,
	TestAlien.class, TestHuman.class, TestLifeForm.class,
	TestRecoveryFractional.class, TestRecoveryLineare.class,
	TestRecoveryNone.class,TestSimpleTimer.class, TestTimerObserver.class,
	TestChain_Gun.class,TestGenericWeapon.class,TestPistol.class,TestPlasma_Connon.class,
	 TestPowerBoster.class,TestScope.class,TestStabilizer.class})
public class AllTests 
{

}
