package org.usfirst.frc.team5542.robot.commands;

import org.usfirst.frc.team5542.robot.OI;
import org.usfirst.frc.team5542.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;



/**
 *
 */
public class UserArm extends CommandBase {
	
    public UserArm() {
        requires(ArmManipulator);
    }


    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Joystick controller = Robot.oi.getController();
    	double arm = controller.getRawAxis(OI.dPad);
    	if (arm <= 8.0)
    		arm = -1.0;
    	else
    		arm = 1.0;
    	ArmManipulator.arm(arm);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	ArmManipulator.arm(0);
    }
}