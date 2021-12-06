package class_14;

public class Laptop {
	String make;
	String model;
	int storage;
	int RAMCapacity;
	String color;
	String processor;
	String GPU;

	void playMovies() {
		System.out.println("Play movies");
	}

	void browseInternet() {
		System.out.println("Browsing internet");
	}

	void makeVideoCall(String contact) {// argument in ()
		System.out.println("Videocalling to " + contact);
	}

	public String getModel() {
		return model;
	}

	int getRamCapacity() {
		return RAMCapacity * 2;
	}

	int upgradeRAM(int newRAMUnit) {
		return newRAMUnit * RAMCapacity;

	}

}
