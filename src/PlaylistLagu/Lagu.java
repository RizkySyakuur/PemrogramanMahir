package PlaylistLagu;

public class Lagu {
    String title;
    Lagu next;

    // Konstruktor untuk menginisialisasi judul lagu
    public Lagu (String title) {
        this.title = title;
        this.next = null; // Awalnya tidak ada lagu berikutnya
    }
}