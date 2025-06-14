package dp.evenement.creation.concreteEvenement;

import dp.evenement.creation.Evenement;

public class Conference implements Evenement {

	@Override
	public String getType() { 
		return "Conference";
	}

	@Override
	public int getNombrePlaces() {
		return 150;
	}

	@Override
	public String getSponsor() {
		return "Google";
	}

	@Override
	public int getDuree() {
		return 3;
	}
	
}
