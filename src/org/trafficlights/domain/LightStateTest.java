package org.trafficlights.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightStateTest {

	@Test
	public void testStateChange() {
		assertEquals(LightState.ROT_GELB, LightState.ROT.next());
	}

}
