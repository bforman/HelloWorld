
public class Hello {
	public static void main(String[] args) {
		String name;
		String cpuName;
		if (args.length == 0) {
			System.out.println("Hello Ben");
		}
		else {
			if (args.length == 3) {
				//System.out.println("in");
				//System.out.println(args[0]);
				if (args[0].equals("-me"))
				{
					cpuName = args[1];
					int len = cpuName.length();
					cpuName = cpuName.substring(0,1).toUpperCase() + cpuName.substring (1,len).toLowerCase();
					name = args[2];
					int l = name.length();
					name = name.substring(0,1).toUpperCase() + name.substring (1,l).toLowerCase();
					System.out.println("Hello " + name + ". My name is " + cpuName + ".");
					System.out.println("How are you " + name + "?");
				}
			}
			else if (args.length == 1) {
				name = args[0];
				int len = name.length();
				name = name.substring(0,1).toUpperCase() + name.substring (1,len).toLowerCase();
				System.out.println("Hello " + name);
			}
		}
	}
}
