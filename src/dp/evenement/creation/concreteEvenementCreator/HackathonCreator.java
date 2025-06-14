package dp.evenement.creation.concreteEvenementCreator;

import dp.evenement.creation.Evenement;
import dp.evenement.creation.concreteEvenement.Hackathon;
import dp.evenement.creation.evenementCreator.EvenementCreator;

public class HackathonCreator extends EvenementCreator {

	@Override
	public Evenement creerEvenement() {
		return new Hackathon();
	}

}
