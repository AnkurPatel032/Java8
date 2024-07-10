package FileIOExample;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteExample {


    public static void main(String[] args) throws IOException {
        //using BufferReader
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ankur\\OneDrive\\Desktop\\file.txt"))) {
           String line;
           while ((line= br.readLine())!=null){
               System.out.println(line);
           }
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }

        // Using BufferedWriter
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ankur\\OneDrive\\Desktop\\file.txt"))) {
            bw.write("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Using File class
        File file = new File("C:\\Users\\ankur\\OneDrive\\Desktop\\file.txt");
        if (file.exists()) {
            System.out.println("File exists");
        }

        // Using Files class
        if (Files.exists(Path.of("C:\\Users\\ankur\\OneDrive\\Desktop\\file.txt"))) {
            System.out.println("File exists");
        }
    }
}
