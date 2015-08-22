package Config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigRead {

    public ConfigRead(String data) throws FileNotFoundException, IOException{
        System.out.println(" ConfigRead ");

        BufferedReader br = new BufferedReader(new FileReader(data));
	String line= null;
	while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
	br.close();
    }
}
