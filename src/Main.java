import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fileReader != null ){
                fileReader.close();
            }

        }
        System.out.println(donnees.toString());
    }
}