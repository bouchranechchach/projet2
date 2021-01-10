package ModelsPackage;

import java.io.Serializable;

public class CreditClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int NumCredit;
	private int NumClient;
	private double MonCredit;
	private double DureeCredit;
	private double TauxCredit;
	private double AnnuiteCredit;
	private java.util.Date DatPre;

	public CreditClass() {
		super();
	}

	public int getNumCredit() {
		return NumCredit;
	}

	public void setNumCredit(int numCred) {
		NumCredit = numCred;
	}

	public int getNumClient() {
		return NumClient;
	}

	public java.util.Date getDatPre() {
		return DatPre;
	}

	public void setDatPre(java.util.Date date) {
		DatPre = date;
	}

	public void setNumClient(int numCli) {
		NumClient = numCli;
	}

	public double getMonCredit() {
		return MonCredit;
	}

	public void setMonCredit(double monCre) {
		MonCredit = monCre;
	}

	public double getDureeCredit() {
		return DureeCredit;
	}

	public void setDureeCredit(double duree) {
		this.DureeCredit = duree;
	}

	public double getTauxCredit() {
		return TauxCredit;
	}

	public void setTauxCredit(double tauxCre) {
		this.TauxCredit = tauxCre;
	}

	public double getAnnuiteCredit() {
		return AnnuiteCredit;
	}

	public void setAnnuiteCredit(double annCredit) {
		AnnuiteCredit = annCredit;
	}

	@Override
	public String toString() {
		return "CreditModel [Numero de Credit : " + NumCredit + ", Numero du Client:" + NumClient + ", Montant du Credit :" + MonCredit + ", dureedu Credit:"
				+ DureeCredit + ", taux de Credit : " + TauxCredit + ", Annuite du Credit=" + AnnuiteCredit + ", DatPre=" + DatPre + "]";
	}

}
