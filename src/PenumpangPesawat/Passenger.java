package PenumpangPesawat;

public class Passenger {
    String name;
    Passenger next;

    // Konstruktor untuk menginisialisasi nama penumpang
    public Passenger(String name) {
        this.name = name;
        this.next = null; // Awalnya tidak ada penumpang berikutnya
    }
}
