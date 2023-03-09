public class IncomingPhoneCall extends PhoneCall {

    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        setPrice(price);
    }

    public void setPrice(double price){
        this.price = 0.02;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void getDisplayInformation() {
        System.out.println("Incoming call from Phone number: " + phoneNumber + "," + " Rate and Price: $" + price);
    }

    
}
