package org.trafficlights.domain;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.trafficlights.domain.LightState.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class LightStateTest {

	@Parameters
	public static List<Object[]> data() {
		return asList(new Object[][] {
				{ "Rot", ROT },
				{ "Rot, Gelb", ROT_GELB },
				{ "Grün", GRUEN },
				{ "Gelb", GELB },
				{ "Gelb blinkend", UNBEKANNT },
				{ "ungültiger Zustand", UNBEKANNT }
		});
	}

	private String stateName;
	private LightState state;
	
	public LightStateTest(String stateName, LightState state) {
		this.stateName = stateName;
		this.state = state;
	}
	
	@Test
	public void valueFor() {
		assertEquals(state, LightState.valueFor(stateName));
	}

}
