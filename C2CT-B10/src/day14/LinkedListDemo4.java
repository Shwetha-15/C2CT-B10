package day14;

import java.util.LinkedList;

public class LinkedListDemo4 
{
    public static void main(String[] args) 
    {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		System.out.println(l);
		l.addFirst(15);//add element at first index
		System.out.println(l);
		l.addLast(25);//add element at last index
		System.out.println(l);
		l.remove();//removes first element
		System.out.println(l);
		l.removeFirst();//removes first element
		System.out.println(l);
		l.removeLast();//removes last element
		System.out.println(l);
		l.add(5, 16);
		System.out.println(l);
	}
}
