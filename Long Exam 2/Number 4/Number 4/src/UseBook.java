public class UseBook {
    public static void main(String[] args) {

        Fiction fiction = new Fiction("Norse Mythology");
        System.out.print("Book title: " + fiction.getTitle());
        System.out.print(", Price: Php " + fiction.getPrice() + "\n");
        System.out.println("================================================");

        NonFiction nonFiction = new NonFiction("Anne Frank");
        System.out.print("Book title: " + nonFiction.getTitle());
        System.out.print(", Price: Php " + nonFiction.getPrice());
    }
}
