import java.util.Scanner;

class mark_sheet
{
    public static void main(String[] args)
    {
        //initializing the array to hold the values.
        int sub[][] = new int[3][5];

        //initializing the  variables
        String Sname[]= new String[3], Sno[]= new String[3];
        int total[] = new int[3];
        double average1[] = new double[3], average2[] = new double[5];

        //creating the input reference variable.
        Scanner input = new Scanner(System.in);

        //A loop to read in the values from the user.
        System.out.print("Enter the name of student1: ");
        Sname[0] = input.next();

        System.out.print("Enter your Sno.");
        Sno[0] = input.next();

        for(int i = 0;i<3;i++)
        {
            for(int j =0;j<5;j++)
            {
                System.out.print("Enter the sub"+(j+1)+":");
                sub[i][j] = input.nextInt();
            }
            if(i < 2)
            {
                System.out.print("Enter the name of student"+(i+2)+": ");
                Sname[(i+1)] = input.next();
                System.out.print("Enter your Sno.");
                Sno[(i+1)] = input.next();
            }
        }


        //calcutating the sum
        for(int k =0;k<3;k++)
        {
            for(int h=0;h<5;h++)
            {
                total[k] = total[k] + sub[k][h];
            }
        }

        //calculating the averages for each student.
        for(int i=0; i<total.length;i++)
        {
            average1[i]=(total[i]/5);
        }
        //calculating the averages for each sub
        for(int j=0;j<5;j++)
        {
            for(int i =0;i<3;i++)
            {
                average2[j]=0;
                average2[j] = (average2[j] + sub[i][j]);
            }
        }

        //printing the page layout.
        //----------------------------------------------------------------------------------------------------------------------------------
        System.out.println("Wlecome to the Student Mark List Application");
        System.out.println("...................................................................................................................................................");
        System.out.println("SNo Student Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println(".....................................................................................................................................................");

        for(int i=0;i<3;i++)
        {
            System.out.print(Sno[i]+"\t"+Sname[i]+" ");
            for(int j=0;j<5;j++)
            {
                if(j==0)
                {
                    System.out.print("\t\t");
                }
                System.out.print(sub[i][j]+"\t");
            }
            System.out.println(total[i]+"\t"+average1[i]);
        }

        //printing the sub Averages.
        
        for(int i=0;i<5;i++)
        {
            if(i==0)
                System.out.print("\t\t");
            System.out.print("\t"+average2[i]);
        }
        System.out.println();
        input.close();
        System.out.println("........................................................................................................................");
        
    }
}
