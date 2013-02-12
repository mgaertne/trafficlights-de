package org.trafficlights.domain;

public enum LightState {
	ROT {
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
	
	public LightState next() {
		return UNBEKANNT;
	}
}
