import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTestExample {

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before all test method called");
	}
	
	@BeforeEach
	public static void beforeEach() {
		System.out.println("Before each test method called");
	}
	
	@DisplayName("Add operation Test")
	@RepeatedTest(5)
	void addNumber(TestInfo testInfo, RepetitionInfo repetitionInfo) {
		System.out.println("Running aaddNumber test --->"+repetitionInfo.getCurrentRepetition());
		Assertions.assertEquals(2, Calculator.add(1,1),"1 + 1 should equal 2");
	}
}
