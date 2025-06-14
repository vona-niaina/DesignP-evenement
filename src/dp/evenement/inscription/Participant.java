package dp.evenement.inscription;

public class Participant {
	private String nomParticipant;
	private String statutParticipant;
	
	public Participant(String nomParticipant, String statutParticipant) {
		this.nomParticipant = nomParticipant;
		this.statutParticipant = statutParticipant;
	}

	public String getNomParticipant() {
		return nomParticipant;
	}

	public void setNomParticipant(String nomParticipant) {
		this.nomParticipant = nomParticipant;
	}

	public String getStatutParticipant() {
		return statutParticipant;
	}

	public void setStatutParticipant(String statutParticiapnt) {
		this.statutParticipant = statutParticiapnt;
	}
	
	
}
