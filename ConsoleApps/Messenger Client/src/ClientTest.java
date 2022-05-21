import javax.swing.JFrame;

public class ClientTest
	{
		public static void main(String[] args)
			{
				Client bob;
				bob = new Client("127.0.0.1");	// local host and view as a server for testing purposes
				bob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				bob.startRunning();
			}
	}