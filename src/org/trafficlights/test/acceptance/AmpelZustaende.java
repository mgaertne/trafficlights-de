package org.trafficlights.test.acceptance;

public class AmpelZustaende {

	private String state;

	public void setVorherigerZustand(String state) {
		this.state = state;
	}
	
	public String naechsterZustand() {
		if ("Rot".equals(state)) return "Rot, Gelb";
		if ("Rot, Gelb".equals(state)) return "Grün";
		if ("Grün".equals(state)) return "Gelb";
		if ("Gelb".equals(state)) return "Rot";
		return "Gelb blinkend";
	}
}
