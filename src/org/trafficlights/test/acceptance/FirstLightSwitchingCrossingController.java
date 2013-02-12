package org.trafficlights.test.acceptance;

import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	public void setErsteAmpel(LightState state) {
	}
	
	public void setZweiteAmpel(LightState state) {
	}
	
	public LightState ersteAmpel() {
		return LightState.GELB;
	}
	
	public LightState zweiteAmpel() {
		return LightState.ROT;
	}
}
