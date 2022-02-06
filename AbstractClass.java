// you can not create object of abstract class but u can create ref variable of abstract class;
//use for common characteristics
//

abstract class Person{
	private String name;
	private int age;
	public void setName(String n){
		name=n;
	}
	public void setAge(int a){
		age=a;
	}
	
}

class Student extends Person{
	

}
	
	


class AbstractClass{
	
	public static void main(String [] main){
		
		//Person p = new Person(); // can't instantiated
		Student s1 = new Student();
		System.out.println(s1.setName("Shubham"));
		System.out.println(s1.setAge(20));
	}
}