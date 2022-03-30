package day5;

public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation obj= new Encapsulation();
		obj.setName("Riya");
		obj.setID(8);
		obj.setSalary(30000);
		System.out.println("Name "+ obj.getName());
		System.out.println("ID "+ obj.getID());
		System.out.println("Salary "+ obj.getSalary());

	}

}
