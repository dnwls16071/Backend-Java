package ex2;

public class NetworkServiceV4 {

	public void sendMessage(String data) throws NetworkClientExceptionV3 {
		NetworkClientV4 networkClient = new NetworkClientV4("http://example.com");
		networkClient.initError(data);

		try {
			networkClient.connect();
			networkClient.send(data);
		} catch (ConnectException e) {
			System.out.println("오류 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
		} catch (SendException e) {
			System.out.println("오류 : " + e.getData() + ", 메시지 : " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			networkClient.disconnect();
		}
	}
}
