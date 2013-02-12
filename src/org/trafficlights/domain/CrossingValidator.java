package org.trafficlights.domain;

public class CrossingValidator {

	public boolean isValidConfiguration(LightState firstState,
			LightState secondState) {
		if (LightState.UNBEKANNT.equals(firstState)
				|| LightState.UNBEKANNT.equals(secondState))
			return false;
		if (LightState.ROT.equals(secondState)) return true;
		if (LightState.ROT.equals(firstState)) return true;
		return false;
	}
}