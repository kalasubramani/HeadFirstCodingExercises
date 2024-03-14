package HeadFirst;

import java.util.ArrayList;

public class StartupBust {
   private GameHelper3S helper = new GameHelper3S();
   private ArrayList<Startup> startups = new ArrayList<Startup>(); 
   private int numOfGuesses = 0;

    private void setUpGame()
    {
        //make some startups and give them names
        Startup startupOne = new Startup();
        startupOne.setName("Pony");
        Startup startupTwo = new Startup();
        startupTwo.setName("Hacq"); 
        Startup startupThree = new Startup();
        startupThree.setName("Caby");
        //add all startups to arraylist
        startups.add(startupOne);
        startups.add(startupTwo);
        startups.add(startupThree);

        //print user messages
        System.out.println(" Your goal is to sink three startups. \\n PONY HACQ CABY \\n Try to sink them all in fewest number of guesses");
    
        //place startups and set locations
        for(Startup s : startups)
        {
            ArrayList<String> newLocation = helper.placeStartup(3);
            s.setLocationCells(newLocation);
            
        }
    } //setupgame()

    private void startPlaying()
    {
        while(!startups.isEmpty())
        {
            String userGuess = helper.getUserInput();
            checkUserGuess(userGuess);

        }//while
        finishGame();

    } //startPlaying()

    private void checkUserGuess(String userGuess)
    {
        numOfGuesses++;
        String result = "Miss";

        //iterate thru all startups
        for(Startup s : startups)
        {
            result = s.checkYourSelf(userGuess);
            if(result.equals("Hit")) 
                break;
            
            if(result.equals("Kill"))
                {
                    startups.remove(s);
                    break;
                }

        } //for
        System.out.println(result);
    } //checkUserGuess()

    private void finishGame()
    {
        System.out.println("All startups are dead !!");
        if(numOfGuesses <=18)
         System.out.println("You took " + numOfGuesses + " to sink the startups.");
        else
         System.out.println("You took too long to sink the startups :( ");
    } //finishGame

    public static void main(String [] s)
    {
        StartupBust game = new StartupBust();
        //initialize all startups and their locations
        game.setUpGame();
        //get user guess and validate it
        game.startPlaying();
    } //main
}
