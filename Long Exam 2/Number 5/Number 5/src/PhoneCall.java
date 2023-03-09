public abstract class PhoneCall {
    String phoneNumber;
    double price;

    public PhoneCall(String phoneNumber){
        this.phoneNumber = phoneNumber;
        this.price = 0.0;
    }

    public void setPrice(double price){
        this.price = price;
    }

    //three abstract get methods
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getDisplayInformation();
}
