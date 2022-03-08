package day18;
public class Villan implements Actor,Hero
{
    public void act()
    {
    	System.out.println("I can act");
    }
    public void speak()
    {
    	System.out.println("I can speak");
    }
    public void rude()
    {
    	System.out.println("I am rude");
    }
    public void acting()
    {
    	System.out.println("I will do acting");
    }
    public void fighting()
    {
    	System.out.println("I will do fighting");
    }
    public static void main(String[] args) 
    {
		Villan v=new Villan();
		v.act();
		v.speak();
		v.comedy();
		v.rude();
		v.acting();
		v.fighting();
	}
}
