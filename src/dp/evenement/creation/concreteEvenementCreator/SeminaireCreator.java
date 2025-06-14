package dp.evenement.creation.concreteEvenementCreator;

import dp.evenement.creation.Evenement;
import dp.evenement.creation.concreteEvenement.Seminaire;
import dp.evenement.creation.evenementCreator.EvenementCreator;

public class SeminaireCreator extends EvenementCreator {

	@Override
	public Evenement creerEvenement() {
		return new Seminaire();
	}

}
