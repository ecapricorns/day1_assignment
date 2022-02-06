//function hinding

class Parent{
	
	public static void f1()
	{System.out.println("Hello this is super class");}
	
}

class Child extends Parent{
	
	public static void f1()
	{System.out.println("Hello this is child class");}
	
}

public class StaticMember{
	
	public static void main(String [] args){
		
		super.Child.f1();
	}
}

//when overrinding occure then the function is instance function not a static , do not confuse;
// Static member variable never inherit;