/*
 * STEP 1: Define a class called `Droid` with the following:
 *
 *     Instance Variables:
 *     - `name` (String)
 *     - `batteryLevel` (int)
 *
 *     Instance Methods:
 *     - `performTask(String task)` → prints a message and lowers battery by 10
 *     - `energyReport()` → prints the current battery level
 *     - `toString()` → returns a string introducing the droid by name
 *
 * STEP 2: Add a constructor for the `Droid` class that:
 *     - Takes a parameter: `String droidName`
 *     - Assigns `droidName` to the name field using the `this` keyword
 *     - Sets `batteryLevel` to 100
 *
 * STEP 3: Implement `toString()` method (return type: String)
 *     - Return a string that says: "Hello, I’m the droid [name]!"
 *
 * STEP 4: Implement `performTask(String task)` method (return type: void)
 *     - Print: "[name] is performing task: [task]"
 *     - Reduce battery level by 10
 *
 * STEP 5: Implement `energyReport()` method (return type: void)
 *     - Print the current battery level of the droid
 *
 * STEP 6: Implement `energyTransfer(Droid other)` method
 *     - This method allows one droid to transfer 10 energy to another droid
 *     - Print what is happening
 *
 *     HINT: No static variables needed — use object references directly!
 */
import java.util.Scanner;


public class Main {
    // TODO: Define main method
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int c = 0;
        Droid droid1 = new Droid(100, "Codey");
        droid1.toString(droid1.getName());
        while(c == 0){
        droid1.performTask("make a sandwich");
        droid1.performTask("solve a puzzle");
        droid1.performTask("do my taxes");
        droid1.performTask("steal an unsuspecting father's job");
        droid1.performTask("light off fireworks");
        droid1.performTask("speedrun Minecraft");
        droid1.performTask("beat tetris");
        droid1.performTask("eat a sandwich");
        droid1.energyReport();
        droid1.performTask("build a droid");
        droid1.energyReport();
        System.out.println("What should we name the droid:");
        Droid droid2 = new Droid(100,user.next());
        droid2.energyTransfer(droid1);
        droid1.energyReport();
        droid2.energyReport();
        System.out.println("are you done?:");
        if(user.next().equals("No")){
            System.out.println("Again!");
        }else{
            System.out.println("Ok, See you next time.");
            user.close();
            c++;
        }
    }
    }
    /*
     * STEP 1: Create a new Droid object named "Codey"
     * STEP 2: Print the object to the terminal (this should call `toString()`)
     * STEP 3: Call performTask() a few times
     * STEP 4: Call energyReport()
     * STEP 5: Create another Droid (e.g., "Zippy")
     * STEP 6: Transfer energy from one droid to another using energyTransfer()
     * STEP 7: Print both droids' energy reports
     */
}
