package dp.evenement.creation.concreteEvenementCreator;

import dp.evenement.creation.Evenement;
import dp.evenement.creation.concreteEvenement.Conference;
import dp.evenement.creation.evenementCreator.EvenementCreator;

public class ConferenceCreator extends EvenementCreator {

	@Override
	public Evenement creerEvenement() {
		return new Conference();
	}
	
}
