package HeadFirst;

import java.util.ArrayList;

public class Startup {
    private ArrayList<String> locationCells=  new ArrayList<>(); 
    private String name;    
    
    void setName(String startupName)
    {
        name = startupName;
    }
    void setLocationCells(ArrayList<String> loc)
    {
        locationCells = loc;
    }

    String checkYourSelf(String userGuess)
    {
        String result= "Miss";
        int index = locationCells.indexOf(userGuess);
        if(index>=0)
        {
            locationCells.remove(index);

        if(locationCells.isEmpty())
        {
            result = "Kill";
            System.out.println(" Yeah !! You sunk " + name + " ship");
        }
        else
         result ="Hit";

         }

        return result;
    } //checkYourSelf()
} //class
