package fr.esiea.tools.singleton;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OutputChecker {
    public static void displayOutputFromFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("log.txt"));
            String line = bufferedReader.readLine();
            String lastLine = line;
            while (line != null) {
                lastLine = line;
                 // read next line
                line = bufferedReader.readLine();
            }
            System.out.println(lastLine);
            bufferedReader.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
