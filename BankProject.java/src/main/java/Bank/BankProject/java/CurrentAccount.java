package Bank.BankProject.java;

public class CurrentAccount extends BankAccount{

    private SavingsAccount savingsAccount;

    //getting An object from the main function to aid in transfer of money to the current Account.
    public void setSavingsAccount(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }


    public CurrentAccount(String accountNumber, String userName, String accountPhoneNumber, String accountEmail, double accountBalance)
    {
        super(accountNumber,userName,accountPhoneNumber,accountEmail,accountBalance);
    }

    public void sendTransfers(double transferAmount)
    {
        if(super.accountBalance >= transferAmount)
        {
            super.accountBalance -= transferAmount;
            savingsAccount.receiveTransfers(transferAmount, "Current Account");
        }
        else
        {
            System.out.println("You Do Not Have Enough Funds To Transfer Ksh "+transferAmount);
        }
    }

    public void receiveTransfers(double transferAmount, String fromWhere)
    {
        super.accountBalance += transferAmount;
        System.out.println("You Have Successfully Transferred Ksh "+transferAmount+"\nfrom "+fromWhere+" Your New Account Balance is Ksh "+super.accountBalance+"\nThankyou For Using Our Services");
    }
}
