package dp.evenement.inscription.concreteStrategy;

import dp.evenement.creation.Evenement;
import dp.evenement.inscription.InscriptionStrategy;
import dp.evenement.inscription.Participant;

public class StatutProfesseurUniquement implements InscriptionStrategy {

	@Override
	public boolean verifierInscription(Participant p, Evenement e) {
		return p.getStatutParticipant().equals("Professeur");
	}

}
