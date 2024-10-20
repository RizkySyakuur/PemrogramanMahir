package TextEditor;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Menulis teks
        editor.write("Hello, ");
        editor.write("world!");

        // Menampilkan teks
        editor.show(); // Output: Teks saat ini: Hello, world!

        // Melakukan undo
        editor.undo();
        editor.show(); // Output: Teks saat ini: Hello,

        // Melakukan redo
        editor.redo();
        editor.show(); // Output: Teks saat ini: Hello, world!

        // Melakukan undo lagi
        editor.undo();
        editor.show(); // Output: Teks saat ini: Hello,

        // Melakukan undo lagi
        editor.undo();
        editor.show(); // Output: Teks saat ini:

        // Mencoba undo saat tidak ada aksi
        editor.undo(); // Output: Tidak ada aksi yang dapat di-undo.

        // Melakukan redo
        editor.redo();
        editor.show(); // Output: Teks saat ini: Hello,
    }
}
