public class OutgoingPhoneCall extends PhoneCall {
    int time;

    public OutgoingPhoneCall(String phoneNumber, double price, int time) {
        super(phoneNumber);
        this.time = time;
        setPrice(price);
    }

    public void setPrice(double price){
        this.price = 4.00 * time;
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
       System.out.println("Outgoing call to Phone number: " + phoneNumber + "," + " The rate per minute is: 4.00 " +  "," + " The number of minutes is: " + time + " Total price: $" + price);
    }
}
