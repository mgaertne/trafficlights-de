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
				{ ROT, ROT_GELB },
				{ ROT_GELB, GRUEN },
				{ GRUEN, GELB },
				{ GELB, ROT },
				{ UNBEKANNT, UNBEKANNT }
		});
	}

	private LightState previousState;
	private LightState nextState;
	
	public LightStateTest(LightState previousState, LightState nextState) {
		this.previousState = previousState;
		this.nextState = nextState;
	}
	
	@Test
	public void testStateChange() {
		assertEquals(nextState, previousState.next());
	}

}
