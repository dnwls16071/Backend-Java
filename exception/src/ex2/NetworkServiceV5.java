package ex2;

public class NetworkServiceV5 {

	public void sendMessage(String data) throws NetworkClientExceptionV5 {
		NetworkClientV5 networkClient = new NetworkClientV5("http://example.com");
		networkClient.initError(data);

		try {
			networkClient.connect();
			networkClient.send(data);
		} finally {
			networkClient.disconnect();
		}
	}
}
