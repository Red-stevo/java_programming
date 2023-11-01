public class BankAccount {
        int acNo;
        String acName,acPhone,acEmail;
        double acBal;
        public BankAccount(int acNo, String acName, String acPhone, String acEmail, double acBal) {
            this.acNo = acNo;
            this.acName = acName;
            this.acPhone = acPhone;
            this.acEmail = acEmail;
            this.acBal = acBal;
        }
        public void accountholder() {
            System.out.println("Account Number: "+acNo);
            System.out.println("Account Holder Name: "+acName);
            System.out.println("Account Holder Address: "+acPhone);
            System.out.println("Account Holder Phone: "+acEmail);
            System.out.println("Account Holder Balance: "+acBal);
        }
        public void deposit(double amount) {
            acBal += amount;
            System.out.println("Deposited: $"+ amount);
        }
        public void displayBalance() {
            System.out.println("Account Number: "+acNo+"\tBalance: $"+acBal);

        }
    }
