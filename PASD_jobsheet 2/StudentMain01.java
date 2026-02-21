public class StudentMain01 {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Muhajir", "12345", 4.00, "SIB 1G");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa mhs3 = new Mahasiswa("Yoga", "123456", 4.00, "SIB 1G");
        mhs3.tampilkanInformasi();
    }
}