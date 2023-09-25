import java.util.Scanner;


class Payroll
{
    public static void main(String[] args)
    {
        //Declaring the variables to hold enterd values.
        String Employee_no, name, designation,generation_date; //This statement initializes 4 string type variables.
        int days_worked; //integer variable to hold the days worked.
        double pay_rate; //this variable holds the rate of pay per hour of the employee.
        
        //Declaring computation variables
        final double PROF_TAX;
        double basic_pay, gross_earn, total_deduct, net_pay, pf;

        //reading in the evalues from the user.
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);


        //read Employee's number
        System.out.print("Enter your Employee Number: ");
        Employee_no = input.next();

        //read employeee's name.
        System.out.print("Enter your name: ");
        name = input.next();

        //read the designation.
        System.out.print("Enter your designation: ");
        designation = input.next();

        //read the generation data
        System.out.print("Enter your generation date: ");
        generation_date = input.next();

        //read the days worked
        System.out.print("Enter the number of days worked: ");
        days_worked = input.nextInt();

        //read the the pay rate for the user.
        System.out.print("Enter your pay rate: ");
        pay_rate = input.nextDouble();

        //closing the reference variable input
        input.close();

                                //computing the payroll.
        //------------------------------------------------------------------------------------------------------------------------------------------------------------
        //computing the basic pay.
        basic_pay = days_worked * pay_rate;

        //computing the PF
        pf = basic_pay/10;

        //computing the prof_tax
        PROF_TAX = 0.2*(basic_pay);

        //computing the gross earn
        gross_earn = basic_pay;

        //computing the total deduction.
        total_deduct = pf + PROF_TAX;

        //computing the net pay
        net_pay = basic_pay - total_deduct;

                                                //printing the value in the format provided.
        //----------------------------------------------------------------------------------------------------------------------------------------------------------------------

        //printing the the page header
        System.out.println("\t\t\t\tSHREE KRISHNA CHEMIST AND DRUGGIST\n\t\t\t\tSALARY MONTH "+ generation_date +"\n\n");

                //printing the page body
        //---------------------------------------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("EMP. NO: "+Employee_no + "\t\tEMP. NAME: "+ name + "\t\tDESIGNATION: "+ designation);
        System.out.println("DAYS WORKED: "+ (int)days_worked+ "\t\tPAY RATE:"+(int)pay_rate+"\t\tGEN.DATE: "+generation_date);
        System.out.println(".................................................................................................................................................");
        System.out.println("EARNINGS\t\tAMOUNT(Rs.)\t\tDEDUCTIONS\t\tAMOUNT(Rs.)");
        System.out.println(".................................................................................................................................................");
        System.out.println("BASIC PAY\t\t"+(int)basic_pay+"\t\t\tP.F.\t\t\t"+(int)pf);
        System.out.println("\t\t\t\t\t\tPROF.TAX\t\t"+(int)PROF_TAX);
        System.out.println(".................................................................................................................................................");
        System.out.println("GROSS EARN.\t\t"+(int)gross_earn+"\t\t\tTOTAL DEDUCT.\t\t"+(int)total_deduct);
        System.out.println("\t\t\t\t\t\tNET PAY\t\t\t"+(int)net_pay);
        System.out.println(".....................................................................................................................................");
    }
}
