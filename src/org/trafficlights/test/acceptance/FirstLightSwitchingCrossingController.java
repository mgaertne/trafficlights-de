package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	LightState firstState;

	public void setErsteAmpel(LightState state) {
		firstState = state;
	}
	
	public void setZweiteAmpel(LightState state) {
	}
	
	public LightState ersteAmpel() {
		return firstState.next();
	}
	
	public LightState zweiteAmpel() {
		return LightState.ROT;
	}
}
