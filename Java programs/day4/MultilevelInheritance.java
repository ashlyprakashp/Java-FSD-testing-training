package day4;
class Animalia
{
	void eat()
	{
	System.out.println("Animalia is eating");
	}
}
class Doggie extends Animal
{
	void bark()
	{
	System.out.println("Doggie is barking");
	}
}
class Puppy extends Doggie{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}
class MultilevelInheritance
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Puppy obj=new Puppy();
		obj.weeping();
		obj.bark();
		obj.eat();
	}
}