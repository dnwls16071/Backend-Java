package ex1;

public class NetworkServiceV2 {

	public void sendMessage(String data) {
		NetworkClientV2 networkClient = new NetworkClientV2("http://example.com");
		networkClient.initError(data);

		// 정상 흐름과 예외 흐름 뒤섞여있어 코드를 읽기가 매우 힘들었음
		String connectResult = networkClient.connect();
		if (connectResult.equals("connectError")) {
			System.out.println("[네트워크 연결 오류] : " + connectResult);
		} else {
			String sendResult = networkClient.send(data);
			if (sendResult.equals("sendError")) {
				System.out.println("[전송 오류] : " + sendResult);
			}
		}
		networkClient.disconnect();
	}
}
