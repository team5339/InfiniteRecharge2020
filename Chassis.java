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
import frc.robot.RobotContainer;


public class Chassis extends SubsystemBase {
  /**
   * Creates a new Chassis.
   */
  CANSparkMax fl = new CANSparkMax(RobotContainer.leftFront, MotorType.kBrushless);
  CANSparkMax fr = new CANSparkMax(RobotContainer.rightFront, MotorType.kBrushless);
  CANSparkMax bl = new CANSparkMax(RobotContainer.leftBack, MotorType.kBrushless);
  CANSparkMax br = new CANSparkMax(RobotContainer.rightBack, MotorType.kBrushless);

  public void drive(double Left, double right){
    fl.set(Left);
    bl.set(Left);
    fr.set(right);
    br.set(right);


  }

  public Chassis() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
