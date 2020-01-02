/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

  public static Spark frontL, frontR, backL, backR, intake, output, intake1, output1;
  public static DifferentialDrive drive;
  public static SpeedControllerGroup left, right, intakeM, outputM;

  public static void init() {

    // Drive Train
    frontR = new Spark(Constants.FRONT_RIGHT);
    frontL = new Spark(Constants.FRONT_LEFT);
    backL = new Spark(Constants.BACK_LEFT);
    backR = new Spark(Constants.BACK_RIGHT);

    // IN/OUT
    intake = new Spark(Constants.MOTOR_INPUT_1);

    // Speed controllers
    left = new SpeedControllerGroup(frontL, backL);
    right = new SpeedControllerGroup(frontR, backR);

    // Differential drive
    drive = new DifferentialDrive(left, right);
    drive.setSafetyEnabled(true);

  }

}
