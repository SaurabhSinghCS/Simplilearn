import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("junit 5 assertions example")
public class AssertionsDemo {

	@Test
	public void assertTest() {
		//assertTrue(4 > 0);
		//assertFalse(5 < 1);
		
		String s1 = null;
		//assertNull(s1);
		
		String s2 = "simplilearn";
		//assertNotNull(s2);
		
		//assertNotSame(s1, s2);
		
		
	}
}
