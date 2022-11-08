public class Dosen extends Karyawan {
    protected int nidn;
    protected String jurusan;

    protected int total;

    public int gajiAwal() {
        return super.gajiAwal();
    }

    public int Totalgaji() {
        return super.gajiAwal();
    }

    public int kelebihanmengajar(int sks) {
        total = 100000 * sks;
        return total;
    }

    public int Totalgaji(int sks){
        return gaji + total;
    }

    public int getNidn() {
        return nidn;
    }

    public void setNidn(int nidn) {
        this.nidn = nidn;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}