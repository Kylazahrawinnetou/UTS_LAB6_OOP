// Mengimpor kelas Scanner dari paket java.util untuk mengambil input dari user
import java.util.Scanner;

// Kelas publik bernama Bentuk
public class Bentuk {

    // Konstruktor - membuat objek Bentuk dengan atribut sisi
    public Bentuk(int sisi) {
        this.sisi = sisi;
    }
    // Konstruktor - membuat objek Bentuk dengan atribut panjang, lebar, dan tinggi
    public Bentuk(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    // Konstruktor
    public Bentuk(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = (int) tinggi;
    }
    // Konstruktor - membuat objek Bentuk dengan atribut jariJari
    public Bentuk(double jariJari) {
        this.jariJari = jariJari;
    }

    // Metode hitung
    public double hitungLuasPermukaanKubus() {
        return 6 * Math.pow(sisi, 2);
    }
    public double hitungLuasPermukaanBalok() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
    public double hitungLuasPermukaanKerucut() {
        return Math.PI * jariJari * (jariJari + Math.sqrt(Math.pow(jariJari, 2) + Math.pow(tinggi, 2)));
    }
    public double hitungLuasPermukaanTabung() {
        return 2 * Math.PI * jariJari * (jariJari + tinggi);
    }
    public double hitungLuasPermukaanBola() {
        return 4 * Math.PI * Math.pow(jariJari, 2);
    }

    // Deklarasi atribut-atribut private untuk menyimpan nilai 
    private int sisi;
    private int panjang;
    private int lebar;
    private int tinggi;
    private double jariJari;
    
// Deklarasi utama
public static void main(String[] args) {
    // Membuat objek scanner untuk inputan dari user
    Scanner scanner = new Scanner(System.in);
    // Inisialisasi dengan nilai "ya", digunakan untuk mengontrol loop berikutnya
    String pilihanLagi = "ya";

    // Loop akan terus berjalan selama pilihanLagi sama dengan "ya"
    while (pilihanLagi.equalsIgnoreCase("ya")) {
        // Meminta user untuk memilih
        System.out.println();
        System.out.print("1. Kubus\t");
        System.out.print("2. Balok\t");
        System.out.print("3. Kerucut\t");
        System.out.print("4. Tabung\t");
        System.out.println("5. Bola");
        System.out.print("Pilih bentuk : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            //Meminta, menghitung dan mencetak luas permukaan kubus
            case 1:
                System.out.println();
                System.out.print("Masukkan sisi kubus : ");
                int sisiKubus = scanner.nextInt();
                Bentuk kubus = new Bentuk(sisiKubus);
                System.out.println();
                System.out.println("Luas permukaan kubus : " + kubus.hitungLuasPermukaanKubus());
                System.out.println();
                break;
            //Meminta, menghitung dan mencetak luas permukaan balok
            case 2:
                System.out.println();
                System.out.print("Masukkan panjang balok : ");
                int panjangBalok = scanner.nextInt();
                System.out.print("Masukkan lebar balok   : ");
                int lebarBalok = scanner.nextInt();
                System.out.print("Masukkan tinggi balok  : ");
                int tinggiBalok = scanner.nextInt();
                Bentuk balok = new Bentuk(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println();
                System.out.println("Luas permukaan balok : " + balok.hitungLuasPermukaanBalok());
                System.out.println();
                break;
            //Meminta, menghitung dan mencetak luas permukaan kerucut
            case 3:
                System.out.println();
                System.out.print("Masukkan jari-jari kerucut : "); 
                double jariJariKerucut = scanner.nextDouble();
                System.out.print("Masukkan tinggi kerucut    : "); 
                double tinggiKerucut = scanner.nextDouble();
                Bentuk kerucut = new Bentuk(jariJariKerucut, tinggiKerucut);
                System.out.println();
                System.out.println("Luas permukaan kerucut : " + kerucut.hitungLuasPermukaanKerucut());
                System.out.println();
                break;
            //Meminta, menghitung dan mencetak luas permukaan tabung
            case 4:
                System.out.println();
                System.out.print("Masukkan jari-jari tabung : ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi tabung    : ");
                double tinggiTabung = scanner.nextDouble();
                Bentuk tabung = new Bentuk(jariJariTabung, tinggiTabung);
                System.out.println();
                System.out.println("Luas permukaan tabung : " + tabung.hitungLuasPermukaanTabung());
                System.out.println();
                break;
            //Meminta, menghitung dan mencetak luas permukaan bola
            case 5:
                System.out.println();
                System.out.print("Masukkan jari-jari bola : ");
                double jariJariBola = scanner.nextDouble();
                Bentuk bola = new Bentuk(jariJariBola);
                System.out.println();
                System.out.println("Luas permukaan bola : " + bola.hitungLuasPermukaanBola());
                System.out.println();
                break;
            // Menangani kasus di mana tidak ada case yang sesuai dengan nilai yang diberikan
            default:
                System.out.println();
                System.out.print("Pilihan tidak tersedia. Apakah anda ingin memilih ulang? (ya/tidak) : ");
                String ulang = scanner.next();
                // equalsIgnoreCase - Membandingkan dua string secara case-insensitive
                if (ulang.equalsIgnoreCase("ya")) {
                    // Kembali ke awal loop untuk memilih ulang
                    continue; 
                // Dijalankan jika kondisi dalam if tidak terpenuhi
                } else {
                    // Digunakan untuk keluar dari loop utama yang lebih besar
                    pilihanLagi = "tidak"; // Mengakhiri loop utama
                }
        }

        // Jika benar, maka pengguna diharapkan ingin menjalankan operasi lagi
        if (pilihanLagi.equalsIgnoreCase("ya")) {
            System.out.print("Apakah anda ingin menghitung lagi? (ya/tidak) : ");
            pilihanLagi = scanner.next();
        }
    }
    System.out.println();
    System.out.println("Baik, senang membantu anda ^^");
}
}

