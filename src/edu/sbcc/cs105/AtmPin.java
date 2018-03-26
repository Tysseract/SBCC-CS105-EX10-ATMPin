package edu.sbcc.cs105;

public class AtmPin {
	public enum PinValidationResult {
	    UNLOCKED_PIN_CORRECT,
	    UNLOCKED_PIN_INCORRECT,
	    LOCKED
	}
	public static PinValidationResult validatePin(String pin, int incorrectCount) {
		String correctPin = "1234";
		
		PinValidationResult result = PinValidationResult.LOCKED;
		
		if(incorrectCount < 3) {
			if(pin.equals(correctPin)) {
				result = PinValidationResult.UNLOCKED_PIN_CORRECT;
			}
			else {
				if(incorrectCount > 1) {
					result = PinValidationResult.LOCKED;
				}
				else {
					result = PinValidationResult.UNLOCKED_PIN_INCORRECT;
				}
			}
		}
		else {
			result = PinValidationResult.LOCKED;
		}
		
		return result;
	}
}
