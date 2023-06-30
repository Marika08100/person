import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public static List<String> readFile(String filePath){
        List<String> stringList = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
            for (String line; (line = reader.readLine()) != null; ) {
                stringList.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error: wrong path!\n" + e.getMessage());
        }
        return stringList;
    }
}




