package Practice1;
public class Program6 
{
    public static void main(String[] args)
    {
    	 try
    	 {
             System.out.println(4/0);
             try{
                  int[] a={1,2,3};
                  System.out.println(a[3]);
              }
              catch(ArrayIndexOutOfBoundsException e)
              {
                  System.out.println("Out of bounds");                                                                  //no error
              }
         }
         catch(ArithmeticException e)
         {
              System.out.println("ArithmeticException : divide by 0");
         }
	}
}
