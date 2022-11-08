public class Tendik extends Karyawan{
    protected int total;

    public int gajiAwal() {
        return super.gajiAwal();
    }

    public int Totalgaji(){
        return super.gajiAwal();
    }

    public int jamlembur(int jam){
        total = 50000 * jam;
        return  total;
    }

    public int Totalgaji(int sks){
        return gaji + total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
