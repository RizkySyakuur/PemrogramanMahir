package PlaylistLagu;

class Playlist {
    private Song head; // Menunjuk ke lagu pertama dalam playlist

    // Konstruktor untuk menginisialisasi playlist
    public Playlist() {
        this.head = null; // Awalnya playlist kosong
    }

    // Metode untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong; // Jika playlist kosong, lagu pertama menjadi head
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next; // Mencari akhir playlist
            }
            current.next = newSong; // Menambahkan lagu baru di akhir
        }
    }

    // Metode untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        Song current = head;
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