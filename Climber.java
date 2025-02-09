/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {
  /**
   * Creates a new Climber.
   */

   CANSparkMax motorUp = new CANSparkMax(3, MotorType.kBrushless);
   CANSparkMax motorDown = new CANSparkMax(4, MotorType.kBrushless);

  public void setMotorUp(double speed){
    motorUp.set(speed);
  }
  
  public void setMotorDown(double speed){
    motorDown.set(speed);
  }

  public Climber() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
