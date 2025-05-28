package ar.edu.unq.po2.tpstate.ej1;

public class GameMachine {
	
	private MachineState actualState;
	
	public GameMachine() {
		this.actualState = new InitState(this);
	}
	
	public MachineState getActualState() {
		return this.actualState;
	}
	
	public void setState(MachineState state) {
		this.actualState = state;
	}
	
	public void insertCoin() {
		this.actualState.insertCoin();
	}
	
	public void pressInit() {
		this.actualState.pressInit();
	}
	
	public void endGame() {
		this.actualState.endGame();
	}
}
