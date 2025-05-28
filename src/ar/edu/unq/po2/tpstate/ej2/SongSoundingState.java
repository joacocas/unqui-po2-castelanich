package ar.edu.unq.po2.tpstate.ej2;

public class SongSoundingState implements MP3State{
	
	private MP3 mp3;
	
	public SongSoundingState(MP3 mp3) {
		this.mp3 = mp3;
	}
	
	public MP3 getMP3() {
		return this.mp3;
	}

	@Override
	public void play() {
		System.out.println("Error: La cancion esta sonando");
	}

	@Override
	public void pause() {
		this.mp3.setMP3State(new PausedSongState(mp3));
		
	}

	@Override
	public void stop() {
		this.mp3.setMP3State(new SongSelectState(mp3));
	}
}
