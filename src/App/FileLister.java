package App;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public final class FileLister {
  
    public FileLister(String ROOT) throws IOException{
    FileVisitor<Path> fileProcessor = new ProcessFile();
    Files.walkFileTree(Paths.get(ROOT), fileProcessor);
  }

    public static ArrayList<String> FileList = new ArrayList<String>();
    public static ArrayList<String> FolderList = new ArrayList<String>();    
    public int n = 0;
    
    private static final class ProcessFile extends SimpleFileVisitor<Path> {
    @Override public FileVisitResult visitFile(
    Path aFile, BasicFileAttributes aAttrs
    ) throws IOException {
//        System.out.println("Processing file:" + aFile);
        FileList.add(aFile.toString());
        return FileVisitResult.CONTINUE;
    }
    
    @Override  public FileVisitResult preVisitDirectory(
    Path aDir, BasicFileAttributes aAttrs
    ) throws IOException {
        FolderList.add(aDir.toString());
//        System.out.println("Processing directory:" + aDir);
    return FileVisitResult.CONTINUE;
    }
  }
} 
