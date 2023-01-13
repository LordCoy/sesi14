import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 class File_notFound {
 
    public static void main(String args[])  {
        try {
 
            // Following file does not exist
            File file = new File("E://Tugas_Makalah.txt");
 
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
           System.out.println("File tidak ditemukan!");
        }
    }
}