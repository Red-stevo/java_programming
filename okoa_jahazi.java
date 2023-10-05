import java.util.Scanner;
class Okoa_jahazi
{

int okoa=0;

//Declaring a reference variable that will be used for input in the input()
//function.
Scanner in;

                        //INPUT FUNCTION
//==================================================================================================


//This function will be used to read user input in all function.It will 
//also handle input output exceptions that may occur during the program.()
String input()
{
    String choice = "null";//this vriable is returned to the functions
    //that claa the input function.It holds the user's choice.
    this.in = new Scanner(System.in);
    try
    {
        System.out.print("__");
        choice = in.nextLine();
    }
    catch(Exception e)
    {
        System.out.println(e);//Displays the error that occur.
    }

    return choice;//returns the value enter to the calling function.
}



                    //END OF INPUT FUNCTION
//==================================================================================================


                                //THE MENU_1() FUNCTION.
//==================================================================================================
/*This is the first function called in the main function
 * It displays the first and the second part of the menu
 * and calls other function depending on the user's choice.
*/
void menu_1()
{
    String choice;//This variable is used for two purposes.
    //Reading user choice for the first part of the menu and the second part.
    //As of the one in the main functio this is also a local variable thus 
    //I choose to give them the same name.

    //I choose to use a while instead of a recursion as there is a possibility 
    //of stack overflow which in a program vulnarability if a recursion is used.
    while(true)
    {
        //Displays home menu to the user.
        System.out.println("\n\n0:Sh20(30mins, 3hrs)");
        System.out.println("1:Sh10(15Mins, 1hr)");
        System.out.println("2:Sh20(15Mins, midnight)");
        System.out.println("3: Okoa 50");
        System.out.println("4: Okoa 20");
        System.out.println("5: Okoa 10");
        System.out.println("6: Okoa 5");
        System.out.println("7: Okoa 20(900MB, 1hr)");
        System.out.println("8: Okoa Internet");
        System.out.println("98: More");
        System.out.println("cancel");
        //Using thefunction I defined to take user choice.
        choice = input();

        //This switch calls a function depending on user choice.
        //I prefer using a string to evade potential errors that occur
        //during parsing(converting from one data type to another).
        switch(choice)
            {
                //The first 7 cases call the same function but diferrent values 
                //depending on the user's okoa amount.
                case "0":
                    okoa_jahazi(20);
                    break;
                case "1":
                    okoa_jahazi(10);
                    break;
                case "2":
                    okoa_jahazi(20);
                    break;
                case "3":
                    okoa_jahazi(50);
                    break;
                    case "4":
                    okoa_jahazi(20);
                    break;
                    case "5":
                    okoa_jahazi(10);
                    break;
                case "6":
                    okoa_jahazi(5);
                    break;
                case "7":
                    okoa_jahazi(20);
                    break;
                case "8"://This case dispays a sub-menu and uses a nesting of a switch
                        //to allow user's to make decision on the amount of bundles to
                        //borrow.
                    System.out.println("\n\nOkoa bundles");
                    System.out.println("1:Sh20(900MB, 1hr)");
                    System.out.println("2:Sh20(90MB, 24hr)");
                    System.out.println("3:Sh10(30MB, 24hr)");
                    System.out.println("4:Sh5(10MB, 24hr)");
                    System.out.println("0:BACK");
                    System.out.println("cancel");
                
                    choice = input();
                    //The folllowing cases call the function but pass different values 
                    //to the function depending on the user's choice.
                    switch(choice)
                    {
                        case "1":
                            okoa_internet(900,20);
                            break;
                        case "2":
                            okoa_internet(90, 20);
                            break;
                        case "3":
                            okoa_internet(30, 10);
                            break;
                        case "4":
                            okoa_internet(10, 5);
                            break;
                        case "0":
                            menu_1();
                            break;
                        case "cancel"://This will exit the program.
                            System.out.println("Thank you for using safaricom");
                            System.exit(0);
                        default:
                        System.out.println("Invalid choice.Try again.");
                    }
                    break;
                case "98":
                    menu_2();//This is the next case after case:8.It Dispalys an extension 
                            //of the menu.
                    break;
                case "cancel"://This will exit the program.
                    System.out.println("Thank you for using safaricom");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.Try again.");

            }
    }
   
}

                            //END OF MENU_1 FUNCTION.
//==================================================================================================



                                //THE OKOA_JAHAZI FUNCTION.
//==================================================================================================
/*
 * This function is called in the first part of the menu by case 1 to case 7.
 * As the function is called in the cases different values are passed to the 
 * depending on the user's choice to bring about different results.
*/

//REMEMBER TO FIX THE POTENTIOAL STACK OVERFLOW VULNARABILITY.
void okoa_jahazi(int value)
    {
        String choice;//holds user's choice.

        //This variableS hold the values of the okoa to be taken and the total debt 
        //after this okoa is taken.
        //The total okoa is calculated from the global variable okoa which will hold
        //the current okoa values.
        int thisokoa = value;
        int totaldebt = okoa + thisokoa;

        //Display a menu to the user to Accept the okoa, Decline, go back to
        //the first menu or cancel to exit the program.
        //the menu also cantain the okoa status information of the user.
        System.out.println("\n\nExisting Unpaid Okoa:" + okoa);
        System.out.println("New Okoa request: "+ thisokoa);
        System.out.println("TOTAL DEBT will be: "+totaldebt);

        System.out.println("1.Accept");
        System.out.println("2.Decline");
        System.out.println("0:BACK 00:HOME");
        System.out.println("cancel");

        choice = input();//take user's choice.


        //This switch displays a message depenging on the user's choice.
        switch(choice)
        {
            case "1":
                System.out.println("You have received "+(thisokoa - 0.1*(thisokoa))+ "The fee is KSH "+(0.1*(thisokoa))+"\nYour debt of KSH "+totaldebt);
                okoa += value;
                System.out.println("Thank you for using safaricom");
                System.exit(0);
                break;
            case "2":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
                break;
            case "0":
            case "00":
                menu_1();
                break;
            case "cancel":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
            default :
                System.out.println("\n\nInvalid choice. Try again.");
                okoa_jahazi(value);
        }

    }


                            //END OF OKOA_JAHAZI FUNCTION.
//==================================================================================================


                            //THE OKOA INTERNET FUNCTION
//==================================================================================================

//Function for case 8.
/*This function will be called by the case 8 in the main menu using switch nesting of 4 different choices.
 * At is call the calls pass diffent values depending on the user's choice
*/
void okoa_internet(int value1, int value2)
{
    String choice;//this local variable holds user choice.

    System.out.println("Okoa "+value1+" @Sh "+value2);
    System.out.println("1:Accept");
    System.out.println("2:Decline");
    System.out.println("cancel");

    choice = input();
    /*
     * THE FOLLOWING ISSUES ARE HANDLED IN THIS W]SWITCH CASE
     * If the user accepts on the okoa the debt is updated and they get the 
     * message on the purchase that they made.
     * After that the program will exit with a state of 0 mean there is no error that occured in the program.
    */
    switch(choice)
    {
        case "1":
            System.out.println("You have received"+(value1)+"MB @ Sh"+(value2)+" \nYour new total debt is KSH"+(value2 + okoa));
            okoa += value2;
            System.out.println("Thank you for using safaricom");
            System.exit(0);
        case "2":
            System.out.println("Thank you for using safaricom");
            System.exit(0);
        case "0":
        case "00":
            menu_1();
            break;
        case "cancel":
            System.out.println("Thank you for using safaricom");
            System.exit(0);
        default :
            System.out.println("Invalid choice. Try again.");
            okoa_internet(value1, value2);
    }



}
                            //END OF OKOA INTERNET FUNCTION.
//===============================================================================================================================


                                //THE MENU_2 FUNCTION.
//===============================================================================================================================
/*
This is the menu 2 function is displays the second part of the first menu
is also calls several functions depending on the user's choice.
*/

void menu_2()
{
    String choice;

    while(true)
    {
        //Displays the second part of the menu to the user.
        System.out.println("\n\n9:Okoa Minutes");
        System.out.println("10:Okoa SMS");
        System.out.println("11:Lipa Okoa");
        System.out.println("#:Check Balance");
        System.out.println("0:BACK");
        System.out.println("Cancel");

        choice = input();//calls the input function for reading data.

        //This switch calls different functions depending on the user's choice.
        switch(choice)
        {
            case "9":
                okoa_minutes_menu();
                break;
            case "10":
                okoa_sms_menu();
                break;
            case "11":
                lipa_okoa();
                break;
            case "#":
                check_balance();
                break;
            case "0":
                menu_1();
                break;
            case "cancel":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
            default:
                System.out.println("Invalid choice.Try again.");
        }
    }
}



                    //END OF MENU_2 FUNCTION.
//=================================================================================



                        //THE OKOA MUNITES MENU FUNCTION.
//=================================================================================
void okoa_minutes_menu()
{
    String choice;

    System.out.println("\n\nAll minutes come with FREE SMS");
    System.out.println("1:Sh50 (40 Mins, 24hrs)");
    System.out.println("2:Sh20 (15 Mins, Midnight)");
    System.out.println("3:Sh10 (5 Mins, Midnight)");
    System.out.println("cancel");

    choice = input();

    switch(choice)
        {
            case "1":
                okoa_minutes(50,40);
                break;
            case "2":
                okoa_minutes(20,15);
                break;
            case "3":
                okoa_minutes(10,5);
                break;
            case "cancel":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
            default:
                System.out.println("Invalid choice.Try again.");
        }
}

                            //END OF OKOA MINUTES MENU FUNCTION.
//=================================================================================

                        //THE OKOA MUNITES FUNCTION
//================================================================================
/*
 * This function is called in the okoa minutes menu.
 * The cases call the function with differen values depending on the user's choice.
*/
void okoa_minutes(int value, int value1)
{
    String choice;//Will hold the user's choice.

    while(true)
    {
         //This variableS hold the values of the okoa to be taken and the total debt 
        //after this okoa is taken.
        //The total okoa is calculated from the global variable okoa which will hold
        //the current okoa values.
        int thisokoa = value;
        int totaldebt = okoa + thisokoa;

        //Display a menu to the user to Accept the okoa, Decline, go back to
        //the first menu or cancel to exit the program.
        //the menu also cantain the okoa status information of the user.
        System.out.println("\n\nExisting Unpaid Okoa:" + okoa);
        System.out.println("New Okoa request: "+ thisokoa);
        System.out.println("TOTAL DEBT will be: "+totaldebt);

        System.out.println("1.Accept");
        System.out.println("2.Decline");
        System.out.println("0:BACK 00:HOME");
        System.out.println("cancel");

        choice = input();//take user's choice.


        //This switch displays a message depenging on the user's choice.
        switch(choice)
        {
            case "1":
                System.out.println("You have received "+(value1)+" Minutes @ KSh"+(value)+"\nYour debt of KSH "+totaldebt);
                okoa += value;
                System.out.println("Thank you for using safaricom");
                System.exit(0);
                break;
            case "2":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
                break;
            case "0":
            case "00":
                menu_1();
                break;
            case "cancel":
                System.out.println("Thank you for using safaricom");
                System.exit(0);
            default :
                System.out.println("\n\nInvalid choice. Try again.");
        }

    }


}

                    //END OF OKOA MINUTES FUNCTION.
//================================================================================

                    //OKOA SMS MENU FUNCTION
//================================================================================
 void okoa_sms_menu()
{
    String choice;//Hold user input.

    System.out.println("OKOA SMS Bundles");
    System.out.println("1:Weekly 1000 SMS @ Ksh 30");
    System.out.println("2:Daily Unlimited SMS @ Ksh 20");
    System.out.println("3:Daily 200 SMS @ Ksh 10");
    System.out.println("4:Daily 20 SMS @ Ksh 5");
    System.out.println("0:BACK 00:HOME");
    System.out.println("cancel");


    choice = input();//calls the input function for reading data.

    //This switch calls different functions depending on the user's choice.
    switch(choice)
    {
        case "1":
            okoa_sms(30,"1000");
            break;
        case "2":
            okoa_sms(20,"Unlimited");
            break;
        case "3":
            okoa_sms(10,"200");
            break;
        case "4":
            okoa_sms(5, "20");
            break;
        case "cancel":
            System.out.println("Thank you for using safaricom");
            System.exit(0);
        case "0":
            menu_2();
            break;
        case "00":
            menu_1();
            break;
        default:
            System.out.println("Invalid choice.Try again.");
    }

}

                //END OF OKOA SMS MENU FUNCTION
//====================================================================================


                //THE OKOA SMS FUNCTION.
//====================================================================================
void okoa_sms(int value,String value1)
{
    String choice;
    //This variableS hold the values of the okoa to be taken and the total debt 
    //after this okoa is taken.
    //The total okoa is calculated from the global variable okoa which will hold
    //the current okoa values.
    int thisokoa = value;
    int totaldebt = okoa + thisokoa;

    //Display a menu to the user to Accept the okoa, Decline, go back to
    //the first menu or cancel to exit the program.
    //the menu also cantain the okoa status information of the user.
    System.out.println("Existing Unpaid Okoa:" + okoa);
    System.out.println("New Okoa request: "+ thisokoa);
    System.out.println("TOTAL DEBT will be: "+totaldebt);

    System.out.println("1.Accept");
    System.out.println("2.Decline");
    System.out.println("0:BACK 00:HOME");
    System.out.println("cancel");

    choice = input();//take user's choice.


    //This switch displays a message depenging on the user's choice.
    switch(choice)
    {
        case "1":
            System.out.println("You have received "+(value1)+" SMS @KSh"+(value)+"\nYour debt of KSH "+totaldebt);
            okoa += value;
            System.out.println("Thank you for using safaricom");
            System.exit(0);
            break;
        case "2":
            System.out.println("Thank you for using safaricom");
            System.exit(0);
            break;
        case "0":
        case "00":
            menu_1();
            break;
        case "cancel":
            System.out.println("Thank you for using safaricom");
            System.exit(0);
        default :
            System.out.println("\n\nInvalid choice. Try again.");
    }
}


            //END OF OKOA SMS FUNCTION
//====================================================================================


////////////////////////////////////////////////////////////////////////////////////////////////////////////
//I am not going to define this two functions further as they require to have database
//to store the user information.


            //LIPA OKOA FUNCTION
//=====================================================================================
 void lipa_okoa()
{
    String choice;
        
    while(true)
    {
        System.out.println("Dear customer, your total Okoa debt is KSH"+okoa+" Choose \nrepayment option.");
        System.out.println("1:M-PESA");
        System.out.println("2:Bonga");
        System.out.println("0:BACK");


        choice = input();//take user's choice.


        //This switch displays a message depending on the user's choice.
            switch(choice)
            {
                case "1":
                    System.out.println("Thank you for using safaricom");
                    break;
                case "2":
                    System.out.println("Thank you for using safaricom");
                    break;
                case "0":
                    menu_2();
                    break;
                case "cancel":
                    System.out.println("Thank you for using safaricom");
                    System.exit(0);
                default :
                    System.out.println("\n\nInvalid choice. Try again.");
            }
    }
}


 void check_balance()
{
    System.out.println("\n\nOkoa Jahazi account statement:");
    System.out.println("1:Okoa Chap Chap");
    System.out.println("2:Outstanding Okoa Jahazi debts");
    System.out.println("3:Okoa Jahazi account balance");
    System.out.println("4:Check My Okoa Debt");
    System.out.println("0:BACK");
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

}

 




class Jahazi
{

/*This the main function.It calls the menu_1 function which displays the first piece of
 * the menu.
 * It also loops over ther this same function until the user exits the program.
*/
    public static void main(String[] args)
    {

        //This variable is used to read user's choices used to make decision in
        //the swith statement.
        String choice = "null";

        //Reference variable for accessing function of class Okoa_jahazi
        Okoa_jahazi access = new Okoa_jahazi();

        //This while loop runs until the user chooses to exit the program.
        //The while loop will display a menu for the user to choose to run the 
        //program or exit the program.
        while(("2".compareTo(choice))!= 0)
        {
            System.out.println("*131#: Menu");
            System.out.println("2.Exit");
            choice = access.input();

            switch(choice)
            {
                case "*131#":
                    access.menu_1();//will the function that displays the first part of the menu.
                    break;
                case "2": //this case exit the program when the choice is == 2
                    System.out.println("Thank you for using safaricom");
                    System.exit(0);
                default: //this case ensure correct user choice, by use of a function recursion.
                    System.out.println("\n\nInvalid choice.Try again.");
            }
        }

        }
}