package animal;

public class dog extends animal implements animalactions{
	
	public dog(String name, int age) {
		super(name,age,"dog");
	}
	
	@Override
	public String toString() {
		return super.GetName() + "_" + String.valueOf(super.GetAge()) +
		"_" + super.GetGender();
	}
}
