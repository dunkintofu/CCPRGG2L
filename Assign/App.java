//Aseron, Cadiz, Marfal, Sumayao, Villena
public class App {
    public static void main(String[] args) {

        // Character Class
        Gun classic = new Gun(12, "Classic", 6.75 );
        classic.sayGunName();
        classic.sayMagazineCapacity();
        classic.sayFireRate();

        Gun phantom = new Gun(30, "Phantom", 5.4);
        phantom.sayGunName();
        phantom.sayMagazineCapacity();
        phantom.sayFireRate();

        Gun operator = new Gun(5, "Operator", 0.6);
        operator.sayGunName();
        operator.sayMagazineCapacity();
        operator.sayFireRate();

    }
}
