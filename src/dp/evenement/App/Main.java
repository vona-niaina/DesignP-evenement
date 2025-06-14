package dp.evenement.App;

import dp.evenement.creation.Evenement;
import dp.evenement.creation.concreteEvenementCreator.ConferenceCreator;
import dp.evenement.creation.concreteEvenementCreator.HackathonCreator;
import dp.evenement.creation.concreteEvenementCreator.SeminaireCreator;
import dp.evenement.creation.evenementCreator.EvenementCreator;
import dp.evenement.inscription.Participant;
import dp.evenement.inscription.concreteStrategy.InscriptionLibre;
import dp.evenement.inscription.concreteStrategy.StatutProfesseurUniquement;
import dp.evenement.inscription.concreteStrategy.ValidationManuelle;
import dp.evenement.inscription.context.GestionnaireInscription;

public class Main {
	
	public static void afficherDetailsEvenement(EvenementCreator creator) {
		Evenement e = creator.creerEvenement();
		System.out.println("Type 	    : " + e.getType());
		System.out.println("Places      : " + e.getNombrePlaces());
		System.out.println("Sponsor     : " + e.getSponsor());
		System.out.println("Durée (h)   : " + e.getDuree());
		System.out.println("--------------------------------------------");
	}

	//main
	public static void main(String[] args) {
		EvenementCreator[] creators = {
				new ConferenceCreator(),
				new HackathonCreator(),
				new SeminaireCreator()
		};
		
		for(EvenementCreator creator : creators) {
			afficherDetailsEvenement(creator);
		}

		
		//test inscription
		System.out.println("======Test sur inscription======");
		Participant etu = new Participant("Alice", "Etudiant");
		Participant prof = new Participant("Dr. Bob", "Professeur");
		
		GestionnaireInscription gestionnaireI = new GestionnaireInscription();
		
		for(EvenementCreator creator : creators) {
			Evenement evenement = creator.creerEvenement();
			
			if(creator instanceof HackathonCreator) {
				gestionnaireI.setStrategy(new ValidationManuelle());
			}else if(creator instanceof SeminaireCreator) {
				gestionnaireI.setStrategy(new StatutProfesseurUniquement());
			}else {
				gestionnaireI.setStrategy(new InscriptionLibre());
			}
			
			  // Test avec un étudiant
		    boolean resultatEtu = gestionnaireI.inscrire(etu, evenement);
		    System.out.println(etu.getNomParticipant() + " -> " + evenement.getType() + " : " + (resultatEtu ? "Inscription OK" : "Refusée"));
		    
		    // Test avec un professeur
		    boolean resultatProf = gestionnaireI.inscrire(prof, evenement);
		    System.out.println(prof.getNomParticipant() + " -> " + evenement.getType() + " : " + (resultatProf ? "Inscription OK" : "Refusée"));

		    System.out.println("--------------------------------------------");
			
		}
		
	}

}
