package demo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.persistence.PersistenceException;

import static org.hamcrest.MatcherAssert.assertThat;

//TODO: Tests 
class LogsCheckTest { 
	private static final String FILE = "../LogsCheck/src/main/resources/logfile.txt";
	
	@Test
	void test_checkInput_correct() {
		assertThat(LogsCheck.checkFile(FILE),is(true));
	}
	
	@Test
	void test_checkInput_not_correct() {
		assertThat(LogsCheck.checkFile("../notAfile.txt"),is(false));
	}
	
	@Disabled
	@Test 
	void test_readEvents() {
		 LogsCheck.readEvents(FILE);
	}
	

}
