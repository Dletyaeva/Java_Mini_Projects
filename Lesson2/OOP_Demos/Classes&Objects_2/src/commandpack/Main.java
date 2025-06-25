package commandpack;
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
    public static void main(String[] args){
        RobotCommand robotCom_ = new RobotCommand();
        robotCom_.execute();

        DriveCommand driveCom_ = new DriveCommand();
        driveCom_.execute();

        ShootCommand shootCom_ = new ShootCommand();
        shootCom_.execute();
    }
}
