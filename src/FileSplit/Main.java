package FileSplit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileSplitter fileSplitter = new FileSplitter();

        // Meminta pengguna untuk memasukkan path file dan ukuran bagian
        System.out.print("Masukkan path file: ");
        String filePath = scanner.nextLine();
        System.out.print("Masukkan ukuran bagian (dalam karakter): ");
        int partSize = scanner.nextInt();

        // Memotong file
        fileSplitter.splitFile(filePath, partSize);

        // Menampilkan bagian-bagian yang telah dipotong
        fileSplitter.displayParts();

        scanner.close();
    }
}