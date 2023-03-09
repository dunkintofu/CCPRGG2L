public abstract class Book {
    String title;
    double price;
    
    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return this.price;
    }

    //abstract method
    public abstract void setPrice();
}
