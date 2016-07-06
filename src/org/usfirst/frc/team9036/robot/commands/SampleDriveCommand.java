package org.usfirst.frc.team9036.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SampleDriveCommand extends CommandGroup {
    
    public SampleDriveCommand() {
    	addSequential(new DriveCommand());
    	addSequential(new DelayCommand(2));
    	addSequential(new DriveCommand());
    }
}
