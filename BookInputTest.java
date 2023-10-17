import java.util.Scanner;
class Inputer
{
    Scanner in;
     //reading in data functionality.
    String input(String str)
    {
        String input = "null";
        System.out.print(str);

        try
        {
            this.in = new Scanner(System.in);
            input = in.nextLine();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return input;
    }
}


public class BookInputTest
{
    public static void main(String[] args)
    {
        //Instantiating the class object in.
        Inputer in = new Inputer();
        //Instantiating the class object biologyBook
        Book biologyBook = new Book();

        //using the Inputer class method to read in data for the object biologyBook
        biologyBook.title = in.input("Please enter the title of the book\n");

        //reading author using inputer class for the biologyBook object.
        biologyBook.author = in.input("Please enter the author name\n");

        //reading the pages of the book
        try
        {
            biologyBook.numberOfPages = Integer.parseInt(in.input("Please enter the number of pages\n"));
        }
        catch(NumberFormatException e)
        {
            System.out.println("Your Input Should be an Integer.");
        }

        //printing out the data
        System.out.println("The book title is : "+biologyBook.title);
        System.out.println("The book author is : "+biologyBook.author);
        System.out.println("The book has "+biologyBook.numberOfPages+"pages");
    }
}