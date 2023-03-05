public class DemoCandles {
    
    public static void main(String[] args) {

        Candle candle = new Candle("Brown", 2.5, 6);
        System.out.print("Candle color: " + candle.getColor() + ",");
        System.out.print(" Height: " + candle.getHeight() + ",");
        System.out.print(" price: $" + candle.getPrice() + "\n");
        System.out.println("======================================================================");
        
        candle.setColor("Pink");
        candle.setHeight(4.5);
        System.out.print("Candle color: " + candle.getColor() + ",");
        System.out.print(" Height: " + candle.getHeight() + ",");
        System.out.print(" price: $" + candle.getPrice() + "\n");
        System.out.println("======================================================================");

        ScentedCandle scentedCandle = new ScentedCandle("White", 3.5, 6, "Vanilla");
        System.out.print("Scented candle color: " + scentedCandle.getColor() + ",");
        System.out.print(" Height: " + scentedCandle.getHeight() + ",");
        System.out.print(" price: $" + scentedCandle.getPrice() + ",");
        System.out.print(" scent: " + scentedCandle.getScent() + "\n");
        System.out.println("======================================================================");

        scentedCandle.setColor("Violet");
        scentedCandle.setHeight(4.5);
        scentedCandle.setScent("Lavender");
        System.out.print("Scented candle color: " + scentedCandle.getColor() + ",");
        System.out.print(" Height: " + scentedCandle.getHeight() + ",");
        System.out.print(" price: $" + scentedCandle.getPrice() + ",");
        System.out.print(" scent: " + scentedCandle.getScent() + "\n");
        System.out.println("======================================================================");
    }   
}
