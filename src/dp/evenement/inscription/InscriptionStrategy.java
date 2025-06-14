package dp.evenement.inscription;

import dp.evenement.creation.Evenement;

public interface InscriptionStrategy {
	boolean verifierInscription(Participant participant, Evenement evenement);
}
