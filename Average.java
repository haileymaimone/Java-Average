/*  
	CET-350 - Tech Computing Using Java
	Program 1 - Grade Averaging Program

	Hailey Maimone
*/
import java.io.*;

class Average 
{
    public static void main(String[] args) throws IOException 
	{
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        double grade = 0;   // double value to hold grades entered
        double sum = 0;     // double value to hold sum of grades
        int count = 0;      // integer value to hold the number of grades
        String line;        // string to read in data
		double ave;         // double value to hold the average of grades
        boolean good_number = false;
        while (grade >=0 && grade <= 100)   // loop to ensure grades entered are between 0 and 100, inclusive 
		{
			good_number = false;
			while(!good_number)   // loop to make sure input is a number
{
            System.out.print("Enter a grade: ");  // prints to screen
            System.out.flush();
			try  // checks for exceptions thrown
			{
				line = stdin.readLine();              // reads in grade entered
				grade = Double.valueOf(line).doubleValue();  // converts string read in to a double value
				good_number = true;
			}
			catch(NumberFormatException e) // lets user know the input was not a number, asks them to try again
			{
				System.out.println("You did not enter a number.  Try Again:" );
				//line = stdin.readLine();    // reads input from keyboard
				//grade = Double.valueOf(line).doubleValue();   // converts input to double
			}
}
			
			if (grade >= 0 && grade <= 100)    // if statement is true, the following is processed
			{
                sum = sum + grade;          // grade is added to sum
                count++;                    // count is incremented to keep track of the number of grades
                System.out.println(grade);  // prints the grade entered to the screen
            } else   // processed if the if statement is false
				{
                System.out.println("\n\nWARNING:  Invalid grade entered");
				}
        }
        if (grade < 0)  // if grade is less than zero, the following is processed
		{
            System.out.println("The grade entered is negative, exiting.\n");
        } 
		else 
			{
            System.out.println("The invalid grade entered is: "+ grade);  //prints the invalid grade entered to the screen
            System.out.println("\nNumber of valid grades entered: "+ count); // prints the number of valid grades entered to the screen
            System.out.println("Sum of valid grades: "+ sum);     // prints the sum of the valid grades to screen
			
			ave = sum/count;   // calculation to find average

            if (Double.valueOf(ave).isNaN()) // if the result of sum/count is not a number, the following is processed
			{
                System.out.println("The average is not a number");
            } 
			else if (Double.valueOf(ave).isInfinite())  //if sum/count is infinity 
			{
                System.out.println("The average is infinity.");
            } 
			else   // if the average calculated is a number and not infinity
			{
                System.out.println("The average is: "+ ave +"\n");  // prints the average to the screen
            }
			}
    }
}
