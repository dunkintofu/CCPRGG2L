public class DemoPhoneCalls {
    public static void main(String[] args) {
        IncomingPhoneCall in = new IncomingPhoneCall("09454764324");
        in.getDisplayInformation();

        OutgoingPhoneCall out = new OutgoingPhoneCall("09568442594", 0, 3);
        out.getDisplayInformation();
    }
}
