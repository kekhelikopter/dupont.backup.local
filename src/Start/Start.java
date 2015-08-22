package Start;

import App.FileLister;
import App.FileZipper;
import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        System.out.println(" Bonjour ");
        String ROOT = "C:\\temp";
        
        new FileLister(ROOT);
        new FileZipper();
        
        
    }
    
}
