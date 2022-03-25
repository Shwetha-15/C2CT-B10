package com.jpa.association;

import java.util.ArrayList;
import java.util.List;

public class MainClass 
{
    public static void main(String[] args) 
    {
		Person p=new Person();
		p.setName("shwetha");
		
		Mobile m1=new Mobile();
		m1.setMobile_num("9108345055");
		Mobile m2=new Mobile();
		m2.setMobile_num("9108345056");
		
		List<Mobile> l=new ArrayList();
		l.add(m1);
		l.add(m2);
		p.setNumbers(l);
		System.out.println(p.getNumbers()+"mobile numbers of the person");
		p.getName();
	}
}
