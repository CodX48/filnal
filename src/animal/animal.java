package animal;


public abstract class animal{
	private String name;
	private int age;
	private String gender;
	
	//Constructor
	public animal(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	//getters and setters
	public String GetName() {return name;}
	public int GetAge() {return age;}
	public String GetGender() {return gender;}
	
	//functions
	
	public void run() {
		System.out.println("the " + gender + " is running");
	}
	
	
	
	public void run(int speed) {
		System.out.println( name + " is running, with a speed: " + speed );
	}
	
	
}
