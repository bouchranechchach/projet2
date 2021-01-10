package DatabasePackage;

//s connecter à votre compte si vous etes deja inscrit!
import java.sql.*;

import ModelsPackage.ClientClass; 

public class LoginDB 
{  
	
	
	public static ClientClass  validate(String name,String pass){  
	 
	
		ClientClass client = null;
	try{  

		    Class.forName("com.mysql.cj.jdbc.Driver");  
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");  
			      
			PreparedStatement ps=con.prepareStatement(  
			"select * from client where NomClient=? and PassClient=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			
		      
			ResultSet rs=ps.executeQuery();  
			
			while (rs.next()) {
				client = new ClientClass();
				client.setNumClient(rs.getInt(1));
				client.setNomClient(rs.getString(2));
				
				
					}  
	          
	}catch(Exception e){System.out.println(e);}  
	
	return client;  
	}  
	
}  
