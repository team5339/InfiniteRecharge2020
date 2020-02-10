/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;

public class ClimberCom extends CommandBase {
  /**
   * Creates a new ClimberCom.
   */
  public ClimberCom() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.climber);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double xPos = RobotContainer.controller.getRawAxis(6);
    double yPos = RobotContainer.controller.getRawAxis(7);


    RobotContainer.trolley.moveTrolley(xPos);

    if (yPos == -1){
      RobotContainer.climber.setMotorUp(1);
    } else {
      RobotContainer.climber.setMotorUp(0);
    }

    if (yPos == 1){
      RobotContainer.climber.setMotorDown(1);
    } else {
      RobotContainer.climber.setMotorDown(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
