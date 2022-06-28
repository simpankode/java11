package File;

import java.io.File;

public class FileInformation {
    
    public static void main(String[] args) {
        
        //file information
        File newFile = new File("/home/prayogaea/Java/File/src/filename.txt");
        if(newFile.exists()) {
            System.out.println("FileName: " + newFile.getName());
            System.out.println("AbsolutePath: " + newFile.getAbsolutePath());
            System.out.println("Writable: " + newFile.canWrite());
            System.out.println("Readable: " + newFile.canRead());
            System.out.println("FileSize: " + newFile.length());
        } else {
            System.out.println("File tidak ada");
        }
    }
}
