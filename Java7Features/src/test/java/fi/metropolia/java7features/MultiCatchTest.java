package fi.metropolia.java7features;

import java.io.IOException;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

public class MultiCatchTest {

	private MultiCatch sqlCatch;
	private MultiCatch ioCatch;

	@Before
	public void setup() {
		sqlCatch = new MultiCatch(true);
		ioCatch = new MultiCatch(false);
	}

	@Test(expected = SQLException.class)
	public void catchSql() throws IOException, SQLException {
		sqlCatch.catcher();
	}

	@Test(expected = IOException.class)
	public void catchIo() throws IOException, SQLException {
		ioCatch.catcher();
	}

}
