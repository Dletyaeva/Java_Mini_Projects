package subsystempack;


interface Subsystem {
    void initialize();
    void shutdown();
}

class Drivetrain implements Subsystem {
    public void initialize() {
        System.out.println("Drivetrain initialized");
    }

    public void shutdown() {
        System.out.println("Drivetrain shutdown");
    }
}

class Shooter implements Subsystem {
    public void initialize() {
        System.out.println("Shooter ready");
    }

    public void shutdown() {
        System.out.println("Shooter disabled");
    }
}

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
