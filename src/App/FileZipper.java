package App;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

public class FileZipper {

    public FileZipper() throws FileNotFoundException, IOException{
        
        System.out.println(" FileZipper ");
        
        FileOutputStream fos = new FileOutputStream("test.zip");
        ZipOutputStream zos = new ZipOutputStream(fos);

        zos.putNextEntry(null);

        zos.closeEntry();
        fos.close();
        
    }
    
}
