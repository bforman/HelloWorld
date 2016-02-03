import static org.junit.Assert.*;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/*
 * HelloTest.java : JUnit test class for Hello.java
 * 
 * Tests out functionality of specified features in Hello.java
 */
public class HelloTest {
	/*
	 * outputLog - stream that records output from Hello.java
	 * errorLog - stream that records error info from running unit tests
	 */
	private final ByteArrayOutputStream outputLog = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errorLog = new ByteArrayOutputStream();
	/*
	 * initializeStreams()
	 * 
	 * 1) sets System.out to send output to the outputLog
	 * 2) sets the error stream to errorLog
	 */
	public void initializeStreams() {
		System.setOut(new PrintStream(outputLog));
	    System.setErr(new PrintStream(errorLog));
	}
	/*
	 * wipeStreams()
	 * 
	 * clears the buffer of both streams
	 */
	public void wipeStreams()
	{
		System.setOut(null);
		System.setErr(null);		
	}
	/*
	 * testHelloWorld()
	 * 
	 * tests the printHelloWorld() method from Hello.java
	 */
	@Test
	public void testHelloWorld() {
		initializeStreams();
		String test = "Hello World";
		Hello hello = new Hello();
		hello.printHelloWorld();
		assertEquals(test, outputLog.toString());
		wipeStreams();
	}
	/*
	 * testHelloBen()
	 * 
	 * tests the printHelloBen() method from Hello.java
	 */
	@Test
	public void testHelloBen() {
		initializeStreams();
		String test = "Hello Ben";
		Hello hello = new Hello();
		hello.printHelloBen();
		assertEquals(test, outputLog.toString());
		wipeStreams();
		
	}
	/*
	 * testHelloUser()
	 * 
	 * tests the printHelloUser() method from Hello.java
	 */
	@Test
	public void testHelloUser() {
		initializeStreams();
		String test = "Hello Matt";
		Hello hello = new Hello("Matt");
		hello.printHelloUser("Matt");
		assertEquals(test, outputLog.toString());
		wipeStreams();
	}
	/*
	 * testConversation()
	 * 
	 * tests printConversation() method from Hello.java
	 */
	@Test
	public void testConversation() {
		initializeStreams();
		String test = "Hello Doc. My name is Cpu. How are you Doc?";
		Hello hello = new Hello("Doc", "Cpu");
		hello.printConversation("Doc", "Cpu");
		assertEquals(test, outputLog.toString());
		wipeStreams();
	}
	/*
	 * testHelloUserWithProperCase()
	 * 
	 * tests the properCase() method from Hello.java
	 */
	@Test
	public void testHelloUserWithProperCase() {
		initializeStreams();
		String test = "Hello Matt";
		Hello hello = new Hello("mAtT");
		hello.printHelloUser("mAtT");
		assertEquals(test, outputLog.toString());
		wipeStreams();
	}
	/*
	 * testConversationWithProperCase()
	 * 
	 * tests the properCase method from Hello.java
	 */
	@Test
	public void testConversationWithProperCase() {
		initializeStreams();
		String test = "Hello Doc. My name is Cpu. How are you Doc?";
		Hello hello = new Hello("dOC", "cPu");
		hello.printConversation("dOc", "cPu");
		assertEquals(test, outputLog.toString());
		wipeStreams();
	}
}
