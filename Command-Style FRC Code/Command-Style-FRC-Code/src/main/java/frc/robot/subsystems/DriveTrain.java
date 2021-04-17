/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  VictorSP leftFront;
  VictorSP rightFront;
  VictorSP leftBack;
  VictorSP rightBack;
  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  DifferentialDrive drive;


  /**
   * Creates a new DriveTrain.
   */
  public DriveTrain() {
    leftFront = new VictorSP(Constants.LEFT_FRONT);
    leftFront.setInverted(false);
    rightFront = new VictorSP(Constants.RIGHT_FRONT);
    rightFront.setInverted(false);
    leftBack = new VictorSP(Constants.LEFT_BACK);
    leftBack.setInverted(false);
    rightBack = new VictorSP(Constants.RIGHT_BACK);
    rightBack.setInverted(false);

    leftMotors = new SpeedControllerGroup(leftFront, leftBack);
    rightMotors = new SpeedControllerGroup(rightFront, rightBack);
    drive = new DifferentialDrive(leftMotors, rightMotors);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  
}
