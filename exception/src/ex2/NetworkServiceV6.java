package ex2;

public class NetworkServiceV6 {

	String address = "http://example.com";

	public void sendMessage(String data) {
		try (NetworkClientV6 networkClient = new NetworkClientV6(address)) {
			networkClient.initError(data);
			networkClient.connect();
			networkClient.send(data);
		} catch (Exception e) {
			System.out.println("예외 확인 : " + e.getMessage());
			throw e;
		}
	}
}
