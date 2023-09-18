import java.util.Scanner;

class wagesdetails
{
    public static void main(String[] args)
    {
        String reg_no; //Will hold the users registration number
        double pay_rate; //Eill hold the payrate for user
        int work_hours ;//will hold the number of hours worked.
        double Total_wages; //Holds the value of the total wages
        double Hours;

        //Printing t'he title
        System.out.println("Wage Calculator\n------------------------------");

        //reading inputs from the user.
        Scanner details = new Scanner(System.in); //creating a reference variable called details.

        //reading in Registration number.
        System.out.print("Enter your Registration Number : ");
        reg_no = details.next(); //taking in the registration number from the user.

        System.out.print("Enter hourly pay rate : ");
        pay_rate = details.nextDouble(); //Reading in the pay rate for the user.

        System.out.print("Enter the hours worked : ");
        work_hours = details.nextInt(); // Reading in the hours worked.
        


        Total_wages = work_hours * pay_rate;
        Hours = (double)work_hours;

        System.out.println("\n\nWage Details:");
        System.out.println("Registration Number: \t\t"+ reg_no);
        System.out.println("Hourly Pay Rate: \t\t"+ "$"+pay_rate );
        System.out.println("Hours Worked:  \t\t\t"+ Hours);
        System.out.println("Total Wages:   \t\t\t" + "$" + Total_wages);
       
        details.close();
    }
}