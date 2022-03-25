package com.jpa.association1;

public class MainClass 
{
    public static void main(String[] args) 
    {
		Person p1=new Person();
		p1.setName("Shwetha");
		
		Person p2=new Person();
		p2.setName("Priya");
		
		Address a1=new Address();
		a1.setState("Karnataka");
		a1.setCity("Bangalore");
		
		Address a2=new Address();
		a2.setState("Karnataka");
		a2.setCity("Mysore");
		
		System.out.println(p1.getName()+" lives in "+a1.getCity()+" and state is "+a1.getState());
		System.out.println(p2.getName()+" lives in "+a2.getCity()+" and state is "+a2.getState());
	}
}
