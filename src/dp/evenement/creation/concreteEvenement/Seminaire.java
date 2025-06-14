package dp.evenement.creation.concreteEvenement;

import dp.evenement.creation.Evenement;

public class Seminaire implements Evenement {

	@Override
	public String getType() {
		return "Seminaire";
	}

	@Override
	public int getNombrePlaces() {
		return 80;
	}

	@Override
	public String getSponsor() {
		return "Université";
	}

	@Override
	public int getDuree() {
		return 4;
	}

}
