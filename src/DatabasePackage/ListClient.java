package DatabasePackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ModelsPackage.CreditClass;

public class ListClient {
	
	public static List<CreditClass> getlist(int NumClient) {  
	
		List<CreditClass> list = new ArrayList<CreditClass>();
		
		Connection connection=Sing.getConnection();
      try {
			    
				PreparedStatement ps=connection.prepareStatement(  
				"select * from credit where NumClient=?");  
				
				ps.setInt(1,NumClient);  
				
			      
				ResultSet rs=ps.executeQuery();  
		     	int i=1;
					
				while (rs.next()) {
				    CreditClass credit = new CreditClass();
				    
					credit.setNumCredit(rs.getInt(1));
					credit.setNumClient(rs.getInt(2));
					credit.setMonCredit(rs.getDouble(3));
					credit.setDureeCredit(rs.getDouble(4));
					credit.setTauxCredit(rs.getDouble(5));
					credit.setAnnuiteCredit(rs.getDouble(6));
					credit.setDatPre(rs.getDate(7));
					
					list.add(credit);
					i++;
				} 
				
      }catch(Exception e){System.out.println(e);}  
		          
             return list;  
		}
public static void main(String args[])
	{
		ListClient test = new ListClient();
		List<CreditClass> list = ListClient.getlist(2);
		for(CreditClass c: list)
		System.out.println("credit:"+c);
	}

	

}
