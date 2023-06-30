import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    public static List<String> readFile(String filePath) {
        List<String> stringList = new ArrayList<>();
        File file = new File(filePath);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                stringList.add(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nem talalhato file");
        }

        return stringList;
    }
}




