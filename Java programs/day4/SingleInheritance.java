package day4;

class Animal
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
	System.out.println("Dog is barking");
	}
}
class SingleInheritance
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Dog obj=new Dog();
		obj.bark();
		obj.eat();
	}
}

		

