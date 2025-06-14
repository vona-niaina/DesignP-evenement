package dp.evenement.inscription.context;

import dp.evenement.creation.Evenement;
import dp.evenement.inscription.InscriptionStrategy;
import dp.evenement.inscription.Participant;

public class GestionnaireInscription {
	private InscriptionStrategy strategy;
	
	public void setStrategy(InscriptionStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean inscrire(Participant p, Evenement e) {
		return strategy.verifierInscription(p, e);
	}
}
