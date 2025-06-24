/*
 * Author: Daleela Letyaeva
 * Date: 06/24/2025
 * Program Description:
 * REFERECES: 
 * https://en.wikipedia.org/wiki/ANSI_escape_code#Colors
 * https://www.codecademy.com/learn/learn-java/modules/learn-java-variables/cheatsheet#:~:text=Copy%20to%20clipboard-,Compound%20Assignment%20Operators,-Compound%20assignment%20operators
 *
 */

//STEP 1: Define a class called `Droid` with the following:
/*
 * Instance Variables:
 * - `name` (String)
 * - `batteryLevel` (int)
 * Instance Methods:
 * - `performTask(String task)` → prints a message and lowers battery by 10
 * - `energyReport()` → prints the current battery level
 * - `toString()` → returns a string introducing the droid by name
 */


class Droid {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static final String BLACK_BG = "\u001B[40m";
    public static final String RED_BG = "\u001B[41m";
    public static final String GREEN_BG = "\u001B[39;42m";
    public static final String YELLOW_BG = "\u001B[43m";
    public static final String BLUE_BG = "\u001B[44m";
    public static final String PURPLE_BG = "\u001B[45m";
    public static final String CYAN_BG = "\u001B[46m";
    public static final String WHITE_BG = "\u001B[47m";

    String name;
    int batteryLevel;

    /*
     * STEP 2: Add a constructor for the `Droid` class that:
     * - Takes a parameter: `String droidName`
     * - Assigns `droidName` to the name field using the `this` keyword
     * - Sets `batteryLevel` to 100
     */
    Droid(String droidName) {
        this.name = droidName;
        this.batteryLevel = 100;
    }

    /*
     * STEP 3: Implement `toString()` method (return type: String)
     * - Return a string that says: "Hello, I’m the droid [name]!"
     */
    String introName() {
        return "Hello, I'm the droid " + CYAN + this.name + RESET +"!";
    }

    /*
     * STEP 4: Implement `performTask(String task)` method (return type: void)
     * - Print: "[name] is performing task: [task]"
     * - Reduce battery level by 10
     */
    void performTask(String task) {
        System.out.println("Performing Task: " + YELLOW + task + RESET);
        this.batteryLevel -= 10;
    }

    /*
     * STEP 5: Implement `energyReport()` method (return type: void)
     * - Print the current battery level of the droid
     */
    void energyReport(){
        System.out.println(CYAN + this.name + RESET + " Battery Level: " + RED + this.batteryLevel + RESET);
    }
     /* STEP 6: Implement `energyTransfer(Droid other)` method
     * - This method allows one droid to transfer 10 energy to another droid
     * - Print what is happening
     *
     * HINT: No static variables needed — use object references directly!
     */
    void energyTransfer(Droid other){
        System.out.println("Battery Level of Doner Droid [" + CYAN + this.name + RESET + "]: " + RED + this.batteryLevel + RESET);
        System.out.println("Battery Level of Target Droid [" + CYAN + other.name + RESET + "]: " + RED + other.batteryLevel + RESET);
        this.batteryLevel -= 10;
        other.batteryLevel += 10;
        System.out.println("Energy transfer from [" + CYAN + this.name + RESET +  "] to [" + CYAN + other.name + RESET + "]: " + GREEN + "Complete" + RESET);
    }
    
    }

public class Main {
    // TODO: Define main method
    public static void main(String[] args) {
        //STEP 1: Create a new Droid object named "Codey"
        Droid droid = new Droid("Codey");
        //STEP 2: Print the object to the terminal (this should call `toString()`)
        System.out.println(droid.introName());
        //STEP 3: Call performTask() a few times
        droid.performTask("Surveying");
        droid.performTask("Tracking");
        droid.performTask("Following");
        //STEP 4: Call energyReport()
        droid.energyReport();
        //STEP 5: Create another Droid (e.g., "Zippy")
        Droid droid2 = new Droid("Madascar");
        System.out.println(droid2.introName());
        droid2.performTask("Following " + droid.name);
        droid2.performTask("Continueing to follow " + droid.name);
        //STEP 6: Transfer energy from one droid to another using energyTransfer()
        droid.energyTransfer(droid2);
        //STEP 7: Print both droids' energy reports
        droid.energyReport();
        droid2.energyReport();
    }

}
