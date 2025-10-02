public class populasi {
    public static void main (String[] args){
        long pendudukAwal = 312032486L; 

        long waktu = 365 * 24 * 60 * 60; //rumus untuk menghitung total detik dalam setahun
        long totalDetik = waktu * 5;

        long kelahiran = totalDetik / 7;
        long kematian = totalDetik / 13;
        long imigran = totalDetik / 45;

        long proyeksi = pendudukAwal + kelahiran + imigran - kematian;
        System.out.println(proyeksi);

    }
}
