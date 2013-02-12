package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class AmpelZustaende {

	private LightState state;

	public void setVorherigerZustand(LightState state) {
		this.state = state;
	}
	
	public LightState naechsterZustand() {
		return state.next();
	}
}
