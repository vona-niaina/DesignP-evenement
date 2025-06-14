package dp.evenement.inscription.concreteStrategy;

import dp.evenement.creation.Evenement;
import dp.evenement.inscription.InscriptionStrategy;
import dp.evenement.inscription.Participant;

public class ValidationManuelle implements InscriptionStrategy{

	@Override
	public boolean verifierInscription(Participant p, Evenement e) {
		System.out.println("Validation manuelle requise pour "+ p.getNomParticipant());
		return false; //rejeté pour test ou attente de validation
	}

}
