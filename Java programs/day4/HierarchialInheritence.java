package day4;
class Animals
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Dogs extends Animal
{
	void bark()
	{
	System.out.println("Dog is barking");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
class HierarchialInheritance
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
		//obj.bark();
	}
}

