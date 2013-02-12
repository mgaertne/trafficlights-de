package org.trafficlights.domain;

public enum LightState {
	ROT {
		public LightState next() { return ROT_GELB; }
	},
	ROT_GELB {
		public LightState next() { return null; }
	};
	
	public abstract LightState next();
}
