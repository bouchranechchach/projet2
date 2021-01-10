package DatabasePackage;
//Classe singleton
import java.sql.Connection;
import java.sql.DriverManager;

public class Sing {
	private static Connection connection;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
		    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");  
			   
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
}
