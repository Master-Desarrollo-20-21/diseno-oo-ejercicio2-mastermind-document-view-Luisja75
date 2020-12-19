package mastermind.views;

enum Message {
	ATTEMPTS("#NumAttempt Attempt(s):"),
	SECRET("*"),
	RESUME("RESUME"),
	RESULT(" --> #blacks blacks and #whites whites"),
	PROPOSED_COMBINATION("Propose a combination: "),
	TITLE("----- MASTERMIND -----"),
	WINNER("You've won!!! ;-)"),
	LOOSER("You've lost!!! :-("),
	SECRET_COMBINATION("Combination secret = ");

	private String message;

	Message(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
