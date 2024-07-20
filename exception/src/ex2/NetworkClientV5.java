package ex2;

public class NetworkClientV5 {

	private final String address;
	private boolean connectError;
	private boolean sendError;

	public NetworkClientV5(String address) {
		this.address = address;
	}

	public void connect()  {
		if (connectError) {
			throw new ConnectExceptionV5(address + " 서버 연결 실패", address);
		}
		System.out.println(address + " 서버 연결 성공");
	}

	public void send(String data)  {
		if (sendError) {
			throw new SendExceptionV5(address, address + " 서버 데이터 전송 실패: " + data);
		}
		System.out.println(address + " 서버 데이터 전송 성공: " + data);
	}
	
	public void disconnect() {
		System.out.println(address + " 서버 연결 해제");
	}

	public void initError(String data) {
		if (data.contains("error1")) {
			connectError = true;
		}

		if (data.contains("error2")) {
			sendError = true;
		}
	}
}
