package PlaylistLagu;

public class Song {
    String title;
    Song next;

    // Konstruktor untuk menginisialisasi judul lagu
    public Song(String title) {
        this.title = title;
        this.next = null; // Awalnya tidak ada lagu berikutnya
    }
}