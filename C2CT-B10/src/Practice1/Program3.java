package Practice1;
public class Program3 
{
    public static void main(String[] args) 
    {
    	 try
         {
               System.out.println(4/0);                                                               //no error
  	           //will not get printed
               System.out.println("end of try!");                                                  
          }
          catch(ArithmeticException e)
          {
              System.out.println("divide by 0");
          }
	}
}
