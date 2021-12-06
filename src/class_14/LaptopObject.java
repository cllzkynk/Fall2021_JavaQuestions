package class_14;

public class LaptopObject {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.make = "Mac";
		laptop.model = "pro 16";
		laptop.storage = 1;
		laptop.RAMCapacity = 16;
		laptop.color = "pink";
		laptop.processor = "Core i7";
		laptop.GPU = "Nividia RTX 3090 12GB DDR6x";

		laptop.playMovies();
		laptop.makeVideoCall("Trump");
		laptop.browseInternet();

		System.out.println(laptop.getModel());
		System.out.println(laptop.getRamCapacity());
		System.out.println(laptop.upgradeRAM(2));

	}

}
