package org.trafficlights.domain;

import static java.util.Arrays.*;
import static org.junit.Assert.*;
import static org.trafficlights.domain.LightState.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CrossingValidatorTest {

	@Parameters
	public static List<Object[]> values() {
		return asList(new Object[][] { 
				{ ROT, ROT, true },
				{ GRUEN, ROT, true }, 
				{ GELB, ROT, true },
				{ ROT_GELB, ROT, true }, 
				{ UNBEKANNT, ROT, false },
				{ GRUEN, GRUEN, false }, 
				{ GELB, GRUEN, false },
				{ ROT_GELB, GRUEN, false }, 
				{ ROT, GRUEN, true },
				{ UNBEKANNT, GRUEN, false },
				{ GRUEN, ROT_GELB, false },
				{ GELB, ROT_GELB, false },
				{ ROT, ROT_GELB, true },
				{ ROT_GELB, ROT_GELB, false },
				{ UNBEKANNT, ROT_GELB, false },
				{ GRUEN, GELB, false },
				{ GELB, GELB, false },
				{ ROT, GELB, true },
				{ ROT_GELB, GELB, false },
				{ UNBEKANNT, GELB, false },
				{ GRUEN, UNBEKANNT, false },
				{ GELB, UNBEKANNT, false },
				{ ROT, UNBEKANNT, false },
				{ ROT_GELB, UNBEKANNT, false },
				{ UNBEKANNT, UNBEKANNT, false }
			});
	}

	private LightState firstState;
	private LightState secondState;
	private boolean valid;

	public CrossingValidatorTest(LightState firstState, LightState secondState,
			boolean valid) {
		this.firstState = firstState;
		this.secondState = secondState;
		this.valid = valid;
	}

	@Test
	public void isValidConfiguration() {
		assertEquals(valid, new CrossingValidator().isValidConfiguration(
				firstState, secondState));
	}

}
