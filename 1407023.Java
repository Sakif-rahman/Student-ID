
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.*;


public class Student {



    int Id;
    String Name;
    String Department ;
    String University ;
    double[] GPA = new double[6];
    double[][] cgpa=new double [2][8];
    double CGPA;

    /**
     * Define a constructor that initilize the default properties of the Student
     */
    public Student(int Id,String Name,String department,String university)
    {
        id = Id;
        name = Name;
        Department = department;
        University = university ;
    }

    /**
     * Define a method to print the students details.
     */
    public void studentDetailsById(int id)
    {
        //write your code here
    	System.out.println("ID          : " + id);
    	System.out.println("Name        : " +name);
    	System.out.println("Department  : " + Department);
    	System.out.println("University  : " + University);
    }


    /**
     * Define a method to update information of students by ID
     * Use as many arguments as required.
     */
    public void updateStudentById(int id)
    {
        //Write your code here
    	System.out.println("Do you want to update (write yes/no) :");
    	String choice = input.nextBoolean();
    	if(choice == "yes" )
    	{
	    	name = input.nextLine();
    		System.out.println("Enter Name : ");
	    	name = input.nextLine();
	    	System.out.println("Enter Department : ");
	    	Department = input.nextLine();
	    	System.out.println("Enter University : ");
	    	University = input.nextLine();
	    	System.out.println("Updated Name   :  " +name+ "\nDepartment   :     " +Department+ "\nUniversity   :     " +University);
    	}
    	else
    	{
    	}
    }

    /**
     * Define a method to compute the CGPA from the Given term GPA for a particular student.
     * se as many arguments as required.
     */
    public double computeCGPAByID()
    {
        // Write your code here
    	double cgpa = 0;
    	int count = 0;

    	for(int i=0;i<8;i++)
    	{
    		System.out.println("Enter GPA of Sem " + (i+1) +" :  ");
    		GPA[i]=input.nextDouble();
    	}


    	for(int i=0;i<8;i++)
    	{

    		count++;
    		cgpa+=GPA[i];
    	}
    	cgpa/=count;
    	CGPA = cgpa;

    	return cgpa;
    }


    /**
     * Define a method to compute the GPA from the given Credits and Grades of all the subjects
     */


    /**
     * After performing required operations on each student, save the information to a file. Use File and PrintWriter Class.
     * use as many arguments as required.
     *
     */

    /**
     * Create a dummy files with infromations to describe the properties of a Student object and load the data files using Java File and Scanner class.
     * use as many arguments as required.
     */


    /**
     * The tasks to be carried out here:
     * 1. Create an Arrays of students using Student Class. Initlize them and perfom all the above defined operation to evualuate your code.
     * use as many arguments as required.
     */
    public static void main(String[] args) throws IOException
    {
    	Student[] students = new Student[50];
    	File inputFile = new File("input.txt");

		for(int i=0; in.hasNextLine() ; i++)
		{
			int r=in.nextInt();
			String n=in.next();
			String d=in.next();
			String u=in.next();
			students[i] = new Student(r,n,d,u);
			//students[i].loadStudents();
			students[i].studentDetailsById(r);
			students[i].updateStudentById(r);
            students[i].computeCGPAByID(r);

		}
		in.close();
    }
}
