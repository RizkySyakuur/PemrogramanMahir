package FileSplit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

class FileSplitter {
    private Queue<String> parts; // Queue untuk menyimpan bagian-bagian file

    // Konstruktor untuk menginisialisasi Queue
    public FileSplitter() {
        parts = new LinkedList<>();
    }

    // Metode untuk membaca file dan memotongnya menjadi bagian-bagian
    public void splitFile(String filePath, int partSize) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder currentPart = new StringBuilder();
            String line;
            int currentSize = 0;

            while ((line = br.readLine()) != null) {
                // Tambahkan baris ke bagian saat ini
                currentPart.append(line).append("\n");
                currentSize += line.length() + 1; // +1 untuk newline

                // Jika ukuran bagian saat ini mencapai batas, simpan ke Queue
                if (currentSize >= partSize) {
                    parts.add(currentPart.toString());
                    currentPart.setLength(0); // Reset untuk bagian berikutnya
                    currentSize = 0; // Reset ukuran
                }
            }

            // Jika ada sisa bagian yang belum disimpan, tambahkan ke Queue
            if (currentPart.length() > 0) {
                parts.add(currentPart.toString());
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    // Metode untuk menampilkan bagian-bagian yang telah dipotong
    public void displayParts() {
        if (parts.isEmpty()) {
            System.out.println("Tidak ada bagian yang tersedia.");
            return;
        }

        System.out.println("Bagian-bagian file:");
        while (!parts.isEmpty()) {
            System.out.println(parts.poll()); // Mengambil dan menampilkan bagian dari Queue
        }
    }
}
