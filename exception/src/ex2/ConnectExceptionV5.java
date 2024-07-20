package ex2;

public class ConnectExceptionV5 extends NetworkClientExceptionV5 {

	private final String address;

	public ConnectExceptionV5(String address, String message) {
		super(message);
		this.address = address;
	}

	public String getAddress() {
		return address;
	}
}
