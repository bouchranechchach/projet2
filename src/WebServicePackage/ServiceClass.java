package WebServicePackage;

import com.mysql.cj.x.protobuf.MysqlxConnection.Capabilities;

public class ServiceClass {
	
		public ServiceClass() {
			super();
		}
		
		
		//Calcul de l'Annuité

		public double calculAnnuite(double cap, int duree, double ti) {
			//ti : taux d'interet
			//tm : taux periodique mensuel
			//cap : capital(emprunt)
			
			double tauxmens = Math.pow(1 + ti, (double) 1 / 12) - 1;
			//calcul annuité
			double ann = Math.pow(1 + tauxmens, duree) * tauxmens * cap / (Math.pow(1 + tauxmens, duree) - 1);
			return ann;

		}
		

			//Calcul du Capital
		public double calculCapital(double ann, int duree, double ti) {

			double tauxmens = Math.pow(1 + ti, (double) 1 / 12) - 1;
			double c = (ann * (Math.pow(1 + tauxmens, duree) - 1)) / (Math.pow(1 + tauxmens, duree) * tauxmens);
			return c;

		}
		 
		//Calcul de la durée
		public int calculDuree(double cap, double ann, double ti) {

			double tauxmens = Math.pow(1 + ti, (double) 1 / 12) - 1;
			double duree = Math.log(ann / (ann - (tauxmens * cap))) / Math.log(1 + tauxmens);
			return (int) Math.round(duree);

		}

	}
