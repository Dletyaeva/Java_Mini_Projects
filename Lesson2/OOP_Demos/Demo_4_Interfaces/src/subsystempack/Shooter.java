package subsystempack;

class Shooter implements Subsystem {
    public void initialize() {
        System.out.println("Shooter ready");
    }

    public void shutdown() {
        System.out.println("Shooter disabled");
    }
}
