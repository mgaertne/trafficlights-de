package org.trafficlights.domain;

public enum LightState {
	ROT("Rot") {
		public LightState next() { return ROT_GELB; }
	},
	ROT_GELB {
		public LightState next() { return GRUEN; }
	},
	GRUEN {
		public LightState next() { return GELB; }
	},
	GELB {
		public LightState next() { return ROT; }
	},
	UNBEKANNT;
	
	String description;
	
	private LightState() {
		this("");
	}
	
	private LightState(String description) {
		this.description = description;
	}
	public LightState next() {
		return UNBEKANNT;
	}
}
