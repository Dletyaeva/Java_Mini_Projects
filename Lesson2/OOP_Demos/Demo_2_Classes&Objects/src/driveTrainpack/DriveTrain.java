package driveTrainpack;

class Drivetrain {
    double leftSpeed;
    double rightSpeed;

    // Constructor
    public Drivetrain(double left, double right) {
        this.leftSpeed = left;
        this.rightSpeed = right;
    }

    // Overloaded method
    public void setSpeed(double speed) {
        this.leftSpeed = speed;
        this.rightSpeed = speed;
    }

    public void setSpeed(double left, double right) {
        this.leftSpeed = left;
        this.rightSpeed = right;
    }

    public void displayStatus() {
        System.out.println("Left: " + leftSpeed + " Right: " + rightSpeed);
    }
}
