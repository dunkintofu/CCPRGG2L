public class ScentedCandle extends Candle {
    String scent;

    public ScentedCandle(String color, double height, int price, String scent) {
        super(color, height, price);
        this.scent = scent;
    }

    public String getScent(){
        return this.scent;
    }

    public void setScent(String scent){
        this.scent = scent;
    }

    public void setHeight(double height){
        super.setHeight(height);
        this.price = height * 3;
    }
    

}
