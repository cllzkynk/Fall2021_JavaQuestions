package MY_PRACTICE;

public class Dog {

	String breed;
	String name;
	String color;
	int age;
	boolean isGoodGirl;

	void sleeps() {
		System.out.println(breed + " sleeps all day long");
	}

	void barks() {
		System.out.println(breed + " barks when hungry");

	}

	void treats() {
		if (isGoodGirl) {
			System.out.println(name + " will get treats");
		} else {
			System.out.println("No hugs");
		}
	}

	public static void main(String[] args) {
		Dog Daisy = new Dog();
		Daisy.breed = "labrador";
		Daisy.color = "golden";
		Daisy.age = 2;
		Daisy.isGoodGirl = true;
		Daisy.name = "Daisy";
		Daisy.sleeps();
		Daisy.barks();
		Daisy.treats();

	}
}