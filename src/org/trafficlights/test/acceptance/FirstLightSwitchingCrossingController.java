package org.trafficlights.test.acceptance;

import org.trafficlights.domain.CrossingValidator;
import org.trafficlights.domain.LightState;

public class FirstLightSwitchingCrossingController {

	LightState firstState;

	LightState secondState;

	private CrossingValidator validator = new CrossingValidator();

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
		if (!validator.isValidConfiguration(firstState, secondState)) {
			warningConfiguration();
			return;
		}
		firstState = firstState.next();
	}

	private void warningConfiguration() {
		firstState = LightState.UNBEKANNT;
		secondState = LightState.UNBEKANNT;
	}
}
