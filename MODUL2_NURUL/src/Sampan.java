public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;

    }
    public void Informasi(){
        System.out.println("Trasnportasi Air jenis Sampan dengan kursi berjumlah " + jumlahKursi+" ditetapkan dengan biaya sebesar Rp. " + biaya);

    }
    public void Berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan "+ layar+ " layar");

    }
    public void Berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void Berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan " + jangkar + " jangkar");
    }
    
}
