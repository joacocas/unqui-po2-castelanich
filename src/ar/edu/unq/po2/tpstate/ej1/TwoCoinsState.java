package ar.edu.unq.po2.tpstate.ej1;

public class TwoCoinsState implements MachineState {
	
	private GameMachine gameMach;
	
	public TwoCoinsState(GameMachine gm) {
		this.gameMach = gm;
	}
	
	@Override
	public void insertCoin() {
		System.out.println("The game already have two coins inserted");
	}

	@Override
	public void pressInit() {
		System.out.println("Iniciating two players game");
		this.gameMach.setState(new TwoPlayersState(gameMach));
	}

	@Override
	public void endGame() {
		System.out.println("The game doesn't even started");
	}

}
