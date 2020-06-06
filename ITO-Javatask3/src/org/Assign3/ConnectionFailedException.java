package org.Assign3;

public class ConnectionFailedException extends Exception {
	public ConnectionFailedException() {
		System.err.println("Not connected to Database");
	}
}
