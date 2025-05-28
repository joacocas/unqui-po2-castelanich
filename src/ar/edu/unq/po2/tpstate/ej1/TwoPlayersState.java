package ar.edu.unq.po2.tpstate.ej1;

public class TwoPlayersState implements MachineState{
	
	private GameMachine gameMach;
	
	public TwoPlayersState(GameMachine gm) {
		this.gameMach = gm;
	}
	@Override
	public void insertCoin() {
		System.out.println("The game already starts. You can't insert more coins");
	}

	@Override
	public void pressInit() {
		System.out.println("The game is running");
	}

	@Override
	public void endGame() {
		System.out.println("The end");
		this.gameMach.setState(new InitState(gameMach));
	}

}