package Bank.BankProject.java;

public class MenuHandler {
    private boolean menuInputStatus;

    //Object to access the inputHandler class
    private inputHandler inputHandler;

    public void setInputHandler(inputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    public boolean menuInputStatus()
    {
        return menuInputStatus;
    }

    public String mainMenu()
    {
        String userChoice;
        int attempts = 5;

        while(attempts > 0)
        {
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit Code.");

            //give the user five chances to enter his data.
            userChoice = inputHandler.readString("Enter Your Choice.\nChoice : ");
            if(("1".equals(userChoice)) || ("2".equals(userChoice)) || ("3".equals(userChoice)))
            {
                menuInputStatus = true;
                return userChoice;
            }
            System.out.println("You Entered An Invalid Choice.\n");
            --attempts;
        }
        System.out.println("You Depleted Your Input Chances.");
        menuInputStatus = false;
        return "null";
    }

    public String savingsAccountMenu()
    {
        int attempts = 5;
        String userChoice;
        while(attempts > 0)
        {
            System.out.println("1. Deposit Money.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Transfer Money.");
            System.out.println("4. Check Balance.");
            //give the user five chances to enter his data.
            userChoice = inputHandler.readString("Enter Your Choice.\nChoice : ");
            if(("1".equals(userChoice)) || ("2".equals(userChoice)) || ("3".equals(userChoice)) || ("4".equals(userChoice)))
            {
                menuInputStatus = true;
                return userChoice;
            }
            System.out.println("You Entered An Invalid Choice.\n");
            --attempts;
        }
        System.out.println("You Depleted Your Input Chances.");
        menuInputStatus = false;
        return "null";

    }

    public String currentAccountMenu()
    {

        int attempts = 5;
        String userChoice;
        while(attempts > 0)
        {
            System.out.println("1. Deposit Money.");
            System.out.println("2. Withdraw Money.");
            System.out.println("3. Transfer Money.");
            System.out.println("4. Check Balance.");

            //give the user five chances to enter his data.
            userChoice = inputHandler.readString("Enter Your Choice.\nChoice : ");
            if(("1".equals(userChoice)) || ("2".equals(userChoice)) || ("3".equals(userChoice)) || ("4".equals(userChoice)))
            {
                menuInputStatus = true;
                return userChoice;
            }
            System.out.println("You Entered An Invalid Choice.\n");
            --attempts;
        }
        System.out.println("You Depleted Your Input Chances.");
        menuInputStatus = false;
        return "null";
    }

    //validate user input for the menus.

}
