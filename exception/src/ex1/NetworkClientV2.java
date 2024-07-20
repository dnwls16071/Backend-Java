package ex1;

public class NetworkClientV2 {

	private final String address;
	private boolean connectError;
	private boolean sendError;

	public NetworkClientV2(String address) {
		this.address = address;
	}

	// 연결 오류 코드 : connectError
	public String connect() {
		if (connectError) {
			System.out.println(address + " 서버 연결 실패");
			return "connectError";
		}
		System.out.println(address + " 서버 연결 성공");
		return "Success";
	}

	// 전송 오류 코드 : sendError
	public String send(String data) {
		if (sendError) {
			System.out.println(address + " 서버에 데이터 전송 실패: " + data);
			return "sendError";
		}
		System.out.println(address + " 서버에 데이터 전송: " + data);
		return "Success";
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
