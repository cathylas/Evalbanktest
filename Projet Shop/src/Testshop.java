import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Testshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList <Articles> list;	
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/Shop";
		String user = "root"; 
		String passwd = "";
		
		
		class forName(driver);
		Connection connection = DriverManager.getConnection(url, user, passwd);
		System.out.println("connected");
		
		Statement statement = connection.createStatement();
		
		

	}

}
