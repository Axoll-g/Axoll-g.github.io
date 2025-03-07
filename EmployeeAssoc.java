class Perusahaan {
    private final String namaPerusahaan;
    
    public Perusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
}

class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;
    
    public Karyawan(String nama, int gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }
    
    public void setNama(String nama) {
        if (nama.length() >= 4) {
            this.nama = nama;
        } else {
            throw new IllegalArgumentException("Nama harus memiliki minimal 4 karakter.");
        }
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }
    
    public void info() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp. " + gajiPokok);
        System.out.println("Perusahaan: " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
}

public class EmployeeAssoc{
    public static void main(String[] args) {
        Perusahaan ptInovasi = new Perusahaan("PT. Inovasi Teknologi");
        Perusahaan ptTeknologi = new Perusahaan("PT. Teknologi Jaya");
        
        Karyawan karyawan1 = new Karyawan("Xolotl", 5000000, ptInovasi);
        Karyawan karyawan2 = new Karyawan("Arthamma", 6000000, ptInovasi);
        Karyawan karyawan3 = new Karyawan("Iman", 7000000, ptTeknologi);
        
        karyawan1.info();
        karyawan2.info();
        karyawan3.info();
    }
}
