package Bank.BankProject.java;

import java.text.ParseException;
import java.util.Scanner;

public class inputHandler {
    //private boolean inputStatus;
    public inputHandler()
    {
        System.out.println("done");
    }

    //refence variable to be user to call the Scanner class.
    private Scanner input = new Scanner(System.in);

    //method to read in a string from the user.
    public String readString(String info)
    {
        System.out.print(info);     //Printout to the user what we want to be entered.
         info = input.nextLine();  //Variable info will now reference to the user input.
        return info;
    }

    public double readDouble(String inputName)
    {
        double inputValue = 0;
        try
        {
            System.out.print("Enter Your "+inputName+"\n"+ inputName+" : ");
            String stringInputValue = input.nextLine();
            inputValue = Double.parseDouble(stringInputValue);
        }
        catch (NumberFormatException e)
        {
            System.out.println("You Entered An Invalid "+inputName);
            System.exit(0);
        }

        if(inputValue <= 0)
        {
            System.out.println("You Entered An Invalid "+inputName);
            System.exit(0);
        }
        return inputValue;
    }
}
