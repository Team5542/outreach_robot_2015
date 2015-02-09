package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.subsystems.PDP;
import org.usfirst.frc.team5542.robot.subsystems.Arm;
import org.usfirst.frc.team5542.robot.subsystems.Camera;
import org.usfirst.frc.team5542.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *Base class to allow for direct subsystem reference in Commands and more organization in Robot.
 *I'm told this is a good idea...
 */
public abstract class CommandBase extends Command {

	protected static Drivetrain drivetrain;
	protected static Arm arm;
	protected static Camera camera;
	protected static PDP pdp;
	
	
	
	
	
	public static void init(){
		pdp = PDP.getInstance();
		drivetrain = Drivetrain.getInstance();
		arm = Arm.getInstance();
		camera = Camera.getInstance();
	}
}