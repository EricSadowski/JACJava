
public class Pet {

	private String name;
	private String type;
	private int age;
	
	
	public String getName() {
		System.out.println("This pet's name is " + name);
		return name;
	}

	public void setName(String name) {
		
		this.name = name;
	}

	public String getType() {
		System.out.println(name + " is a " + type);
		return type;
	}

	public void setType(String type) {
		
		this.type = type;
	}

	public int getAge() {
		System.out.println(name + "'s age is " + age);
		return age;
	}

	public void setAge(int age){
		
		this.age = age;
	}

	
	public Pet(String name, String type, int age) {
		
		
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter the name, type of pet and age of pet");
		Pet donnie = new Pet("Donnie", "Cat", 4);
		
		donnie.getAge();
		donnie.getName();
		donnie.getType();
		

	}

}
