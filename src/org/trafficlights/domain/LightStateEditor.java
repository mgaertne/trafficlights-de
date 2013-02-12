package org.trafficlights.domain;

import java.beans.PropertyEditorSupport;

public class LightStateEditor extends PropertyEditorSupport {

	public void setAsText(String state) {
		if ("Rot".equals(state)) {
			setValue(LightState.ROT);
			return;
		}
		if ("Rot, Gelb".equals(state)) {
			setValue(LightState.ROT_GELB);
			return;
		}
		setValue(LightState.GRUEN);
		
		for (LightState lightState: LightState.values()) {
			if (lightState.description.equals(state)) {
				setValue(lightState);
				return;
			}
				
		}
	}
}
