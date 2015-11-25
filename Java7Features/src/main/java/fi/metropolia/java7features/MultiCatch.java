package fi.metropolia.java7features;

import java.io.IOException;
import java.sql.SQLException;

public class MultiCatch {

	private boolean throwSqlException;

	public MultiCatch(boolean throwSqlException) {
		this.throwSqlException = throwSqlException;
	}

	public void catcher() throws IOException, SQLException {
		try {
			if (throwSqlException)
				throw new SQLException();
			else
				throw new IOException();
		} catch (IOException | SQLException ex) {
			throw ex;
		}//päätin varmuuden vuoksi vain kommentoida koodia
	}
	System.out.println("Lisätty turhaa printtiä koska miksi ei!?");
	System.out.println("Lisätään jotain turhaa");
}
