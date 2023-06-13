package penilaian;

public class Main {
    public static void main(String[] args) {
        // Membuat objek NilaiAkhir dan mengisikan data
        NilaiAkhir nilaiMahasiswa = new NilaiAkhir("12345", "John Doe", 80, 75, 90);

        // Menampilkan data mahasiswa dan nilai akhir
        System.out.println("Data Mahasiswa:");
        System.out.println("NPM: " + nilaiMahasiswa.getNpm());
        System.out.println("Nama: " + nilaiMahasiswa.getNama());
        System.out.println("Nilai Akhir: " + nilaiMahasiswa.hitungNilaiAkhir());
    }
}