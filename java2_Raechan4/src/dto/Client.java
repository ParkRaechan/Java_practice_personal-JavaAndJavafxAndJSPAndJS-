package dto;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import controller.Server;

public class Client {
	
	public Socket socket;
	
	public Client (Socket select) {
		this.socket = socket;
		
	}
	
	public void recieve() {
		
		Runnable runable = new Runnable() {
			@Override
			public void run() {
				//메세지 계속 받기
				
				try {
					while(true) {
						InputStream inputStream = socket.getInputStream();
						byte[] bytes = new byte[1000];
						inputStream.read(bytes);
						String msg = new String(bytes);
						
						for(Client client : Server.clientlist) {
							client.send(msg);
						}
					}
				}catch (IOException e) {}
			}
		};
		Server.threadpool.submit(runable);
	}
	public void send(String msg) {
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {

				try {
					OutputStream outputStream = socket.getOutputStream(); 
					outputStream.write( msg.getBytes() ); 					
				}catch( Exception e ) {}
			}
		};
		Server.threadpool.submit(runnable);
		
	}
}
