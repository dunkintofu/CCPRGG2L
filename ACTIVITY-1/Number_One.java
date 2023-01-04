package File;

import java.io.*;

public class Number_One {
    public static void main(String[] args) throws IOException, FileNotFoundException{

        int sum = 0;

        
        try (BufferedReader data = new BufferedReader(new FileReader("C:\\Users\\mkvil\\OneDrive\\Documents\\ACTIVITY 1\\FileHandling\\FileHandling\\src\\data.txt"))) {
            String text;
            while ((text = data.readLine()) != null) {
                System.out.println("The file contains: " + text);
                sum += Integer.parseInt(text);

            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
 

    
        try (PrintWriter pw = new PrintWriter(new FileWriter("sum.txt"))) {
            pw.println("The sum of input file from data.txt is: " + sum);
            System.out.println("The file Sum has been successfully created");

            
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
