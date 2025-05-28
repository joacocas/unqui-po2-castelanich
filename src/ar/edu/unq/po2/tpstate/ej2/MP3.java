package ar.edu.unq.po2.tpstate.ej2;

public class MP3 {
	
	private MP3State actualState;
	
	public MP3() {
		this.actualState = new SongSelectState(this);
	}
	
	public MP3State getActualState() {
		return this.actualState;
	}
	
	public void setMP3State(MP3State st) {
		this.actualState = st;
	}
	
	public void play() {
		this.actualState.play();
	}
	
	public void pause() {
		this.actualState.pause();
	}
	
	public void stop() {
		this.actualState.stop();
	}
}
