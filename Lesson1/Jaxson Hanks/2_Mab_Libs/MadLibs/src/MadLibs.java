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
    This is a program that prints out the mad lib that I wrote by putting in random words that fit the category
    Jaxson Hanks 6/27/25
     */
    
    public static void main(String[] args){
    String name1 = "jeff";
    String name2 = "chris";
    String adjective1 = "loud";
    String adjective2 = "deadly";
    String adjective3 = "frightful";
    String verb1 = "defenstrate";
    Integer number = 9;
    String noun1 = "computer";
    String noun2 = "competitor";
    String noun3 = "Nintendo Switch";
    String noun4 = "Rubiks cube";
    String noun5 = "pyraminx";
    String noun6 = "backpack";
    String place1 = "Luigi's Mansion";
        //The template for the story
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
