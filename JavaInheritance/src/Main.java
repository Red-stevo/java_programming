public class Main {
    public static void main(String[] args)
    {
                //Creating a single inheritances
        //Creating a Savings account object
        SavingsAccount sac = new SavingsAccount(1001,"Ann Kamau","07200000","test@gmail.com",1000);
        //Calling functions in the BackAcount class
        System.out.println("SAVINGS ACCOUNT DETAILS");
        sac.accountholder();
        sac.deposit(500);
        sac.displayBalance();
        System.out.println("\n\n");

            //Multi-leveled inheristance.
        //creating the object of Cureent class which is a child of the SavingsAccount class
        System.out.println("CURRENT ACCOUNT DETAILS");
        Current current = new Current(1001,"Stephen Muiru", "0110555494","stepm@gmail.com",0);
        current.deposit(300);
        current.accountholder();
        current.displayBalance();
    }
}