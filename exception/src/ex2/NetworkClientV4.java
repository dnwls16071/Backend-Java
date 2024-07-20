package ex2;

public class NetworkClientV4 {

	private final String address;
	private boolean connectError;
	private boolean sendError;

	public NetworkClientV4(String address) {
		this.address = address;
	}

	public void connect() throws ConnectException {
		if (connectError) {
			throw new ConnectException(address + " 서버 연결 실패", address);
		}
		System.out.println(address + " 서버 연결 성공");
	}

	public void send(String data) throws SendException {
		if (sendError) {
			throw new SendException(address, address + " 서버 데이터 전송 실패: " + data);
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
