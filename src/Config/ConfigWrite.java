package Config;

import java.io.FileWriter;
import java.io.IOException;

public class ConfigWrite {

    public ConfigWrite(String msg) throws IOException{
        
        System.out.println(" ConfigWrite ");
        
        FileWriter fw = new FileWriter("config.cfg", true);
        fw.write(msg + System.lineSeparator());
        fw.close();
        
    }
    
}
