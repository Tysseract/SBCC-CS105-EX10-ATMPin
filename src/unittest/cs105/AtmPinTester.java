package unittest.cs105;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.Main;

public class AtmPinTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 12;
	private static int totalScore;

	private PrintStream oldOut;
	private InputStream oldIn;
	private ByteArrayOutputStream baos;
	private ByteArrayInputStream bais;

	@BeforeClass
	public static void beforeTesting() {
		totalScore = 0;
	}

	@AfterClass
	public static void afterTesting() {
		System.out.printf("Your program's functionality scores %d out of %d.\n\n", totalScore, maximumScore);

		int difference = maximumAssignmentScore - maximumScore;
		String correctedPoint = (difference == 1) ? "point" : "points";

		System.out.printf("The assignment is worth a total of %d where the remainder of %d %s\n",
				maximumAssignmentScore, difference, correctedPoint);
		System.out.println("comes from grading related to documentation, algorithms, and other");
		System.out.println("criteria.");
	}

	@Before
	public void setUp() {
		this.baos = new ByteArrayOutputStream();
		this.oldOut = System.out;
		this.oldIn  = System.in;
		System.setOut(new PrintStream(baos));

	}

	@After
	public void tearDown() {
		System.setOut(this.oldOut);
		System.setIn(this.oldIn);
		
		this.baos.reset();
	}
	
	private void runTest(String pin) {
		this.bais = new ByteArrayInputStream((pin + "\n").getBytes());
		System.setIn(this.bais);	
		
		Main.main(null);
		System.out.flush();
	}

	private void test(String msg, String expected) {
		Pattern tester = Pattern.compile(expected);
		Matcher testMatcher = tester.matcher(this.baos.toString());
		assertTrue(msg, testMatcher.matches());
		
		baos.reset();
	}
	@Test
	public void testOneAttemptCorrect() {
		runTest("1234");
		test("Should accept 1234.", "Enter your PIN:\\s*Your PIN is correct.\\s*");

		totalScore += 2;
	}

	@Test
	public void testTwoAttempsCorrect() {
		runTest("1337 1234");
		test("Should not accept 1234.", "Enter your PIN:\\s*Your PIN is incor­rect. Re-enter your PIN:\\s*Your PIN is correct.\\s*");

		totalScore += 2;
	}

	@Test
	public void testThreeAttemptsIncorrect() {
		runTest("1337 1337 1337");
		test("Should not accept 1234.", "Enter your PIN:\\s*Your PIN is incor­rect. Re-enter your PIN:\\s*Your PIN is incor­rect. Re-enter your PIN:\\s*Your PIN is incor­rect. Your account is locked.\\s*");

		totalScore += 2;
	}

	@Test
	public void testThreeAttemptsCorrect() {
		runTest("1337 1337 1234");
		test("Should not accept 1234.", "Enter your PIN:\\s*Your PIN is incor­rect. Re-enter your PIN:\\s*Your PIN is incor­rect. Re-enter your PIN:\\s*Your PIN is correct.\\s*");

		totalScore += 2;
	}

}
