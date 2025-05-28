package ar.edu.unq.po2.tpstate.ej1;

public class InitState implements MachineState{
	
	private GameMachine gameMach;
	
	public InitState(GameMachine gm) {
		this.gameMach = gm;
	}
	
	@Override
	public void insertCoin() {
		System.out.println("Coin inserted");
		this.gameMach.setState(new OneCoinState(this.gameMach));
	}

	@Override
	public void pressInit() {
		System.out.println("Insert coin");
	}

	@Override
	public void endGame() {
		System.out.println("The game didn't start");
	}
}