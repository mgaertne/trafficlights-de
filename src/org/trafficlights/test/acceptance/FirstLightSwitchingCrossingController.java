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
		schalteErsteAmpel();
	}

	public void schalteErsteAmpel() {
		if (!isValidLightStateConfiguration(firstState, secondState)) {
			warningConfiguration();
			return;
		}
		firstState = firstState.next();
	}

	private boolean isValidLightStateConfiguration(LightState firstState, LightState secondState) {
		return !LightState.UNBEKANNT.equals(firstState)
				&& LightState.ROT.equals(secondState);
	}

	private void warningConfiguration() {
		firstState = LightState.UNBEKANNT;
		secondState = LightState.UNBEKANNT;
	}

}
