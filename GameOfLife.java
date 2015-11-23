public class GameOfLife {
	public State getNextState(State current, int neighbourCount) {
		if (neighbourCount == 3) {
			return State.LIVE;
		}
		if (neighbourCount == 2) {
			return current;
		} 
		return State.DEAD;
	}
}