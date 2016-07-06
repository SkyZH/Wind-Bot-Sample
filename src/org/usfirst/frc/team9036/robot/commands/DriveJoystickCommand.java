package org.usfirst.frc.team9036.robot.commands;

import org.usfirst.frc.team9036.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveJoystickCommand extends Command {

    public DriveJoystickCommand() {
        requires(Robot.driveSubsystem);
    }
    
    protected void initialize() {
    }
    
    protected void execute() {
    	Robot.driveSubsystem.arcadeDrive(Robot.oi.stick);
    }
    
    protected boolean isFinished() {
        return false;
    }
    
    protected void end() {
    	Robot.driveSubsystem.stop();
    }
    
    protected void interrupted() {
    }
}
