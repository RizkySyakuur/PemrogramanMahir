package TextEditor;

import java.util.Stack;

class TextEditor {
    private StringBuilder text; // Menyimpan teks yang ditulis
    private Stack<String> undoStack; // Stack untuk menyimpan teks untuk undo
    private Stack<String> redoStack; // Stack untuk menyimpan teks untuk redo

    // Konstruktor untuk menginisialisasi text editor
    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Metode untuk menampilkan semua teks
    public void show() {
        System.out.println("Teks saat ini: " + text.toString());
    }

    // Metode untuk menulis teks
    public void write(String newText) {
        // Simpan teks saat ini ke dalam undo stack sebelum menulis
        undoStack.push(text.toString());
        // Kosongkan redo stack karena kita telah melakukan perubahan
        redoStack.clear();
        // Tambahkan teks baru
        text.append(newText);
        System.out.println("Menulis: " + newText);
    }

    // Metode untuk mengembalikan isi teks ke isi sebelumnya
    public void undo() {
        if (!undoStack.isEmpty()) {
            // Simpan teks saat ini ke dalam redo stack
            redoStack.push(text.toString());
            // Kembalikan teks ke isi sebelumnya
            text = new StringBuilder(undoStack.pop());
            System.out.println("Undo dilakukan.");
        } else {
            System.out.println("Tidak ada aksi yang dapat di-undo.");
        }
    }

    // Metode untuk memulihkan pengembalian isi teks ke isi yang lebih baru
    public void redo() {
        if (!redoStack.isEmpty()) {
            // Simpan teks saat ini ke dalam undo stack
            undoStack.push(text.toString());
            // Kembalikan teks ke isi yang lebih baru
            text = new StringBuilder(redoStack.pop());
            System.out.println("Redo dilakukan.");
        } else {
            System.out.println("Tidak ada aksi yang dapat di-redo.");
        }
    }
}
