import java.io.*;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        File file = new File("non_existent_file.txt"); 

        try {
            FileReader reader = new FileReader(file); 
            System.out.println("File opened successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("Caught a FileNotFoundException: " + e.getMessage());
        }

        System.out.println("Program execution continues...");
    }
}
/*PS F:\CDAC_FEB2025\OOPJ\Exception_homework> javac FileNotFoundExceptionExampl.java
error: file not found: FileNotFoundExceptionExampl.java
Usage: javac <options> <source files>
use --help for a list of possible options*/