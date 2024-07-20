package ex1;

public class NetworkService {

	public void sendMessage(String data) {
		NetworkClient networkClient = new NetworkClient("http://example.com");
		networkClient.connect();
		networkClient.send(data);
		networkClient.disconnect();
	}
}
