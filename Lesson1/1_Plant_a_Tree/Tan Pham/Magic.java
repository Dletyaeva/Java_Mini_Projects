/* TODO:
  * create a variable called "myNumber" to store any integer besides 0 
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
            public static void main(String[] args) {
        int myNumber = 15;
        // This is the original Number
        int stepOne = (int) Math.pow(myNumber, 2);
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);
        //Below is the Challenge version
        int myNumberChallenge = 2;
        int magicNumber = (( myNumberChallenge * myNumberChallenge + myNumberChallenge) / myNumberChallenge + 17 - myNumberChallenge) / 6;
        System.out.println(magicNumber);  
            }
      }
        
    

