public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Adata", 2, 1.8);
        perangkat1.Informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Seagate", 8, 2.4, true);
        laptop1.Informasi();
        laptop1.BukaGame("Dota 2");
        laptop1.KirimEmail("nurulfitri@gmail.com");
        laptop1.KirimEmail("larasati@gmail.com", "fathimah@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20, false);
        handphone1.Informasi();
        handphone1.Telfon(628123363);
        handphone1.KrimSMS(628278679);
        handphone1.KirimSMS(628267938, 628623947);

    }
}
