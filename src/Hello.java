
public class Hello {
	public static void main(String[] args) {
		String name;
		if (args.length == 0) {
			System.out.println("Hello Ben");
		}
		else {
			name = args[0];
			System.out.println("Hello " + name);
		}
	}
}
