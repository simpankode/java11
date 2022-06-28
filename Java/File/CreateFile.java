package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    
    public static void main(String[] args) {
        
        //create
        try {
            File newFile = new File("/home/prayogaea/Java/File/src/filename.txt");

            if(newFile.createNewFile()) {
                System.out.println("File berhasil dibuat " + newFile.getName());
            } else {
                System.out.println("File sudah ada");
            }
        } catch (IOException e) {
            System.out.println("File gagal dibuat");
            e.printStackTrace();
        }

        //writer
        try {
            
            FileWriter newFileWriter = new FileWriter("/home/prayogaea/Java/File/src/filenameWriter.txt");
            newFileWriter.write("Ini adalah file baru");
            newFileWriter.close();
            System.out.println("File berhasil dibuat");

        } catch (Exception e) {
            System.out.println("File gagal dibuat");
            e.printStackTrace();
        }
    }
}
