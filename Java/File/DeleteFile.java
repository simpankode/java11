package File;

import java.io.File;

public class DeleteFile {
    
    public static void main(String[] args) {
        
        //delete
        File newFile = new File("/home/prayogaea/Java/File/src/filename.txt");
        if(newFile.exists()) {
            newFile.delete();
            System.out.println("File berhasil dihapus " + newFile.getName());
        } else {
            System.out.println("File gagal dihapus");
        }
    }
}
