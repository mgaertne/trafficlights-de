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
		if (!isValidLightStateConfiguration()) {
			warningConfiguration();
			return;
		}
		firstState = firstState.next();
	}

	private boolean isValidLightStateConfiguration() {
		return !LightState.UNBEKANNT.equals(firstState)
				&& LightState.ROT.equals(secondState);
	}

	private void warningConfiguration() {
		firstState = LightState.UNBEKANNT;
		secondState = LightState.UNBEKANNT;
	}

}
