package DatabasePackage;
//insertion d'un client dans la base de données
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import ModelsPackage.ClientClass;

public class ClassMethod{

	
	public static int inserer(ClientClass c) {
		Connection connection=Sing.getConnection();
		 int result = 0;
		try{  

		       
			PreparedStatement request=connection.prepareStatement(  
			"INSERT INTO client (NomClient,PreClient,AdrClient,VilClient,TelClient,MailClient,PassClient) VALUES (?,?,?,?,?,?,?)"
					); 
		
			request.setString(1,c.getNomClient());
			request.setString(2,c.getPreClient());
			request.setString(3,c.getAdrCli());
			request.setString(4,c.getVilClient());
			request.setString(5,c.getTelCli());
			request.setString(6,c.getMailClient());
			request.setString(7,c.getPassClient());
		
			result=request.executeUpdate();
		
			
			PreparedStatement ps2=connection.prepareStatement
					("Select MAX(ID) as id from client");
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				c.setNumClient(rs.getInt("id"));
			}
			request.close();
			
		}catch (Exception e) {
e.printStackTrace();		}	
			return result;
		
	}		
	
	}