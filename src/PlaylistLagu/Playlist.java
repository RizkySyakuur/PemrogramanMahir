package PlaylistLagu;

class Playlist {
    private Lagu head; // Menunjuk ke lagu pertama dalam playlist

    // Konstruktor untuk menginisialisasi playlist
    public Playlist() {
        this.head = null; // Awalnya playlist kosong
    }

    // Metode untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Lagu newLagu = new Lagu(title);
        if (head == null) {
            head = newLagu; // Jika playlist kosong, lagu pertama menjadi head
        } else {
            Lagu current = head;
            while (current.next != null) {
                current = current.next; // Mencari akhir playlist
            }
            current.next = newLagu; // Menambahkan lagu baru di akhir
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        Lagu current = head;
        if (current == null) {
            System.out.println("Playlist kosong.");
            return;
        }
        while (current != null) {
            System.out.print(current.title + " -> ");
            current = current.next; // Melanjutkan ke lagu berikutnya
        }
        System.out.println("null"); // Menandakan akhir dari playlist
    }
}