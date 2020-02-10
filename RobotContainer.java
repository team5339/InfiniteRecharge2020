/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ClimberCom;
import frc.robot.commands.DriveBase;
import frc.robot.commands.IntakeArmDown;
import frc.robot.commands.IntakeArmUp;
import frc.robot.commands.IntakeCom;
import frc.robot.commands.ShooterCom;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.subsystems.Chassis;
import frc.robot.subsystems.Climber;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.IntakeArm;
import frc.robot.subsystems.Shooter;
import frc.robot.subsystems.Trolley;

/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public static final Chassis chassis = new Chassis();
  public static final Intake intake = new Intake();
  public static final Trolley trolley = new Trolley();
  public static final Climber climber = new Climber();
  public static final Shooter shooter = new Shooter();
  public static final IntakeArm intakeArm = new IntakeArm();




  //Define Commands
  private final DriveBase driveBase = new DriveBase();
  private final IntakeCom intakeCom = new IntakeCom();
  private final ClimberCom climberCom = new ClimberCom();
  public  final ShooterCom shooterCom = new ShooterCom();

  //Making new Controller and Buttons
  public static final Joystick controller = new Joystick(0);
  public static final JoystickButton buttonR = new JoystickButton(controller, 1);
  public static final JoystickButton buttonL = new JoystickButton(controller, 2);




  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    chassis.setDefaultCommand(driveBase);
    intake.setDefaultCommand(intakeCom);
    climber.setDefaultCommand(climberCom);
    shooter.setDefaultCommand(shooterCom);

  }

  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */

   
  private void configureButtonBindings() {
    buttonR.whileHeld(new IntakeArmUp());
    buttonL.whileHeld(new IntakeArmDown());
  }

public Command getAutonomousCommand() {
	return null;
}
//Declaring Port Variables
public static int shootP = 5;
public static int intakeP = 6;
public static int leftFront = 7;
public static int rightFront = 8;
public static int leftBack = 9;
public static int rightBack = 10;

}
  

