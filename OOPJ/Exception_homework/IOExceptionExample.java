import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt"); 

        try {
            FileReader reader = new FileReader(file); 
            BufferedReader br = new BufferedReader(reader);
            
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
/*Caught an IOException: non_existent_file.txt (The system cannot find the file specified)
Program execution continues...*/