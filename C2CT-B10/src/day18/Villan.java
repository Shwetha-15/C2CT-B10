package day18;
public class Villan implements Actor
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
    public static void main(String[] args) 
    {
		Villan v=new Villan();
		v.act();
		v.speak();
		v.comedy();
		v.rude();
	}
}
