package tp_socket;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;


public class server {

	public static void main(String[] args) {
		try {//le try et le catch pour si le port est déja utilisé 
			ServerSocket ss= new ServerSocket(1025); //creation de lobjet et le numéro de port 
			System.out.println("Wait for connexion");
			Socket s= ss.accept();
			InputStream is= s.getInputStream(); //le is est un objet 
			OutputStream os = s.getOutputStream();
			
			System.out.println(" I wait for a number");
			int nb = is.read();
			int res= nb*3;
			System.out.println("I send the result");
			os.write(res);
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
