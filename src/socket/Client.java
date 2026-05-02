package tp_socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		
		try {
			Socket s=new Socket("localhost", 1025);
			InputStream is=s.getInputStream();
			OutputStream os=s.getOutputStream();
			
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Hi Abdeslem , Give me a number please:");
			int nb=keyboard.nextInt(); //le cursur de l'attente 
			os.write(nb);
			int res = is.read();
			System.out.println("the result is="+res);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
