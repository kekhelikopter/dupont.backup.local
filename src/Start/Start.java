package Start;

import App.FileLister;
import static App.FileLister.FileList;
import static App.FileLister.FolderList;
import java.io.IOException;

public class Start {

    public static void main(String[] args) throws IOException {

        System.out.println(" Bonjour ");
        String ROOT = "C:\\temp";
        
        new FileLister(ROOT);
//        new FileZipper();

        System.out.println(" Array ");
        
        int length = FileList.size();
        System.out.println(length);
        System.out.println(FileList.get(5));
        System.out.println(FolderList.get(1));
        
    }
    
}
