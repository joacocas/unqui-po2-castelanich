package ar.edu.unq.po2.tpstate.ej1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameMachineTestCase {
	
	private GameMachine gm;
	@SuppressWarnings("unused")
	private InitState is;
	@SuppressWarnings("unused")
	private OneCoinState oct;
	@SuppressWarnings("unused")
	private TwoCoinsState tct;
	@SuppressWarnings("unused")
	private OnePlayerState ops;
	@SuppressWarnings("unused")
	private TwoPlayersState tps;
	
	@BeforeEach
	void setUp() {
		
		gm = new GameMachine();
		is = new InitState(gm);
		oct = new OneCoinState(gm);
		tct = new TwoCoinsState(gm);
		ops = new OnePlayerState(gm);
		tps = new TwoPlayersState(gm);
	}
	
	@Test
	void OnePlayerTest() {
		gm.insertCoin();
		gm.pressInit();
		assertTrue(gm.getActualState() instanceof OnePlayerState);
	}
	
	@Test
	void TwoPlayerTest() {
		gm.insertCoin();
		gm.insertCoin();
		gm.pressInit();
		assertTrue(gm.getActualState() instanceof TwoPlayersState);
	}
	
	@Test
	void InitStateTest() {
		assertTrue(gm.getActualState() instanceof InitState);
	}
	
	@Test
	void OneCoinTest() {
		gm.insertCoin();
		assertTrue(gm.getActualState() instanceof OneCoinState);
	}
	
	@Test
	void TwoCoinsTest() {
		gm.insertCoin();
		gm.insertCoin();
		assertTrue(gm.getActualState() instanceof TwoCoinsState);
	}
}
