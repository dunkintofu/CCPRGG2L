public class Candle {
    String color;
    double height;
    double price;

    public Candle(String color, double height, int price) {
        this.color = color;
        this.height = height;
        this.price = price;
    }

    public String getColor(){
        return this.color;
    }

    public double getHeight(){
        return this.height;
    }

    public double getPrice(){
        return this.price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setHeight(double height){
        this.height = height;
        this.price = height * 2;
    }

}
