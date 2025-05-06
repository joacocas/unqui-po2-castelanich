package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	EquipoDeTrabajo equipo1;
	
	@BeforeEach
	void setUp() throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date fechaNacimiento1 = sdf.parse("30/10/2001");
		Date fechaNacimiento2 = sdf.parse("11/05/2002");
		Date fechaNacimiento3 = sdf.parse("29/05/1967");
		Date fechaNacimiento4 = sdf.parse("10/12/1998");
		Date fechaNacimiento5 = sdf.parse("14/03/1972");
		
		Persona p1 = new Persona("Joaquin", "Castelanich",fechaNacimiento1);
		Persona p2 = new Persona("Emilia", "Martinez",fechaNacimiento2);
		Persona p3 = new Persona("Andres", "Castelanich",fechaNacimiento3);
		Persona p4 = new Persona("Martina", "Castelanich",fechaNacimiento4);
		Persona p5 = new Persona("Gabriela", "Lombardo",fechaNacimiento5);
		
		Persona[] personas = {p1, p2, p3, p4, p5};
		equipo1 = new EquipoDeTrabajo("Equipo1", personas);
	}
	
	@Test
	void testPromedioDeEdadDeSusIntegrantes() {
		double promedioEsperado = 36.2;
		
		assertEquals(promedioEsperado, equipo1.promedioDeEdadDeIntegrantes());
	}

}
