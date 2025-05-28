package ar.edu.unq.po2.tpstate.ej1;

public class OneCoinState implements MachineState{
	
	private GameMachine gameMach;
	
	public OneCoinState(GameMachine gm) {
		this.gameMach = gm;
	}
	
	@Override
	public void insertCoin() {
		System.out.println("Two Coins inserted");
		this.gameMach.setState(new TwoCoinsState(gameMach));
	}

	@Override
	public void pressInit() {
		System.out.println("One player game init");
		this.gameMach.setState(new OnePlayerState(gameMach));
	}

	@Override
	public void endGame() {
		System.out.println("The game doesn't even started");
	}	
}