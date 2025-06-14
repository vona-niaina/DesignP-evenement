package dp.evenement.creation.concreteEvenement;

import dp.evenement.creation.Evenement;

public class Hackathon implements Evenement {

	@Override
	public String getType() {
		return "Hackathon";
	}

	@Override
	public int getNombrePlaces() {
		return 50;
	}

	@Override
	public String getSponsor() {
		return "Meta";
	}

	@Override
	public int getDuree() {
		return 48;
	}

}
