package HeadFirst;

import java.util.ArrayList;

public class SimpleStartup {
    private ArrayList<String> locationCells;
  private int numOfHits = 0;

  public void setLocationCells(ArrayList<String> locs) {
    locationCells = locs;
    System.out.println("Location Cells : " + locationCells.toString());
  }

  public String checkYourself(String guess) {
    String result = "miss";
    int index = locationCells.indexOf(guess);
    //System.out.println("Index found " +index);

    if (index>=0)
    {
      locationCells.remove(index);
      System.out.println("Current location cell : " + locationCells.toString());
      if(locationCells.isEmpty())
      {
        result = "kill";
      }
      else{
        result="hit";
      }
    }
    return result;
   
   /*  for (int cell : locationCells) {
      if (guess == cell) {
        result = "hit";
        numOfHits++;
        break;
      } // end if
    } // end for
    if (numOfHits == locationCells.length) {
            result = "kill";
    } // end if
    System.out.println(result);
    return result;
    */
  } // end method
}
