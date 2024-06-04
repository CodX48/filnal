package animal;

public class cat extends animal implements animalactions{

	public cat(String name, int age) {
		super(name,age,"cat");
	}
	
	
	@Override
	public String toString() {
		return  super.GetName() + "_" + String.valueOf(super.GetAge()) +
		"_" + super.GetGender();
	}
}
