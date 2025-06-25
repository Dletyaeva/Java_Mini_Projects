package droidpack;
/*
 * Author: Daleela Letyaeva
 * Date: 06/24/2025
 * Program Description:
 * REFERECES: 
 * https://en.wikipedia.org/wiki/ANSI_escape_code#Colors
 * https://www.codecademy.com/learn/learn-java/modules/learn-java-variables/cheatsheet#:~:text=Copy%20to%20clipboard-,Compound%20Assignment%20Operators,-Compound%20assignment%20operators
 *
 */

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
