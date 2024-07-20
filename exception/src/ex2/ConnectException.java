package ex2;

public class ConnectException extends NetworkClientExceptionV3 {

	private final String address;

	public ConnectException(String address, String message) {
		super(message);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
