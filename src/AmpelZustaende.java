
public class AmpelZustaende {

	private String state;

	public void setVorherigerZustand(String state) {
		this.state = state;
	}
	
	public String naechsterZustand() {
		if ("Rot".equals(state)) return "Rot, Gelb";
		return "Grün";
	}
}
