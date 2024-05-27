//Mengakses fungsi input dari user
import java.util.Scanner; 

// Mendefinisikan objek aksesoris
class Aksesoris { 

    // Deklarasi Atribut
    private String nama;
    private String jenis;
    private double harga;
    private int stok;
    private String deskripsi;

    // Constructor tanpa parameter
    public Aksesoris() {
        // Inisialisasi atribut objek dengan nilai default
        this("", "", 0, 0, "");
    }

    // Constructor dengan parameter
    public Aksesoris(String nama, String jenis, double harga, int stok) {
        // Inisialisasi atribut objek dengan nilai yang diberikan
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = "";
    }

    // Constructor dengan parameter tambahan
    public Aksesoris(String nama, String jenis, double harga, int stok, String deskripsi) {
        // inisialisasi atribut objek dengan nilai yang diberikan dan deskripsi
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
    }

    // Setter yang mengatur nilai setiap atribut
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Getter yang mengembalikan nilai setiap atribut
    public String getNama() {
        return nama;
    }
    public String getJenis() {
        return jenis;
    }
    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public String getDeskripsi() {
        return deskripsi;
    }

    // Method yang menampilkan informasi aksesoris dengan atribut 
    public void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Method yang menampilkan informasi aksesoris dengan atribut dan deskripsi
    public void tampilkanInformasi(String deskripsi) {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Deskripsi: " + deskripsi);
    }

    // Method untuk menjual aksesoris dengan jumlah yang diberikan
    public void jualAksesoris(int jumlah) {
        // Kalau jumlah melebihi stok, maka akan menampilkan pesan dibawah ini
        if (jumlah > stok) {
            System.out.println("Stok aksesoris tidak mencukupi.");
        } else {
            stok -= jumlah;
            System.out.println("Aksesoris " + nama + " terjual sebanyak " + jumlah + " buah.");
            System.out.println("Stok aksesoris " + nama + " tersisa: " + stok);
        }
    }

    // Method Overloading untuk menampilkan informasi aksesoris dengan atribut, deskripsi dan jumlah (parameter tambahan)
    public void tampilkanInformasi(String deskripsi, int jumlah) {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Jumlah: " + jumlah);
    }

    // Method Overriding untuk menampilkan informasi aksesoris dengan nama yang sama
    public void tampilkanInformasi(String nama, String jenis, double harga, int stok) {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }
}

// Deklarasi sebagai class utama dalam program
public class Main {

    // Deklarasi method main sebagai method utama untuk program
    public static void main(String[] args) {
        try (// Deklarasi objek scanner yang meminta masukan dari user
        Scanner scanner = new Scanner(System.in)) {
            // Meminta masukan nama, jenis, harga, dan stok aksesoris dari user
            System.out.print("Masukkan nama aksesoris: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan jenis aksesoris: ");
            String jenis = scanner.nextLine();
            System.out.print("Masukkan harga aksesoris: ");
            double harga = scanner.nextDouble();
            System.out.print("Masukkan stok aksesoris: ");
            // Meminta masukan stok aksesoris dari user dan menyimpannya dalam variabel stok
            int stok = scanner.nextInt();

            // Membuat object Aksesoris dengan parameter nama, jenis, harga dan stok
            Aksesoris aksesoris = new Aksesoris(nama, jenis, harga, stok);

            // Menampilkan informasi aksesoris
            aksesoris.tampilkanInformasi();

            // Meminta masukan jumlah aksesoris yang ingin dijual dari user
            System.out.print("Masukkan jumlah aksesoris yang ingin dijual: ");
            // meminta masukan jumlah aksesoris yang ingin dijual dari user dan menyimpannya dalam variabel jumlah
            int jumlah = scanner.nextInt();

            // Menjual aksesoris dengan jumlah yang diberikan
            aksesoris.jualAksesoris(jumlah);

            // Meminta masukan apakah user ingin menambahkan aksesoris baru
            System.out.print("Apakah Anda ingin menambahkan aksesoris baru? (ya/tidak): ");
            //// Mengambil input dari user dan menyimpannya dalam variabel jawaban
            String jawaban = scanner.next().toLowerCase();
            // // Mengambil input dari user dan menyimpannya dalam variabel scanner.nextLine();
            scanner.nextLine();

            // Perintah pengulangan yang dijalankan selama jawaban user adalah "ya"
            while (jawaban.equals("ya")) {
                // Meminta masukan nama, jenis, harga dan stok aksesoris baru dari user
                System.out.print("Masukkan nama aksesoris baru: ");
                nama = scanner.nextLine();
                System.out.print("Masukkan jenis aksesoris baru: ");
                jenis = scanner.nextLine();
                System.out.print("Masukkan harga aksesoris baru: ");
                harga = scanner.nextDouble();
                System.out.print("Masukkan stok aksesoris baru: ");
                // Mengambil input dari user dan menyimpannya dalam variabel stok
                stok = scanner.nextInt();

                // Membuat object Aksesoris baru
                Aksesoris aksesorisBaru = new Aksesoris(nama, jenis, harga, stok);

                // Menampilkan informasi aksesoris baru
                aksesorisBaru.tampilkanInformasi();

                // Meminta masukan apakah user ingin menambahkan aksesoris baru lagi
                System.out.print("Apakah Anda ingin menambahkan aksesoris baru lagi? (ya/tidak): ");
                // Mengambil input dari user dan menyimpannya dalam variabel jawaban
                jawaban = scanner.next().toLowerCase();
                // Mengambil input dari user dan menyimpannya dalam variabel scanner.nextLine();
                scanner.nextLine();
            }
        }

        //Menampilkan pesan
        System.out.println("Okay, semangat untuk hari ini!");
    }
}

////////// PENJELASAN NARATIF //////////
/*
    Cara kerja program ini adalah membuat objek "Aksesoris" yang memiliki atribut nama, jenis, harga, stok, dan deskripsi. 
    Objek ini dibuat menggunakan konstruktor dengan parameter untuk menginisialisasi atribut objek. 
    Kemudian, program meminta user memberikan informasi untuk jenis, nama, harga, stok, dan jumlah aksesoris yang ingin dijual. 
    Program menampilkan semua informasi yang dimasukkan dan yang telah dijual. 
    Selain itu, program akan bertanya kepada user apakah mereka ingin menambahkan aksesoris baru atau tidak. 
    Jika iya, program akan meminta nama, jenis, harga, dan ketersediaan aksesoris baru. 
    Program ini juga menggunakan Class, Object, Konstruktor, Metode Overloading, Metode Overriding, Setter, dan Getter untuk mengatur dan mengembalikan nilai atribut objek.
*/

////////// PENJELASAN LEBIH LANJUT //////////
/*
    Class ’Aksesoris’ untuk mendefinisikan objek aksesoris yang memiliki atribut nama, jenis, harga, stok, dan deskripsi, serta metode untuk mengatur dan mengembalikan nilai atribut tersebut. 
    Object ‘Aksesoris’ dibuat menggunakan konstruktor dengan parameter untuk menginisialisasi atribut objek. 
    Object ’Aksesoris’ digunakan untuk mewakili suatu aksesoris yang memiliki atribut dan metode yang telah didefinisikan dalam class ’Aksesoris’. 
    Constructor Aksesoris() untuk menginisialisasi atribut objek dengan nilai default, Aksesoris(String nama, String jenis, double harga, int stok) untuk menginisialisasi atribut objek dengan nilai yang diberikan dan 
    Aksesoris(String nama, String jenis, double harga, int stok, String deskripsi) untuk menginisialisasi atribut objek dengan nilai yang diberikan dan deskripsi. 
    Method Overloading, tampilkanInformasi(String deskripsi, int jumlah) untuk menampilkan informasi aksesoris dengan parameter tambahan dan 
    tampilkanInformasi(String nama, String jenis, double harga, int stok) untuk menampilkan informasi aksesoris dengan nama yang sama. 
    Method Overriding, tampilkanInformasi(String nama, String jenis, double harga, int stok) untuk menampilkan informasi aksesoris dengan nama yang sama. 
    Method Setter, setNama(String nama), setJenis(String jenis), setHarga(double harga), setStok(int stok), setDeskripsi(String deskripsi) untuk mengatur nilai atribut sedangkan 
    Method Getter, getNama(), getJenis(), getHarga(), getStok(), getDeskripsi() untuk mengembalikan nilai atribut. 
    Dengan menggunakan Class, Object, Constructor, Method Overloading, Method Overriding, Setter, dan Getter, kita dapat membuat program yang lebih efektif dan efisien dalam mengatur dan mengembalikan nilai atribut objek.
 */