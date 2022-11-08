public class Main {
    public static void main(String[] args) {
        System.out.println("Nama    : Muhammad Yusuf Dwi Hasta Yuda");
        System.out.println("NIM     : 2100018217");
        System.out.println("Kelas   : D");
        System.out.println("UTS PBO");
        System.out.println("\n");

        Tendik staff = new Tendik();
        staff.setNama("Danar Kusuma");
        staff.setNip(12345678);
        staff.setTgl_lahir("10 Februari 1975");
        staff.setAlamat("Yogyakarta");
        staff.setJenis_kelamin("Laki-Laki");
        staff.setTahun_masuk(2010);

        System.out.println("============ Tendik =============");
        System.out.println("Nama Tendik         : "+ staff.getNama());
        System.out.println("NIP  Tendik         : "+ staff.getNip());
        System.out.println("Tanggal Lahir       : "+ staff.getTgl_lahir());
        System.out.println("Jenis Kelamin       : "+ staff.getJenis_kelamin());
        System.out.println("Alamat              : "+ staff.getAlamat());
        System.out.println("Tahun masuk         : "+ staff.getTahun_masuk());
        System.out.println("Gaji pokok          : "+staff.Totalgaji());
        System.out.println("Upah lembur(20 jam) : "+ staff.jamlembur(20));
        System.out.println("Gaji total          : "+ staff.Totalgaji(20));


        Dosen dos = new Dosen();
        dos.setJurusan("Informatika");
        dos.setNidn(20112013);
        dos.setNama("Adi WIjaya S.Kom");
        dos.setNip(2072210772);
        dos.setTgl_lahir("12 Mei 1972");
        dos.setJenis_kelamin("Laki-Laki");
        dos.setAlamat("Jakarta");
        dos.setTahun_masuk(2014);

        System.out.println("\n");
        System.out.println("============= Dosen =============");
        System.out.println("Nama Dosen          : "+ dos.getNama());
        System.out.println("NIDN                : "+dos.getNidn());
        System.out.println("Jurusan             : "+ dos.getJurusan());
        System.out.println("NIP  Dosen          : "+ dos.getNip());
        System.out.println("Tanggal Lahir       : "+ dos.getTgl_lahir());
        System.out.println("Jenis Kelamin       : "+ dos.getJenis_kelamin());
        System.out.println("Alamat              : "+ dos.getAlamat());
        System.out.println("Tahun masuk         : "+ dos.getTahun_masuk());
        System.out.println("Gaji pokok          : "+ dos.Totalgaji());
        System.out.println("Kelas lebih (6 SKS) : "+ dos.kelebihanmengajar(6));
        System.out.println("Gaji total          : "+ dos.Totalgaji(6));
    }
}