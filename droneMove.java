// This program is designed to be testable in https://ftcsim.org

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
    
    
@Override // Clears any configurations from a previous run.

public void runOpMode() {
  // Define hardware names here.
  Gamepad gamepad1 = new FTCGamepad();
  Gamepad gamepad2 = new FTCGamepad();
  backLeftDrive = hardwareMap.get(DcMotor.class, "backLeftDrive");
  backRightDrive = hardwareMap.get(DcMotor.class, "backRightDrive");
  frontLeftDrive = hardwareMap.get(DcMotor.class, "frontLeftDrive");
  frontRightDrive = hardwareMap.get(DcMotor.class, "frontRightDrive");
  imu = hardwareMap.get(BNO055IMU.class, "imu");

  // Adjust hardware settings here
  frontLeftDrive.setDirection(DcMotor.Direction.REVERSE);
  backLeftDrive.setDirection(DcMotor.Direction.REVERSE);
      
while (opModeIsActive()) {
  // Get the movement (translation and rotation) inputs. Since the Logitech F310 inverts the Y axis, we must invert again here. The Pilot can block the Gunner's movement controls with either bumper.
  if (gamepad1.left_bumper || gamepad1.right_bumper) {
    fwd = -gamepad1.right_stick_y;
    left = gamepad1.right_stick_x;
    cw = gamepad1.left_stick_x;
  else
    fwd = -gamepad1.right_stick_y + (-gamepad2.right_stick_y * 0.25); // We slow down the Gunner's controls so that they can make finer movements.
    left = gamepad1.right_stick_x + (gamepad2.right_stick_x * 0.25);
    cw = gamepad1.left_stick_x;
  }
    
  // Make it so that either trigger can slow down the robot.
  fwd = fwd * (1 - gamepad1.left_trigger - gamepad1.right_trigger);
  left = left * (1 - gamepad1.left_trigger - gamepad1.right_trigger);
  cw = cw * (1 - gamepad1.left_trigger - gamepad1.right_trigger);

  // Use the fwd, left, and cw variables to move the robot. (This assumes that we use the Gobuilda Omniwheels so we see an "X" formed from the top)
  frontLeftDrive.setPower(fwd + -left + cw);
  frontRightDrive.setPower(fwd + left + -cw);
  backLeftDrive.setPower(fwd + left + cw);
  backRightDrive.setPower(fwd + -left + -cw);  
}
