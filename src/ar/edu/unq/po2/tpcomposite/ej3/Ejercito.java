package ar.edu.unq.po2.tpcomposite.ej3;

import java.util.List;
import java.util.ArrayList;

public class Ejercito implements ICharacter {
	
	private List<ICharacter> characters = new ArrayList<>();
	private Punto posicion;
	
	public Ejercito(List<ICharacter> chars, Punto pos) {
		this.characters = chars;
		this.posicion = pos;
	}
	
	public List<ICharacter> getCharacters() {
		return this.characters;
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	@Override
	public void caminar(Punto destino) {
		for(ICharacter charac : characters ) {
			charac.caminar(destino);
		}
	}
}