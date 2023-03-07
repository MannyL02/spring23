import java.util.Scanner;
public class LetterCounter{
Scanner keyboard = new Scanner (System.in);    
    String userString;      // String user entered
    String userCharacter;   // Character user entered
    int StringSize;      

    System.out.println("Please Enter a String.");
    userString = keyboard.nextLine();


    System.out.println("Please Enter a Character.");
    userCharacter = keyboard.nextLine();


    int character; 
    character = Integer.parseInt(userCharacter);
    StringSize = userString.charAt(character);
}
}
