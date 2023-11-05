package Bank.BankProject.java;

public class BankAccount {
    private String accountNumber;
    private String userName;
    private String accountPhoneNumber;
    private String accountEmail;
    double accountBalance;

    //Construct The Current Account.
    public BankAccount(String accountNumber, String userName, String accountPhoneNumber, String accountEmail, double accountBalance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.accountPhoneNumber = accountPhoneNumber;
        this.accountEmail= accountEmail;
        this.accountBalance = accountBalance;
    }

    public BankAccount(String accountNumber, String userName, String accountPhoneNumber, String accountEmail) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.accountPhoneNumber = accountPhoneNumber;
        this.accountEmail= accountEmail;
        this.accountBalance = 0.00;
    }


    public void deposit(double depositAmount)
    {
        double bonus;
        bonus = 0.02 * depositAmount;
        accountBalance += (depositAmount + bonus);
        System.out.println("Your Deposit Has Been Made Successifully.\nYour New Balance is : Ksh "+accountBalance);
    }
    public void displayBalance()
    {
        System.out.println("\tHello "+userName);
        System.out.println("Your Account Balance is : Ksh "+accountBalance+"\nThank You For Using Our Services");
    }
    public void withdraw(double withdrawAmount)
    {
        double transactionCost, totalDeduction;
        transactionCost = 0.0025 * withdrawAmount;
        totalDeduction = withdrawAmount + transactionCost;

        if(accountBalance >= totalDeduction)
        {
            accountBalance -= totalDeduction;
            System.out.println("You Have Successfully Withdrawn Ksh " + withdrawAmount + "\nYour New Balance is Ksh " + accountBalance);
        }
        else
        {
            System.out.println("You Do Not Enough Funds To Withdraw Ksh"+withdrawAmount);
        }
    }
    public void updateAccountBalance(double newUpdatedAccountBalance)
    {
        this.accountBalance = newUpdatedAccountBalance;
    }

}
