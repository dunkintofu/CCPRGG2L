public class Gun {
    // Character attributes
    int MagazineCapacity;
    String name;
    double FireRate;

    // Guns method
    public void sayGunName() {
        System.out.println("Valorant gun:" + name);
    }

    public void sayMagazineCapacity() {
        System.out.println("Magazine capacity:" + MagazineCapacity);
    }

    public void sayFireRate() {
        System.out.println("Fire rate:" + FireRate);
    }

    // Constructor
    public Gun(int mgc, String gunName, double dfr ) {
        MagazineCapacity = mgc;
        name = gunName;
        FireRate = dfr;
    }
}
