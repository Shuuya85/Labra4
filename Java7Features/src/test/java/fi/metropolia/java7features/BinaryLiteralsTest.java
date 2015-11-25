package fi.metropolia.java7features;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BinaryLiteralsTest {

	private BinaryLiterals literals;

	@Before
	public void setup() {
		literals = new BinaryLiterals();
	}

	@Test
	public void binaryEight() {
		assertEquals(literals.getBinaryEight(), 8);
	}

	@Test
	public void binaryHundred() {
		assertEquals(literals.getBinaryHundred(), 100);
	}
        public void tyhja() {
        }

}
