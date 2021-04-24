package info.spicyclient.testClient;

import info.spicyclient.testClient.networking.NetworkException;
import info.spicyclient.testClient.networking.NetworkConnection;
import info.spicyclient.testClient.networking.NetworkSubscription;
import info.spicyclient.testClient.networking.Security;

public class Main {

	public static void main(String[] args) {
		NetworkConnection utils = new NetworkConnection();
		try {
			utils.subscribeToInput(new NetworkSubscription() {
				@Override
				public void onEvent(String input) {
					System.out.println(input);
				}
			});
			utils.openConnection("167.114.36.140", 3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
