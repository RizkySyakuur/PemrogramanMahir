package PenumpangPesawat;

public class Flight {
    private Passenger head; // Menunjuk ke penumpang pertama dalam daftar

    // Konstruktor untuk menginisialisasi daftar penumpang
    public Flight() {
        this.head = null; // Awalnya daftar penumpang kosong
    }

    // Metode untuk menambah penumpang di akhir daftar
    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger; // Jika daftar kosong, penumpang pertama menjadi head
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next; // Mencari akhir daftar
            }
            current.next = newPassenger; // Menambahkan penumpang baru di akhir
        }
    }

    // Metode untuk menghapus penumpang berdasarkan nama
    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }

        // Jika penumpang yang ingin dihapus adalah penumpang pertama
        if (head.name.equals(name)) {
            head = head.next; // Menghapus penumpang pertama
            return;
        }

        Passenger current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next; // Menghapus penumpang
                return;
            }
            current = current.next; // Melanjutkan ke penumpang berikutnya
        }

        System.out.println("Penumpang dengan nama " + name + " tidak ditemukan.");
    }

    // Metode untuk menampilkan semua penumpang dalam daftar
    public void displayPassengers() {
        Passenger current = head;
        if (current == null) {
            System.out.println("Daftar penumpang kosong.");
            return;
        }
        while (current != null) {
            System.out.print(current.name + " -> ");
            current = current.next; // Melanjutkan ke penumpang berikutnya
        }
        System.out.println("null"); // Menandakan akhir dari daftar
    }
}
