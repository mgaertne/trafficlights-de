package org.trafficlights.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightStateEditorTest {

	private LightStateEditor editor = new LightStateEditor();
	
	@Test
	public void setRot() {
		editor.setAsText("Rot");
		assertEquals(LightState.ROT, editor.getValue());
	}

}
