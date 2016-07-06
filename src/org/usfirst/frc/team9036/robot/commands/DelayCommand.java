package org.usfirst.frc.team9036.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DelayCommand extends Command {
	
	private double delayTime;
	
    public DelayCommand(double delayTime) {
    	this.delayTime = delayTime;
    }

    
    protected void initialize() {
    	setTimeout(delayTime);
    }
    
    protected void execute() {
    }
    
    protected boolean isFinished() {
        return isTimedOut();
    }
    
    protected void end() {
    }
    
    protected void interrupted() {
    }
}
