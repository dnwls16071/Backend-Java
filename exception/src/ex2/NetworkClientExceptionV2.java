package ex2;

public class NetworkClientExceptionV2 extends Exception {
	private String errorCode;

	public NetworkClientExceptionV2(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}
}
