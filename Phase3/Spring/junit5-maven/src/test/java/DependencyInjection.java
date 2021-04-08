import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("dependency injection")
public class DependencyInjection {

	public DependencyInjection(TestInfo testInfo) {
		assertEquals("dependency Injection", testInfo.getDisplayName());
	}
	
	@Test
	@DisplayName("Test 1")
	@Tag("my-tag")
	void test1(TestInfo testInfo) {
		//assertEquals("TEST 1", testInfo.getDisplayName());
		assertTrue(testInfo.getTags().contains("my-tag"));
	}
}
