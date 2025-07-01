package subsystempack;

class Drivetrain implements Subsystem {
    public void initialize() {
        System.out.println("Drivetrain initialized");
    }

    public void shutdown() {
        System.out.println("Drivetrain shutdown");
    }
}
