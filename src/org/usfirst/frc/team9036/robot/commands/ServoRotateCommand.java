package org.usfirst.frc.team9036.robot.commands;

import org.usfirst.frc.team9036.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ServoRotateCommand extends Command {

    public ServoRotateCommand() {
        requires(Robot.servoSubsystem);
    }
    
    protected void initialize() {
    	Robot.servoSubsystem.rotate(180);
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        return Robot.servoSubsystem.get() >= 180;
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
