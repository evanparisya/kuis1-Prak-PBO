public class DemoHP {
    public static void main(String[] args) {
        Handphone hp1 = new Handphone("H6222IJKL", "Infinix X665B", "Android 11");

        System.out.println("\nKondisi Awal : ");
        hp1.info();

        System.out.println("\nNyalakan HandPhone : ");
        hp1.power();
        hp1.info();

        System.out.println("\nTambahkan Volume : ");
        for (int i = 0; i < 105; i++) {
            hp1.tambahVolume();
        }
        hp1.info();

        System.out.println("\nKurangi Volume : ");
        for (int i = 0; i < 105; i++) {
            hp1.kurangVolume();
        }
        hp1.info();

        System.out.println("\nMute Handphone : ");
        hp1.mute();
        hp1.info();

        System.out.println("\nMatikan Handphone : ");
        hp1.power();
        hp1.info();

        System.out.println("\nPercobaan no. 6 :");
        hp1.power(); 
        for (int i = 0; i < 50; i++) {
            hp1.tambahVolume(); 
        }
        System.out.println("Sebelum mute:");
        hp1.info();

        hp1.mute();
        System.out.println("Setelah mute:");
        hp1.info();

        System.out.println("\nPercobaan no. 7 : ");
        hp1.mute();
        System.out.println("Setelah mute : ");
        hp1.info();

        hp1.unmute();
        System.out.println("Setelah unmute : ");
        hp1.info();
    }
}
