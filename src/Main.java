import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        StringBuffer donnees = new StringBuffer();
        
        try{
            fileReader = new FileReader("file.txt");
            System.out.println("File Opened Successfully.");
            char[] buffer = new char[2048];
            int len;
            while ((len = fileReader.read(buffer)) > 0) {
                donnees.append(buffer, 0, len);
            }
            // Date parsing
            new SimpleDateFormat().parse("");


        } catch(IOException | ParseException e){
            // si vous avez une exception de type IOException ou bien une exception qui hérite de la classe IOException
            // ou bien si vous avez, une exception de la classe ParseException ou bien une exception qui hérite de la classe ParseException
            // on fait ce block là
            e.printStackTrace();
        }
        finally {
            try{
                if(fileReader != null ){
                    fileReader.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }

        }
        System.out.println(donnees.toString());
    }
}