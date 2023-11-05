package Bank.BankProject.java;
public class SavingsAccount extends BankAccount
{

    //double accountBalance;
    //variable to help access the currentAccount class when Transferring funds.
    private CurrentAccount currentAccount;


    //getting the current account object to acccess the receive transfers method
    public void setCurrentAccount(CurrentAccount currentAccount)
    {
        this.currentAccount=currentAccount;
    }

    //Construct for the Savings account.
    public SavingsAccount(String accountNumber, String userName, String accountPhoneNumber, String accountEmail)
    {
        super(accountNumber, userName, accountPhoneNumber, accountEmail);
    }

    //overide the withdrawal method to change the rates of withdrawal.
    @Override
    public void withdraw(double withdrawAmount)
    {
        double transactionCost, totalDeduction;
        transactionCost = 0.004 * withdrawAmount;
        totalDeduction = withdrawAmount + transactionCost;

        if(super.accountBalance >= totalDeduction)
        {
            super.accountBalance -= totalDeduction;
            System.out.println("You Have Successfully Withdrawn Ksh " + withdrawAmount + "\nYour New Balance is Ksh " + super.accountBalance);
        }
        else
        {
            System.out.println("You Do Not Enough Funds To Withdraw Ksh "+withdrawAmount);
        }
    }

    //method to send funds to the Current account.
    public void sendTransfers(double transferAmount)
    {
        if(super.accountBalance >= transferAmount)
        {
           super.accountBalance -= transferAmount;
            currentAccount.receiveTransfers(transferAmount, " Savings Account");
        }
        else
        {
            System.out.println("You Do Not Have Enough Funds To Transfer Ksh "+transferAmount);
        }
    }

    //method to receive fund from other accounts
    public void receiveTransfers(double transferAmount, String fromWhere)
    {
        super.accountBalance += transferAmount;
        System.out.println("You Have Successfully Transferred Ksh"+transferAmount+"\nfrom "+fromWhere+" Your New Account Balance is Ksh"+super.accountBalance+"\nThankyou For Using Our Services");
    }


}
