import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = null;
        StringBuffer donnees = new StringBuffer();
        
        try{
            fileReader = new FileReader("file.txft");
            System.out.println("File Opened Successfully.");
            char[] buffer = new char[2048];
            int len;
            while ((len = fileReader.read(buffer)) > 0) {
                donnees.append(buffer, 0, len);
            }
        } catch(FileNotFoundException e){
            System.out.println("Le fichier est introuvable.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Impossible de lire le fichier.");
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