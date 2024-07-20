package ex2;

public class NetworkServiceV3 {

	public void sendMessage(String data) throws NetworkClientExceptionV2 {
		NetworkClientV3 networkClient = new NetworkClientV3("http://example.com");
		networkClient.initError(data);

		try {
			networkClient.connect();
			networkClient.send(data);
		} catch (NetworkClientExceptionV2 e) {
			System.out.println("오류 : " + e.getErrorCode() + ", 메시지 : " + e.getMessage());
		} finally {
			networkClient.disconnect();
		}
	}
}
