package PlaylistLagu;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addSong("Lagu 1");
        playlist.addSong("Lagu 2");
        playlist.addSong("Lagu 3");

        playlist.displayPlaylist(); // Menampilkan semua lagu
    }
}
