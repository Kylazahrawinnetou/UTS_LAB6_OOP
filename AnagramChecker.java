// Import kelas Arrays, HashSet dan Scanner dari package java.util
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

// Kelas publik bernama AnagramChecker
public class AnagramChecker {

    // Metode utama (entry point)
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari user
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari user untuk kata pertama
        System.out.print("Masukkan kata pertama : ");
        String kata1 = scanner.next();

        // Meminta input dari user untuk kata kedua
        System.out.print("Masukkan kata kedua   : ");
        String kata2 = scanner.next();

        // Memeriksa dua kata tersebut adalah anagram atau bukan
        if (isAnagram(kata1, kata2)) {
            // Kalau anagram, maka ditampilkan pesan
            System.out.println("Dua kata tsb adalah anagram.");
        } else {
            // Kalau bukan anagram, maka ditampilkan pesan 
            System.out.println("Dua kata tsb bukan anagram.");
        }
    }

    // Fungsi yang memeriksa apakah dua kata adalah anagram
    public static boolean isAnagram(String kata1, String kata2) {
        // Memeriksa sama atau tidaknya panjang kata pertama dan kata kedua
        if (kata1.length() != kata2.length()) {
            // Kalau panjang kata pertama tidak sama dengan panjang kata kedua, maka return false
            return false;
        }

        // Membuat array dari huruf-huruf dalam kata pertama
        String[] kata1Array = kata1.toLowerCase().split("");

        // Membuat array dari huruf-huruf dalam kata kedua
        String[] kata2Array = kata2.toLowerCase().split("");

        // Membuat set dari huruf-huruf dalam kata kedua
        HashSet<String> kata2Set = new HashSet<>();
        kata2Set.addAll(Arrays.asList(kata2Array));

        // Iterasi melalui array huruf-huruf dalam kata pertama
        for (String huruf : kata1Array) {
            // Memeriksa apakah huruf tersebut ada dalam set huruf-huruf dalam kata kedua
            if (!kata2Set.contains(huruf)) {
                // Kalau huruf tersebut tidak ada dalam set huruf-huruf dalam kata kedua, maka return false
                return false;
            }
        }

        // Jika huruf tersebut ada dalam set huruf-huruf dalam kata kedua, maka return true
        return true;
    }
}