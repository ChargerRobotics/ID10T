package frc.robot;

import java.util.ArrayList;
import java.util.List;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.VictorSPXConfiguration;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxRelativeEncoder.Type;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot 
{
  
  private VictorSPX leftFrontMotor = new VictorSPX();
  private VictorSPX leftBackMotor = new VictorSPX();
  private VictorSPX rightFrontMotor = new VictorSPX();
  private VictorSPX rightBackMotor = new VictorSPX();

  private MotorControllerGroup leftDrive = new MotorControllerGroup(leftFrontMotor,leftBackMotor);
  private MotorControllerGroup rightDrive = new MotorControllerGroup(rightFrontMotor, rightBackMotor);

  private double leftDrivePower;
  private double rightDrivePower;

  private Joystick leftController = new Joystick(0);
  private Joystick rightController = new Joystick(1);

  private CANSparkMax leftTowerMotor = new CANSparkMax(deviceId, MotorType.kBrushless);
  private CANSparkMax rightTowerMotor = new CANSparkMax(deviceId, MotorType.kBrushless);

  private CANSparkMax clawWrist = new CANSparkMax(deviceId, MotorType.kBrushless);

  private CANSparkMax leftClawMotor = new CANSparkMax(deviceId, MotorType.kBrushless);
  private CANSparkMax rightClawMotor = new CANSparkMax(deviceId, MotorType.kBrushless);


  
  @Override
  public void robotInit() 
  {
    
  }

  @Override
    public void robotPeriodic() 
  {
    
  }

  @Override
  public void autonomousInit() 
  {
   
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() 
  {
    
  }

  @Override
  public void teleopPeriodic() 
  {
    leftDrivePower = leftController.getRawAxis(1);
    rightDrivePower = rightController.getRawAxis(1);

    leftDrive.set(leftDrivePower);
    rightDrive.set(-rightDrivePower);
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() 
  {
    
  }

  @Override
  public void testPeriodic() {}

}


