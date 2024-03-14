package HeadFirst;

import java.util.Random;
import java.util.ArrayList;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        int numOfGuesses =0;
        GameHelper helper = new GameHelper();
       
        SimpleStartup theStartUp = new SimpleStartup();
        int randomNum = (int) (Math.random() *5);
     
        System.out.println("The Randomly generated integer is : " + randomNum);

        ArrayList<String> locations = new ArrayList<>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));
        locations.add(Integer.toString(randomNum+2)) ;

        theStartUp.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive)
        {
            String guess = helper.getUserInput();

            String result = theStartUp.checkYourself(guess);
            System.out.println("RESULT : " + result );
            numOfGuesses++;

            if(result.equals("kill"))
            {
                isAlive = false;
                System.out.println("you took " +numOfGuesses + " guesses to KILL the startup.");
            }
        }

        /* 
        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        int userGuess = 1;
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if (result.equals("hit")) {
          testResult = "passed";
        }
        System.out.println(testResult);
      }
      */

    }
}

