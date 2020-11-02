//Made By Muhammad Waqas
//3476-FBAS/BSSE/F17
//Section A
////////////////////////////////////////////



import java.io.*;
import assignment.views.*;

public class Client {
	
	
	public static void main(String[] args)throws IOException, ClassNotFoundException, InterruptedException {
		
		
		  WelcomeFrame welcome=new WelcomeFrame(); 
		  MainMenu menu=new MainMenu();
		  
		  welcome.setVisible(true);
		  Thread.sleep(4000);
		  welcome.setVisible(false);
		  
		  menu.setVisible(true);
		  
		  
		  
	}
}
