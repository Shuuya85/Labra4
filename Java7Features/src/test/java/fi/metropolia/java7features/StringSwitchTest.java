package fi.metropolia.java7features;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringSwitchTest {

	private StringSwitch switchThursday;
	private StringSwitch switchDefault;

	@Before
	public void setup() {
		switchThursday = new StringSwitch("thursday");
		switchDefault = new StringSwitch("default");
	}

	@Test
	public void thursdaySwitch() {
		assertEquals(switchThursday.getDayNumber(), 3);
	}

	@Test
	public void defaultSwitch() {
		assertEquals(switchDefault.getDayNumber(), 0);
	}

}
