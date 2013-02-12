package org.trafficlights.domain;

public class CrossingValidator {

	public boolean isValidConfiguration(LightState firstState, LightState secondState) {
		return !LightState.UNBEKANNT.equals(firstState)
				&& LightState.ROT.equals(secondState);
	}
	
}