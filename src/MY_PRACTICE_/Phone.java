package MY_PRACTICE;

public class Phone {

	String number;
	String color;
	int size;
	String model;

	void call() {
		System.out.println("Calling");
	}

	void text() {
		System.out.println(model + " can send you message ");
	}

	void facetime() {
		System.out.println(model + " facetimes anyone");
	}

	public static void main(String[] args) {
		Phone iphone = new Phone();

		iphone.number = "347-417-6296";
		iphone.color = "space gray";
		iphone.size = 8;
		iphone.model = "Iphone";

		iphone.call();
		iphone.text();
		iphone.facetime();

	}

}
