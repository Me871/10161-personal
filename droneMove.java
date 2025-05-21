public class MyFIRSTJavaOpMode extends LinearOpMode {
    DcMotor backLeftDrive;
    DcMotor backRightDrive;
    DcMotor frontLeftDrive;
    DcMotor frontRightDrive;
    DcMotor armTilt;
    DcMotor armExtend;
    DcMotor claw;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;

var fwd, left, cw;
    
    
    @Override
    public void runOpMode() {
      Gamepad gamepad1 = new FTCGamepad();
      backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
      backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
      frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
      frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
      armTilt = hardwareMap.get(DcMotor.class, "armTilt");
      armExtend = hardwareMap.get(DcMotor.class, "armExtend");
      claw = hardwareMap.get(DcMotor.class, "claw");
      color1 = hardwareMap.get(ColorSensor.class, "color1");
      distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
      imu = hardwareMap.get(BNO055IMU.class, "imu");
      frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
      backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
      while (opModeIsActive()) {
        if (gamepad1.pressKey(105)) {
          fwd = 1;
        } else {
          if (gamepad1.pressKey(107)) {
            fwd = -1;
          } else {
            fwd = 0;
          }
        }
        if (gamepad1.pressKey(106)) {
          left = 1;
        } else {
          if (gamepad1.pressKey(108)) {
            left = -1;
          } else {
            left = 0;
          }
        }
        if (gamepad1.pressKey(114)) {
          cw = 1;
        } else {
          if (gamepad1.pressKey(121)) {
            cw = -1;
          } else {
            cw = 0;
          }
        }
        if (gamepad1.pressKey(109)) {
          fwd = fwd * 0.5;
          left = left * 0.5;
          cw = cw * 0.5;
        }
        frontLeftDrive.setPower(fwd + -1 * left + -1 * cw);
        frontRightDrive.setPower(fwd + left + cw);
        backLeftDrive.setPower(fwd + left + -1 * cw);
        backRightDrive.setPower(fwd + -1 * left + cw);
        if (gamepad1.pressKey(103)) {
          armTilt.setPower(0.5);
        } else {
          if (gamepad1.pressKey(116)) {
            armTilt.setPower(-0.5);
          } else {
            armTilt.setPower(0);
          }
        }
        if (gamepad1.pressKey(102)) {
          armExtend.setPower(0.5);
        } else {
          if (gamepad1.pressKey(118)) {
            armExtend.setPower(-0.5);
          } else {
            armExtend.setPower(0);
          }
        }
        if (gamepad1.pressKey(104)) {
          claw.setPower(1);
        } else {
          if (gamepad1.pressKey(110)) {
            claw.setPower(-1);
          } else {
            claw.setPower(0);
          }
        }
      }
    }
    
}
