package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		// some code 1
		// some code 2
		// some code 3
	}

	public Song(String title, String artist) {
		// this.title = title;
		// this.artist = artist;

		this(title, artist, "", "", 0, 0); // 코드 중복을 막을 수 있다.
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(); // 만약 some code 1~3을 쓸 일이 있다면 이렇게 코드 중복을 최소화하자.

		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
				artist + " " + title + " (" + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡)");
	}
}
