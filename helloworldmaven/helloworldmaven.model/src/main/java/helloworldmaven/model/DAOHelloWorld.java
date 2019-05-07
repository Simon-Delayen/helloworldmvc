package helloworldmaven.model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class DAOHelloWorld {
	
	private static String FileName = "HelloWorld.txt";
	private static  DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	private DAOHelloWorld () {
		
	}
	
	public static DAOHelloWorld getInstance() {
		if (instance == null) {
			instance = new DAOHelloWorld();
		}
		return instance;
	}
	
	private static void setInstance (DAOHelloWorld instance ) {
		
	}
	
	private void readFile() {
		InputStream is = getClass().getClassLoader().getResourceAsStream(FileName);
		BufferedReader bf = new BufferedReader(new InputStreamReader(is));
		try {
			helloWorldMessage = bf.readLine();
			bf.close();
			is.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	public String getHelloWorldMessage() {
		readFile();
		return helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		
	}
}
