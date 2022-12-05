public class Kapal extends TransportasiAir{
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;

    }
    public void Informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah "+ jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);

    }
    public void Berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin +" dengan kecepatan yang tidak stabil");
    }
    public void Berlayar(int kecepatan){
        System.out.println ("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin" + mesin +" dengan kecepatan stabil di kisaran " + kecepatan + " knot");
    }
    public void Berlabuh(){
        System.out.println("Transportasi Air jenis Kapal berlabuh di pantai");
    }

    
}
