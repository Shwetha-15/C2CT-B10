package day11;

public class Array_1 {

	public static void main(String[] args) 
	{
		int a[] = new int[4];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;

        //for(int i:a)
        for (int i = 0; i < 5; i++)
        {
        	try 
        	{
        		System.out.println("the array is : "+a[i]);	
			} 
//        	finally
//        	{
//        		System.out.println("hi finally");
//			}
        	catch (Exception e) 
        	{
				// TODO: handle exception
        		System.out.println("hi catch");
        		e.printStackTrace();
			}
        }
	}

}
