package HeadFirst;

import java.util.Scanner;

public class GameHelper {
    
    public String getUserInput() {
        System.out.print("Enter your guess to sink the startup : ");
        Scanner scanner = new Scanner(System.in);
       return (Integer.toString(scanner.nextInt()));
       // return scanner.nextInt();
      }
}
