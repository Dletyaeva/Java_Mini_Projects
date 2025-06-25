package subsystempack;

public class Main{
    public static void main(String[] args) throws Exception {
        Drivetrain drivetrain_ = new Drivetrain();
        drivetrain_.initialize();
        drivetrain_.shutdown();

        Shooter shooter_ = new Shooter();
        shooter_.initialize();
        shooter_.shutdown();
    }
}
