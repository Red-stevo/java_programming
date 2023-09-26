import java.util.Scanner;

class Selection_statements
{
    public static void main(String[] args)
        {
            
            //Initializing the values for the static information in the program
            final String name="Brenda Mukami", Roll_No="C026-01-0921/2022", Semester="2.2";

            //Declaring variable to hold the data to be read from the user
            String Unit_code[] = new String[4];
            String Unit_name[] = new String[4];
            int Score[] = new int[4];

            //Declaring variable for internal computation
            double total = 0, average;
            char grade;

                    //Reading data from the user
            //----------------------------------------------------------------------------
            Scanner input = new Scanner(System.in);
            for(int i=0;i<Score.length;i++)
            {
                System.out.print("Enter your Unit name"+(i+1)+"\nName: ");
                Unit_name[i] = input.next();

                System.out.print("Enter your Unit Code"+(i+1)+"\nCode: ");
                Unit_code[i]= input.next();

                System.out.print("Enter your Score "+(i+1)+"\nScore: " );
                Score[i] = input.nextInt();
            }

                        //computing total and the average and the grade.
            //-----------------------------------------------------------------------------
            //for loop to calculate the totals of the scores
            for(int mark = 0;mark<Score.length; mark++)
            {
                total+=Score[mark];
            }

            //calcuating the average
            average = total/4;


            //computing the grade using the if_else-if statement
            if(average >= 70 && average <= 100)
                grade='A';
            else if(average >= 60)
                grade ='B';
            else if(average >= 50)
                grade='C';
            else if(average >=40)
                grade = 'D';
            else if(average >=0)
                grade = 'F';
            else
                grade = '-';            

                        //Print the pages Layout and the the enterd and computed information.
            //-------------------------------------------------------------------------------
            //The page header.
            System.out.println("\t\t\t Department of Computer Science\n\t\t\t\tEnd Semester Results");
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("|Name:- " +name+"\t|Roll_No:- "+Roll_No+"\tSemester:- "+Semester);
            System.out.println("..............................................................................");
            System.out.println("|Unit Code\t\t|Unit Name:\t\t\tScore");
            System.out.println("------------------------------------------------------------------------------");
            
            //print the information in the Arrays.
            for(int i=0;i<Score.length;i++)
            {
                System.out.println("|"+Unit_code[i]+"\t\t|"+Unit_name[i]+"\t\t\t|"+Score[i]+"\n");
            }

            //printing the total.
            System.out.println("|Total\t\t\t\t\t\t\t|"+((int)total));
            System.out.println("------------------------------------------------------------------------------");
           
            //printing the Average
            System.out.println("|Average\t\t\t\t\t\t|"+average);
            System.out.println("------------------------------------------------------------------------------");
           
            //printing the Grade
            System.out.println("|Grade\t\t\t\t\t\t\t|"+grade);
            System.out.println("------------------------------------------------------------------------------");
           
            System.out.println("\t\t\t\t\tRecommendation  |");
            System.out.println("------------------------------------------------------------------------------");
           
            //printting the bottow part of the page.
            System.out.println("Grading Creiteria\t\tOverall Grade(A-D)\t Recommend Pass");
            System.out.println("70-100\t\tA");
            System.out.println("60-70\t\tB");
            System.out.println("50-60\t\tC");
            System.out.println("40-50\t\tD");
            System.out.println("Below 40 \tF");
            System.out.println("------------------------------------------------------------------------------");
            //closing the refence variable
            //--------------------------------------------------------------------------------
            input.close();
        }
}