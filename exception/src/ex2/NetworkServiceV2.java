package ex2;

public class NetworkServiceV2 {

	public void sendMessage(String data) throws NetworkClientExceptionV2 {
		NetworkClientV2 networkClient = new NetworkClientV2("http://example.com");
		networkClient.initError(data);

		networkClient.connect();
		networkClient.send(data);
		networkClient.disconnect();
	}
}
