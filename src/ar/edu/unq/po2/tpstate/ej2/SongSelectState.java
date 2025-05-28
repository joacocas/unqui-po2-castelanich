package ar.edu.unq.po2.tpstate.ej2;

public class SongSelectState implements MP3State {
	
	private MP3 mp3;
	
	public SongSelectState(MP3 mp3) {
		this.mp3 = mp3;
	}
	
	public MP3 getMP3() {
		return this.mp3;
	}

	@Override
	public void play() {
		this.mp3.setMP3State(new SongSoundingState(mp3));
	}

	@Override
	public void pause() {
		System.out.println("Error: No ha seleccionado una cancion para pausar");
	}

	@Override
	public void stop() {
	}
}
