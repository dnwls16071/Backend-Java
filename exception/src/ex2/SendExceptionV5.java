package ex2;

public class SendExceptionV5 extends NetworkClientExceptionV5 {
	private final String data;

	public SendExceptionV5(String data, String message) {
		super(message);
		this.data = data;
	}

	public String getData() {
		return data;
	}
}
