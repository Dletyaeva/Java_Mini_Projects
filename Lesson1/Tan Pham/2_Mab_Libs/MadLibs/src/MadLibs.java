/*
 * TODO:
 * Create a comment at the start of the program with
 *      1. Program Description
 *      2. Author Name
 *      3. Date
 * Create All the Variables needed for the story
 *      1. 2 name
 *      2. 3 adjectives
 *      3. 1 verb
 *      4. 1 whole number
 * print the story with the variables in the right places
 */

public class MadLibs {
    /*
    This is a mad lib, it prints out a story with blanks filled in by variables
    My name is Tan Pham
    6/10/25
     */
    public static void main(String[] args){
        //The template for the story
        String name1 = "Jack";
        String adjective1 = "Radiant";
        String adjective2 = "Golden";
        String noun1 = "Donut";
        String noun2 = "Chicken";
        String verb1 = "diving";
        String noun3 = "fish";
        String noun4 = "McFrappe";
        String adjective3 = "Majestic";
        String name2 = "Jill";
        String place1 = "Krispy Kreme";
        String noun5 = "pianos";
        int number = 100000000;
        String noun6 = "starfish";
        String story = 
        "This morning " + name1 + " woke up feeling " + adjective1 + 
        ".'It is going to be a "+ adjective2 + " day!' Outside, a bunch of " + 
        noun1 +"s were protesting to keep " + noun2 + " in stores. They began to " + 
        verb1 +" to the rhythm of the " + noun3 + ", which made all the " + noun4 + 
        "s very " + adjective3 + ". Concerned, " + 
        name1 + " texted "+name2+", who flew " + name1 + " to " + place1 + 
        " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " 
        + name1 + " woke up in the year " + number + ", in a world where " 
        + noun6 + "s ruled the world.";
        System.out.println(story);
    }
}
