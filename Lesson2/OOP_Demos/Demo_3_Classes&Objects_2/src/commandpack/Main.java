package commandpack;

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
