package Bank.BankProject.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {
	public static void exitCode()
	{
		System.out.println("!!Exiting!!");
		System.exit(0);
	}

	public static void callFunctions()
	{

	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

		//creating the object of the needed classes.
		ApplicationContext myClasses = new ClassPathXmlApplicationContext("beans.xml");

		Login login = myClasses.getBean("Login", Login.class);
		inputHandler inputHandler = myClasses.getBean("inputHandler", inputHandler.class);
		MenuHandler menuHandler = myClasses.getBean("MenuHandler", MenuHandler.class);
		CurrentAccount currentAccount = myClasses.getBean("CurrentAccount", CurrentAccount.class);
		SavingsAccount savingsAccount = myClasses.getBean("SavingsAccount", SavingsAccount.class);

		//passing a SavingsAccount object to the Current Account class
		currentAccount.setSavingsAccount(savingsAccount);
		//passing a CurrentAccount object to the SavingsAccount class
		savingsAccount.setCurrentAccount(currentAccount);
		//Handling the user login.
		login.setInputHandler(inputHandler);
		boolean loginStatus = login.login();

		//Handling invalid login Attempt
		if(!loginStatus)
		{
			exitCode();
		}

		while(true)
		{
			//Display the first menu
				//pass a inputHandler object for input in the MenuHandler class
			menuHandler.setInputHandler(inputHandler);
			//read the choice for menu 1

			String userChoice = menuHandler.mainMenu();

			//Terminate code if user input was invalid for all the given 5 chances.
			if (!(menuHandler.menuInputStatus())) {
				exitCode();
			}

			//Diplay the second menu depending on the user input.
			if (userChoice.equals("1")) {
				userChoice = menuHandler.savingsAccountMenu();
				if (!(menuHandler.menuInputStatus())) {
					exitCode();
				}
				//Hold the user amount.
				double userInputAmount;
				//calling various methods depending on the user's choice.
				switch (userChoice) {
					case "1":
						userInputAmount = inputHandler.readDouble("Deposit Amount");
						savingsAccount.deposit(userInputAmount);
						break;
					case "2":
						userInputAmount = inputHandler.readDouble("Withdraw Amount");
						savingsAccount.withdraw(userInputAmount);
						break;
					case "3":
						userInputAmount = inputHandler.readDouble("Transfer Amount");
						savingsAccount.sendTransfers(userInputAmount);
						break;
					case "4":
						savingsAccount.displayBalance();
						break;
				}

			}
			else if (userChoice.equals("2"))
			{
				userChoice = menuHandler.currentAccountMenu();
				if (!(menuHandler.menuInputStatus())) {
					exitCode();
				}
				//Hold the user amount.
				double userInputAmount;
				//calling various methods depending on the user's choice.
				switch (userChoice) {
					case "1":
						userInputAmount = inputHandler.readDouble("Deposit Amount");
						currentAccount.deposit(userInputAmount);
						break;
					case "2":
						userInputAmount = inputHandler.readDouble("Withdraw Amount");
						currentAccount.withdraw(userInputAmount);
						break;
					case "3":
						userInputAmount = inputHandler.readDouble("Transfer Amount");
						currentAccount.sendTransfers(userInputAmount);
						break;
					case "4":
						currentAccount.displayBalance();
						break;
				}

			}
			else
			{
				System.exit(0);
			}
		}
	}
}
