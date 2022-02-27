package Practice2;
import java.util.ArrayList;
public class MainOfStudent 
{
    public static void main(String[] args) 
    {
		ArrayList<Student> a=new ArrayList<>();
		a.add(new Student(01, "Shwetha", 98.90));
		a.add(new Student(02, "Goutham", 67.98));
		a.add(new Student(03, "Priya", 87.67));
		a.add(new Student(04, "Kusuma", 76.23));
		a.add(new Student(05, "Nithya", 99.98));
		System.out.println(a);
		System.out.println("Printing student details one by one");
		System.out.println("--------------------------------------");
		for (int i = 0; i < a.size(); i++) 
		{
			System.out.println(a.get(i));
		}
	}
}
