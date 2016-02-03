/*
 * Hello.java
 * 
 * @author Benjamin Forman
 * 
 * Simple Hello World program working with command line arguments which dictate the
 * 	message displayed to the user
 * 	Usage: 1) -me Username CPUname or 2) Username
 */
public class Hello {
	/*
	 * Fields:	defaultUser : String - the default username for the program
	 * 			username : String - the username passed in at the command line
	 * 			cpuName : String - the name of the computer passed in at the command line
	 */
	private String defaultUser = "Ben";
	private String username;
	private String cpuName;
	/*
	 * Default No-arg Constructor
	 */
	public Hello() {
	}
	/*
	 * Constructor for Hello user
	 * 
	 * @param username - the username passed in
	 */
	public Hello(String username) {
		this.username = username;
	}
	/*
	 * Constructor for Hello Conversation
	 * 
	 * @param username - the username passed in
	 * @param cpuName - the name for the program that is passed in
	 */
	public Hello(String username, String cpuName) {
		this.username = username;
		this.cpuName = cpuName;
	}
	/*
	 * main - carries out program execution
	 * 
	 * @param String args[] - array of command line arguments
	 */
	public static void main(String[] args) {
		Hello h = new Hello();
		if (args.length == 2 || args.length >= 4) {
			System.out.println("ERROR: Incorrect number of command line arguments");
			System.out.println("Usage: 1) -me Username CPUname or 2) Username" );
		}
		if (args.length == 0) {
			h.printHelloBen();
		}
		else if (args.length == 1) {
			if (args[0].equals("-me")) {
				System.out.println("Usage: 1) -me Username CPUname or 2) Username" );
			}
			else {
				h.printHelloUser(args[0]);
			}
		}
		else if (args.length == 3) {
			if (!args[0].equals("-me")) {
				System.out.println("Usage: 1) -me Username CPUname or 2) Username" );
			}
			else {
				String user = args[1];
				String cpu = args[2];
				h.printConversation(user,cpu);
			}
		}
	}
	/*
	 * printHelloWorld()
	 * 
	 * prints "Hello World" to the console
	 */
	public void printHelloWorld()
	{
		System.out.print("Hello World");
	}
	/*
	 * printHelloBen()
	 * 
	 * prints "Hello Ben" to the console
	 */
	public void printHelloBen() {
		System.out.print("Hello " + defaultUser);
	}
	/*
	 * printHelloUser()
	 * 
	 * prints "Hello 'username' to the console
	 * 
	 * @param user : String - the specified username passed in
	 */
	public void printHelloUser(String user) {
		Hello hello = new Hello(user);
		String name = hello.properCase(hello.username);
		System.out.print("Hello " + name);
		
	}
	/*
	 * printConversation()
	 * 
	 * prints a conversation between the user and computer
	 * 
	 * @param user : String - the specified username passed in
	 * @param cpu : String - the specified name given to the computer
	 */
	public void printConversation(String user, String cpu) {
		Hello hello = new Hello(user, cpu);
		String username = hello.properCase(hello.username);
		String cpuName = hello.properCase(hello.cpuName);
		System.out.print("Hello " + username + ". My name is " + cpuName + "." 
				+ " How are you " + username + "?");
	}
	/*
	 * properCase()
	 * 
	 * ensures that the passed in string is in proper case (first character capitalized,
	 * the rest of the characters lower-case
	 * 
	 * @param str : String - the string to be checked
	 */
	public String properCase(String str) {
		int length = str.length();
		str = str.substring(0,1).toUpperCase() + str.substring(1,length).toLowerCase();
		return str;
		
	}
}
