package ar.edu.unq.po2.tpstate.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class MP3TestCase {
	
	private MP3 mp3;
	
	@BeforeEach
	void setUp() {
		mp3 = new MP3();
	}

	@Test
    void testPlayDesdeSeleccionCambiaAReproduccion() {
        mp3.play();
        assertInstanceOf(SongSoundingState.class, mp3.getActualState());
    }

    @Test
    void testPauseDesdeReproduciendoCambiaAPausado() {
        mp3.setMP3State(new SongSoundingState(mp3));
        mp3.pause();
        assertInstanceOf(PausedSongState.class, mp3.getActualState());
    }

    @Test
    void testPauseDesdePausadoVuelveAReproduciendo() {
        mp3.setMP3State(new PausedSongState(mp3));
        mp3.pause();
        assertInstanceOf(SongSoundingState.class, mp3.getActualState());
    }

    @Test
    void testStopDesdeReproduciendoVuelveASeleccion() {
        mp3.setMP3State(new SongSoundingState(mp3));
        mp3.stop();
        assertInstanceOf(SongSelectState.class, mp3.getActualState());
    }

    @Test
    void testStopDesdePausadoVuelveASeleccion() {
        mp3.setMP3State(new PausedSongState(mp3));
        mp3.stop();
        assertInstanceOf(SongSelectState.class, mp3.getActualState());
    }

    @Test
    void testStopDesdeSeleccionNoHaceNada() {
        mp3.setMP3State(new SongSelectState(mp3));
        mp3.stop(); // no debería romper nada
        assertInstanceOf(SongSelectState.class, mp3.getActualState());
    }

}
