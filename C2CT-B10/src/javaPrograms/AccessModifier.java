//OOP's concept, Access modifier and Package
package javaPrograms;
public class AccessModifier 
{
	int nos;
	float hrs;
	int noc;
	void displayStudents() 
	{
		System.out.println("Number of Students");
	}
	void displayHours() 
	{
		System.out.println("Number of Hours");
	}
	void displayClass() 
	{
		System.out.println("Number of Class");
	}

	public static void main(String[] args)
	{
		Program1 am = new Program1();
		am.displayStudents();
		am.displayHours();
		am.displayClass();
	}
}
