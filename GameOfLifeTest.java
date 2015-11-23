import org.junit.*;
import static org.junit.Assert.*;

public class GameOfLifeTest{
	private GameOfLife testGol;
	@Before
	public void setUp() {
		testGol = new GameOfLife();
	}
	
	//Test getNextState
	@Test
	public void testGetNextStateInput1or0ReturnsDead() {
		for (int i = 0; i < 2; i++) {
			State output = testGol.getNextState(State.LIVE, i);
			assertEquals(State.DEAD, output);
			output = testGol.getNextState(State.DEAD, i);
			assertEquals(State.DEAD, output);
		}
	}
	
	@Test
	public void testGetNextStateNeighboursBetween4And8ReturnsDead() {
		for (int i = 4; i < 9; i++) {
			State output = testGol.getNextState(State.LIVE, i);
			assertEquals(State.DEAD, output);
			output = testGol.getNextState(State.DEAD, i);
			assertEquals(State.DEAD, output);
		}
	}
	
	@Test
	public void testGetNextState2Neighbours() {
		//If LIVE and 2 neighbours, stay alive
		State output = testGol.getNextState(State.LIVE, 2);
		assertEquals(State.LIVE, output);
		//If DEAD and 2 neighbours, stay dead
		output = testGol.getNextState(State.DEAD, 2);
		assertEquals(State.DEAD, output);
	}
	
	@Test
	public void testGetNextState3Neighbours() {
		//If LIVE and have 3 neighbours stay alive
		State output = testGol.getNextState(State.LIVE, 3);
		assertEquals(State.LIVE, output);
		//If DEAD and 3 neighbours, become LIVE
		output = testGol.getNextState(State.DEAD, 3);
		assertEquals(State.LIVE, output);
	}
}

