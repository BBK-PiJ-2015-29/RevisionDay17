import org.junit.*;
import static org.junit.Assert.*;

public class GameOfLifeTest{
	@Before
	public void setUp() {
		GameOfLife testGol = new GameOfLife();
	}
	
	//Test getNextState
	@Test
	public void testGetNextStateInput1or0ReturnsDead() {
		State current = null;
		for (int i = 0; i < 2; i++) {
			State output = testGol.getNextState(current, i);
			assertEquals(State.DEAD, output);
		}
	}
}
