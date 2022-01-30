package Quick_Anime;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection {
	Connection con1;
	public void connect() throws ClassNotFoundException, SQLException {
		//step1 load the driver class  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		//step2 create  the connection object  
		Connection con=DriverManager.getConnection(  
		"jdbc:oracle:thin:@localhost:1521:xe","QuickAnime","QuickAnime");  
		  
		con1=con;
	}
		//step4 execute query  
}
