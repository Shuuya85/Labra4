package fi.metropolia.java7features;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ResourceManagementTest {

	private ResourceManagement resourceManagement;

	@Rule
	public ExpectedException ex = ExpectedException.none();

	@Before
	public void setup() {
		resourceManagement = new ResourceManagement();
	}

	@Test
	public void readString() throws IOException {
		assertEquals(resourceManagement.read(), "string");
	}

	@Test
	public void scannerIsClosed() throws IOException {
		resourceManagement.read();
		ex.expect(IllegalStateException.class);
		resourceManagement.getScanner().next();
	}

}
