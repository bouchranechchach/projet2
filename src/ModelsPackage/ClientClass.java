package ModelsPackage;

import java.io.Serializable;
//javaBean
public class ClientClass implements Serializable{
   
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int NumClient;
	String NomClient,PreClient,AdrClient,VilClient,TelClient, MailClient, PassClient;
	
	public ClientClass(String nc,String pc,String ac,String vc,String tc,String mc,String passc) {
		NomClient=nc;
		PreClient=pc;
		AdrClient=ac;
		VilClient=vc;
		TelClient=tc;
		MailClient=mc;
		PassClient=passc;
		
	};

	public String getPassClient() {
		return PassClient;
	}

	public void setPassCli(String passClient) {
		PassClient = passClient;
	}

	public ClientClass() {
	}

	public int getNumClient() {
		return NumClient;
	}

	public void setNumClient(int numClient) {
		NumClient = numClient;
	}

	public String getNomClient() {
		return NomClient;
	}

	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}

	public String getPreClient() {
		return PreClient;
	}

	public void setPreCli(String preClient) {
		PreClient = preClient;
	}

	public String getAdrCli() {
		return AdrClient;
	}

	public void setAdrCli(String adrClient) {
		AdrClient = adrClient;
	}

	public String getVilClient() {
		return VilClient;
	}

	public void setVilClient(String vilClient) {
		VilClient = vilClient;
	}

	public String getTelCli() {
		return TelClient;
	}

	public void setTelCli(String telClient) {
		TelClient = telClient;
	}

	public String getMailClient() {
		return MailClient;
	}

	public void setMailClient(String mailClient) {
		MailClient = mailClient;
	}

	
}
