package PenumpangPesawat;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();

        // Menambahkan penumpang
        flight.addPassenger("Adjie");
        flight.addPassenger("Syakuur");
        flight.addPassenger("Nasaa");

        // Menampilkan semua penumpang
        System.out.println("Daftar Penumpang:");
        flight.displayPassengers();

        // Menghapus penumpang
        flight.removePassenger("Nasaa");

        // Menampilkan semua penumpang setelah penghapusan
        System.out.println("Daftar Penumpang setelah penghapusan:");
        flight.displayPassengers();

        // Mencoba menghapus penumpang yang tidak ada
        flight.removePassenger("Samuel"); // Output: Penumpang dengan nama Samuel tidak ditemukan.
    }
}