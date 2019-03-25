import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; 

public class TestBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Connection cn = Connect();
        
		try {
		Connection connection = Connect();;	
		System.out.println("connected");

		Statement statement = connection.createStatement();
		//String str = "create database Bank;";
		
		//String str = "INSERT INTO T_Users( IdUser , Login , Password ) VALUES ( 6  , 'Pirog' , 'Cathy' );"; 
          //String sci = " UPDATE T_Users SET Password = 'Cat' WHERE IdUser = 6 ;";
		//String sti =  "DELETE FROM T_Users where IdUser = 6 ;";
		String cso = "SELECT * FROM T_Users;";
    
		statement.execute(cso);
		
		}		  
		catch (Exception e) {
			e.printStackTrace ();			
			System.out.println("non connecte");
		}
	
}

	private static Connection Connect() {
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3306/Shop";
		String user = "root"; 
		String passwd = "";
		Connection conn = null;
		
		try {
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("Driver O.K");
		
		conn = DriverManager.getConnection(url, user, passwd);
		System.out.println("connected");
		}
		catch(Exception e) {
			
		}
		return conn;
	}
}


