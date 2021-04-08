import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.condition.*;

@DisplayName("conditional tests")
public class ConditionalTests {

	@Test
	@EnabledOnOs({OS.WINDOWS})
	public void executeOnWindows() {
		System.out.println("this method executes on windows OS");
	}
}
