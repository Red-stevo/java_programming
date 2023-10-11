import java.util.Scanner;

//marks list program.
class mark_list
{
	//global variable , will be used to create the refence variable for data input in the function input().
    static Scanner input;

    //Function used to input string data.
	static String input(String info)
    {
        String data = "null";

        input=new Scanner(System.in);
        try
        {
            System.out.print(info);
            data = input.nextLine();
        }
        catch(NumberFormatException e)
        {
            System.out.println("An error occurred");
        }
        return data;
    }


	//The main function.
    public static void main(String[] args)
    {
        String names[] = new String[4]; //Array to store the names for each student.
        String roll[] = new String[4]; //Array to store the rol number d=for each student.
        int marks_tol[][] = new int[4][4]; //multidimentia array to hold the marks and totals for each students.
        double Ave[] = new double[4]; //Array to store the Average grade for the students.
        char results[]= new char[4]; //array to result for each students.
        char grade[] = new char[4]; //array to store the grades.



        //Read the user's roll number, the names, calculate the totals, Averages, Results and the grade.
        for(int i=0;i<4;i++)
        {
        	System.out.println("\n");
            roll[i] = input("Enter Your roll : ");
            names[i] = input("Enter your name : ");
            System.out.println("\n");
            for(int j=0;j<3;j++)
            {
            	//Catch  error if the user input cannot be converted to integer type.
                try
                {
                    marks_tol[i][j] =Integer.parseInt(input("Enter your mark"+(j+1)+": ___"));
                }
                catch(NumberFormatException e)
                {
                    System.out.println("You Enter A Non-Integer Value."); //Print the error message to user.This does not solve the error.
                }
				//sum the user marks.
                marks_tol[i][3] += marks_tol[i][j];
            }
            System.out.println("The Total is : "+marks_tol[i][3]); //Display the total after marks are entered.

            //calculate the Average
            Ave[i] = (marks_tol[i][3])/3;

            //assignning the results
            results[i] = Ave[i] > 50?'P':'F';

			//Grading the marks.
            if(Ave[i] >= 70 && Ave[i] <=100)
                grade[i] ='A';
            else if(Ave[i] >= 69)
                grade[i] = 'B';
            else if(Ave[i] >= 0)
                grade[i] = 'C';
            else
                grade[i] = '-';
        }

		//print the page header.
        System.out.println("******************************************************************************");
        System.out.println("\t\t\t\tSTUDENT MARKLIST");
        System.out.println("******************************************************************************");
        System.out.println("Roll\tName\tMark1\tMark2\tMark3\tTotal\tResults\tAverage\tGrade");

		//nested loop to print out the data for each user in table like format.
      	for(int i=0;i<4;i++)
        {
            System.out.println(roll[i]+"\t"+names[i]+"\t"+marks_tol[i][0]+"\t"+marks_tol[i][1]+"\t"+marks_tol[i][2]+"\t"+marks_tol[i][3]+"\t"+results[i]+"\t"+Ave[i]+"\t"+grade[i]);
        }
    }
}
