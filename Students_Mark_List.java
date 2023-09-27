/*This is a java program to collect marks from the user the calculate the totas and average
and print the computation on a screen*/

import java.util.Scanner;

class student
{
    //member Variables to hold input data
    int marks[] = new int[3];
    int roll;
    String name;

    //variables used to hold calculational values.
    char results;
    String grade;
    double average;
    int total = 0;

//this is an input function for reading data from the user.
    public  void input()
        {
            //Declaring the reference variable for inputing data
            Scanner read = new Scanner(System.in);

            //reading the user's name.
            System.out.print("Enter your name\nName: ");
            name = read.next();

            //reading the user's roll number
            System.out.print("Enter your roll number\nRoll: ");
            roll = read.nextInt();

            //reading the users marks using a for loop.
            for(int i = 0; i<marks.length; i++)
            {
                System.out.print("Enter your mark"+(i+1)+"\nMark: ");
                marks[i] = read.nextInt();
            }
        //closing the read refence variable
        }


        //This function compute the totals, average and the grade.
        public void compute()
        {
            //computing the totals
            for(int i= 0; i<marks.length; i++)
            {
                total+=marks[i];
            }

            //computing the average
            average = total/3;

            //Assigning value of result using a ternary operator
            results = average >= 40?'P':'F';

            //Assinging grade using the if-ifelse statement
            if(average >=80 && average <= 100)
                grade = "A";
            else if(average >=75)
                grade = "B+";
            else if(average >=65)
                grade = "B";
            else if(average >= 55)
                grade = "C+";
            else if(average >= 50)
                grade = "C";
            else if(average >= 40)
                grade = "D";
            else if(average >=0 && average < 40)
                grade = "F";
            else
                grade = "-";


        }
}


//The main class for the program
public class Mark_list
    {
        public static void main(String[] args)
        {
            //Initializing the refence varable for a student
            student comrades[] = new student[4];

            //creating the objects of the class students
            student std1 = new student();
            std1.input();
            std1.compute();
            student std2 = new student();
            std2.input();
            std2.compute();
            student std3 = new student();
            std3.input();
            std3.compute();
            student std4 = new student();
            std4.input();
            std4.compute();


            //storing the objects in the student array
            comrades[0] = std1;
            comrades[1] = std2;
            comrades[2] = std3;
            comrades[3] = std4;

            //printing out the information
            System.out.println("**************************************************************************");
            System.out.println("\t\t\t\tSTUDENT MARKLIST");
            System.out.println("*************************************************************************");
            
            System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAVERAGE\tGRADE");
            for(int i=0; i<comrades.length;i++)
            {
                System.out.println(comrades[i].roll+"\t"+comrades[i].name+"\t"+comrades[i].marks[0]+"\t"+comrades[i].marks[1]+"\t"+comrades[i].marks[2]+"\t"+comrades[i].total+"\t"+comrades[i].results+"\t"+comrades[i].average+"\t"+comrades[i].grade);
            }
            

        }
    }