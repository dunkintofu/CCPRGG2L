import java.io.*;


    public class FileRead 
    {
    public static void main(String [] args) throws IOException
    {
        
        String fileName = "C:\\Users\\mkvil\\OneDrive\\Documents\\ACTIVITY 1\\FileHandling\\FileHandling\\src\\dummy.txt";

        String line = null;

            BufferedReader bufferedReader = 
                new BufferedReader(new FileReader(fileName));

            int i = 0;
            try {
                
                while(((line = bufferedReader.readLine()) != null) && i < 5) {
                    System.out.println(line);
                    i++;
                }   
            }
            finally {   
                bufferedReader.close();         
            }

        }
    }
