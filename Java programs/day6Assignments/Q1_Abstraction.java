package day6Assignments;

abstract class Google {
	abstract void search();          //abstract method
	abstract void show();            //abstract method
    void message()                   // normal method
    {
    	System.out.println("Thankyou for using google...");
	
	}

}
class SearchAll extends Google
{
	void search()
	{
		System.out.println("All search results");
	}
	void show()
	{
		System.out.println("Showing all search results");
	}
}
class SearchImage extends Google
{
	void search()
	{
		System.out.println("Image search results");
	}
	void show()
	{
		System.out.println("Showing all image search results");
	}
	void message()
	{
		System.out.println("Thankyou for image results");
	}
	
}
class Q1_Abstraction
{
	public static void main(String[]args)
	{
		Google a= new SearchAll();
		Google i= new SearchImage();
		i.search();
		i.show();
		i.message();
	}
}

