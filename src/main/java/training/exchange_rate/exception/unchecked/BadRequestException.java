package training.exchange_rate.exception.unchecked;

import training.exchange_rate.exception.UncheckedException;

public class BadRequestException extends UncheckedException {

	private static final long serialVersionUID = 1L;

	public BadRequestException(String message) {
		super(message);
	}

	public BadRequestException() {
		super();
	}

	public BadRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BadRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public BadRequestException(Throwable cause) {
		super(cause);
	}

}