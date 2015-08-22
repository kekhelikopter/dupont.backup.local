package Config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ConfigRead {
    
    public ConfigRead(String data) throws FileNotFoundException, IOException{
        System.out.println(" ConfigRead ");
        BufferedReader br = new BufferedReader(new FileReader(data));
        ArrayList<String> list = new ArrayList<String>();
        String line= null;
	while ((line = br.readLine()) != null) {
            System.out.println(line);
            list.add(line);
        }
	br.close();
    }
}