public class BookArray {
    public static void main(String[] args) {
        String[] books = {"Book Lovers","Harry Potter","Maze Runner","Divergent","Hunger Games",
                         "To Write as if Already Dead","Diary of a Young Naturalist","Democracy Rules",
                        "The Joy of Sweat: The Strange Science of Perspiration","Pessoa: A Biography"};

        for(int i = 0; i < books.length; i++){
            if(i <= 4){
                System.out.println(books[i] + " - Fiction," + " Price: Php249.90");
            }
            else if(i <= 9 && i > 4){
                System.out.println(books[i] + " - NonFiction" + " Price: Php379.95");
            }
        }
    }
}
    

