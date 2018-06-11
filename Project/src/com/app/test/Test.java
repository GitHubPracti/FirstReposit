package com.app.test;

public class Test {
	public void mod() {
	int x=10/2;
	System.out.println(x);
	}

	public void add() {
		int x=10+20;
		System.out.println(x);
	}
	
	public int sub(int x,int y)
	{
		int z=x-y;
		return z;
	}
	public int mul(int x,int y) {
		int z=x*y;
		return z;
	}
	public static void main(String[] args) {
		
	System.out.println("abc");

	Test t=new Test();
	t.add();
	t.sub(10, 58);

	System.out.println("abc");

	t.mod();
	System.out.println("  ****   ");

	t.mul(12,5);
	System.out.println(t);

	}
}
class Demo
{
public static void main(String[] args) {
	
	Test t=new Test();
	t.add();t.mul(10, 5);
	t.mod();t.toString();
	System.out.println("hello");
}	
}