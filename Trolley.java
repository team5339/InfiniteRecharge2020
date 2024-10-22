/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Trolley extends SubsystemBase {
  /**
   * Creates a new Trolley.
   */
  TalonSRX talon = new TalonSRX(3);

  public void moveTrolley(double speed){
    talon.set(ControlMode.PercentOutput, speed);
  }

  public Trolley() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
