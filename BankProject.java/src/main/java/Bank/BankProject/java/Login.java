package Bank.BankProject.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//This class will handle the login of the users.
public class Login {

    private final String savedPassword;
    private final String savedUserName;
   // private inputHandler inputHandler;
    private inputHandler inputHandler;

    public Login() {
        this.savedPassword = "Stephen123";
        this.savedUserName = "Stephen Muiru";
        System.out.println("Done");
    }

    public void setInputHandler(Bank.BankProject.java.inputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    //function to read user input.This method in only accessible within this class.
    private String[] readInput()
    {
        //This local variables will hold the user input for validation.
        String[] userInput = new String[2];
        //read data from user and store it in an array.
        userInput[0] = inputHandler.readString("Enter Your User name.\nName : ");    //userInput[0] store the userName
        userInput[1] = inputHandler.readString("Enter Your Password.\nPassword : "); //userInput[1] store the password.
        return userInput;
    }
    //Validate userInput.
    public boolean login()
    {
        int numberOfAttemps = 3;
        String remaining = "";

        while(numberOfAttemps > 0)
        {
            System.out.println("\n\tPlease Enter Your Details As Requested.\nYou have "+numberOfAttemps+" Attempts "+ remaining);
            String[] userInput = readInput();
            if( savedUserName.equals(userInput[0]) && savedPassword.equals(userInput[1]))
            {
                System.out.println("\t\tWelcome "+savedUserName);
                return true;
            }
            --numberOfAttemps;
            remaining = "remaining";
        }
        System.out.println("You Have Depleted Your attempts");
        return false;
    }
}