package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();	// 직접 생성자를 만들었으므로 기본생성자를 만들지 않는다.
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setYear(2010);
		song.setTrack(3);
		song.show();

		Song song2 = new Song("Love Dive", "Jamine Parker 3명외", "IVE", "Love Dive", 2022, 1);
		song2.show();
		
		Song song3 = new Song("사건의 지평선", "윤하");
		song3.show();
	}

}
