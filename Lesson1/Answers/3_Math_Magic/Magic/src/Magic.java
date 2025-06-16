/* TODO:
  * 
  * create a variables called "step1" initialized to
        -- operation: myNumber multiplied by itself (HINT: https://www.codecademy.com/learn/learn-java/modules/learn-java-variables/cheatsheet)
  * create a variable called "step2" initialized to
        -- operation: 'step1' plus 'myNumber'
  * create a variable called 'step3' initialized to
        -- operation: 'step2' divided by 'myNumber'
  * create a variable called 'step4' initialized to
        -- operation: 'step3' plus 17
  * create a variable called 'step5' initialized to
        -- operation: 'step4' minus 'myNumber'
  * create a variable called 'step6' initialized to
        -- operation: 'step5' divided by 6
  * Print the variable 'step6' to terminal - what value is it? [3]
  * Recreate the above steps with only 2 variables: 'myNumber' and 'magicNumber'
  by using your understanding of "COMPOUND ASSIGNMENT OPERATORS" do so by only manipulating
  variable 'magicNumber'
*/ 
public class Magic {
    public static void main(String[] args){

      //PART 1
      //create a variable called "myNumber" to store any integer besides 0 
      int myNumber = 267;

      //"step1" : myNumber multiplied by itself  
      int step1 = myNumber * myNumber;

      // create a variable called "step2" initialized to operation: 'step1' plus 'myNumber'
      int step2 = step1 + myNumber;

      //'step3': 'step2' divided by 'myNumber'
      int step3 = step2 / myNumber;

      //step4: 'step3' plus 17
      int step4 = step3 + 17;

      //step5: 'step4' minus 'myNumber'
      int step5 = step4 - myNumber;

      //step6: 'step5' divided by 6
      int step6 = step5 / 6;

      System.out.println(step6);

      //PART 2
      int magicNumber = myNumber;

      magicNumber *= myNumber;

      magicNumber += myNumber;

      magicNumber /= myNumber;

      magicNumber += 17;

      magicNumber -= myNumber;

      magicNumber /= 6;

      System.out.println(magicNumber);
    }
}
