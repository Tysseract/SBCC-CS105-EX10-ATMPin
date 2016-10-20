package unittest.cs105;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import edu.sbcc.cs105.AtmPin;

public class AtmPinTester {
	private static final int maximumScore = 8;
	private static final int maximumAssignmentScore = 12;
	private static int totalScore;

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

	@Test
	public void testOneAttemptCorrect() {
		AtmPin.PinValidationResult result = AtmPin.validatePin("1234", 0);
		assertTrue("Should accept 1234.", result == AtmPin.PinValidationResult.UNLOCKED_PIN_CORRECT);

		totalScore += 2;
	}

	@Test
	public void testTwoAttempsCorrect() {
		AtmPin.PinValidationResult result = AtmPin.validatePin("1337", 1);
		assertTrue("Should not accept 1234.", result == AtmPin.PinValidationResult.UNLOCKED_PIN_INCORRECT);

		totalScore += 2;
	}

	@Test
	public void testThreeAttemptsIncorrect() {
		AtmPin.PinValidationResult result = AtmPin.validatePin("1337", 2);
		assertTrue("Should not accept 1234.", result == AtmPin.PinValidationResult.LOCKED);

		totalScore += 2;
	}

	@Test
	public void testThreeAttemptsCorrect() {
		AtmPin.PinValidationResult result = AtmPin.validatePin("1234", 2);
		assertTrue("Should accept not 1234.", result == AtmPin.PinValidationResult.UNLOCKED_PIN_CORRECT);

		totalScore += 2;
	}

}
