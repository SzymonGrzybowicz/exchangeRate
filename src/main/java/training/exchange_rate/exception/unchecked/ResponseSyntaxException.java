package training.exchange_rate.exception.unchecked;

import training.exchange_rate.exception.UncheckedException;

public class ResponseSyntaxException extends UncheckedException {

	private static final long serialVersionUID = 1L;

	public ResponseSyntaxException() {
		super();
	}

	public ResponseSyntaxException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ResponseSyntaxException(String message, Throwable cause) {
		super(message, cause);
	}

	public ResponseSyntaxException(String message) {
		super(message);
	}

	public ResponseSyntaxException(Throwable cause) {
		super(cause);
	}
}