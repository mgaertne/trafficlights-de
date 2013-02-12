package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	LightState firstState;
	
	LightState secondState;

	public void setErsteAmpel(LightState state) {
		firstState = state;
	}
	
	public void setZweiteAmpel(LightState state) {
		secondState = state;
	}
	
	public LightState ersteAmpel() {
		return firstState;
	}
	
	public LightState zweiteAmpel() {
		return secondState;
	}
	
	public void execute() {
		if (!LightState.ROT.equals(secondState)) {
			firstState = LightState.UNBEKANNT;
			secondState = LightState.UNBEKANNT;
			return;
		}
		firstState = firstState.next();
	}
}
