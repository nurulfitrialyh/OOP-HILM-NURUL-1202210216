public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir transportasi = new TransportasiAir(4, 20000);
        transportasi.Informasi();
        transportasi.Berlayar();
        transportasi.Berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(20, 50000, 2);
        sampan1.Informasi();
        sampan1.Berlayar();
        sampan1.Berlabuh();
        sampan1.Berlabuh(2);
        System.out.println("");

        Kapal kapal1 = new Kapal(50, 100000, "Diesel");
        kapal1.Informasi();
        kapal1.Berlayar();
        kapal1.Berlayar(20);
        kapal1.Berlabuh();
    }

}
