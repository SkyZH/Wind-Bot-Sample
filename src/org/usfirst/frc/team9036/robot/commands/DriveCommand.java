
package org.usfirst.frc.team9036.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team9036.robot.Robot;

/**
 *
 */
public class DriveCommand extends Command {

    public DriveCommand() {
    	super("DriveCommand");
        requires(Robot.driveSubsystem);
        setTimeout(2);
    }
    
    protected void initialize() {
    	Robot.driveSubsystem.start();
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveSubsystem.stop();
    }
    
    protected void interrupted() {
    	end();
    }
}
