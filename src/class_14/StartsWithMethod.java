package class_14;

public class StartsWithMethod {

	public static void main(String[] args) {
		String var = "you can get a real life example";
		System.out.println(var.startsWith("maybe"));
		System.out.println(var.startsWith("you")); // uppercase will give false
	}
}
