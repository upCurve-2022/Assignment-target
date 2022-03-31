import java.io.File;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args) {
        File f=new File("prashanthi"); //file object initialized
        try{
            boolean result=f.createNewFile();
            if (result)
                System.out.println("file created "+f.getCanonicalPath());
            else
                System.out.println("file already exists at "+f.getCanonicalPath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
