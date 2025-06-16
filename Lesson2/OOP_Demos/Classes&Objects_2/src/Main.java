class RobotCommand {
    public void execute() {
        System.out.println("Generic robot command");
    }
}

class DriveCommand extends RobotCommand {
    @Override
    public void execute() {
        System.out.println("Driving forward...");
    }
}

class ShootCommand extends RobotCommand {
    @Override
    public void execute() {
        System.out.println("Shooting...");
    }
}

public class Main{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
