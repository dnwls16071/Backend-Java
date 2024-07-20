package ex2;

public class SendException extends NetworkClientExceptionV3{
	private final String data;

	public SendException(String data, String message) {
		super(message);
		this.data = data;
	}

	public String getData() {
		return data;
	}
}
