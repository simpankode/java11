package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    
    public static void main(String[] args) {
        
        //read
        try {
            File newFile = new File("/home/prayogaea/Java/File/src/filename.txt");
            Scanner newScanner = new Scanner(newFile);
            
            while(newScanner.hasNextLine()) {
                String line = newScanner.nextLine();
                System.out.println(line);
            }
            
            newScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
            e.printStackTrace();
        }
    }
}
