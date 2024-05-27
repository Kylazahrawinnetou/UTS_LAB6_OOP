// Kelas publik bernama TestMain
public class TestMain {

    public static void main(String[] args) {
        // Menguji konstruktor dan toString()
        Employee e1 = new Employee(8, "Xavier", "Valave", 2500);
        // Memanggil metode toString() untuk objek e1
        System.out.println(e1); 

        // Menguji Setter dan Getter
        // Mengatur gaji e1 menjadi 999
        e1.setSalary(999); 
        // Memanggil metode toString() untuk objek e1 setelah perubahan
        System.out.println(e1); 
        // Mencetak ID dari objek e1
        System.out.println("id is: " + e1.getID());
        // Mencetak nama depan dari objek e1
        System.out.println("firstname is: " + e1.getFirstName());
        // Mencetak nama belakang dari objek e1
        System.out.println("lastname is: " + e1.getLastName());
        // Mencetak gaji dari objek e1
        System.out.println("salary is: " + e1.getSalary());
        // Mencetak nama lengkap dari objek e1
        System.out.println("name is: " + e1.getName());
        // Mencetak gaji tahunan dari objek e1
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

        // Menguji raiseSalary()
        // Memanggil metode raiseSalary() untuk menaikkan gaji e1 sebesar 10%, lalu mencetak gaji baru
        System.out.println(e1.raiseSalary(10)); 
        // Memanggil metode toString() untuk objek e1 setelah peningkatan gaji
        System.out.println(e1); 
    }
}