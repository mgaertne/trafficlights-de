package org.trafficlights.domain;

public enum LightState {
	ROT("Rot") {
		public LightState next() { return ROT_GELB; }
	},
	ROT_GELB("Rot, Gelb") {
		public LightState next() { return GRUEN; }
	},
	GRUEN("Grün") {
		public LightState next() { return GELB; }
	},
	GELB("Gelb") {
		public LightState next() { return ROT; }
	},
	UNBEKANNT("Gelb blinkend");
	
	public static LightState valueFor(String stateName) {
		for (LightState state: values()) {
			if (state.description.equals(stateName)) return state;
		}
		return UNBEKANNT;
	}
	
	String description;
	
	private LightState(String description) {
		this.description = description;
	}
	
	public LightState next() {
		return UNBEKANNT;
	}
}
