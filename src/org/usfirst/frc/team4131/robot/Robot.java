package org.usfirst.frc.team4131.robot;

import org.usfirst.frc.team4131.robot.subsystems.*;
import org.usfirst.frc.team4131.robot.commands.*;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import org.usfirst.frc.team4131.robot.OI;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot{
	//Subsystems
	public static final DriveBase drive = new DriveBase();
	public static final Move move = new Move();
	public static final Hopper hopper = new Hopper();
	public static final Climber climber = new Climber();
	public static final Shooter shooter = new Shooter();
	public static final Collector collector = new Collector();
	//OI
	public static final OI OI = new OI();
	
	public Robot(){
		
	}
	@Override
	public void robotInit(){
		
	}
	@Override
	public void autonomousInit(){
		
	}
	@Override
	public void autonomousPeriodic(){
		Scheduler.getInstance().run();
	}
	@Override
	public void teleopInit(){
		
	}
	@Override
	public void teleopPeriodic(){
		Scheduler.getInstance().run();
		move.execute();
		
	}
	@Override
	public void testInit(){
		
	}
	@Override
	public void testPeriodic(){
		Scheduler.getInstance().run();
	}
	@Override
	public void disabledInit(){
		
	}
	@Override
	public void disabledPeriodic(){
		Scheduler.getInstance().run();
	}
}
