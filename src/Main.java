import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> lines = FileReader.readFile("person.txt");
        for(String line : lines){
            String[] parts = line.split(",");
        }
    }
}
