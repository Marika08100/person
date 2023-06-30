import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> lines = FileReader.readFile("person.txt");
        for (String line : lines) {
            String[] lineAsStringArray = line.split(",");
            Person actual =
                    new Person(lineAsStringArray[0],
                            Integer.parseInt(lineAsStringArray[1]),
                            lineAsStringArray[2].equals("férfi") ?
                                    Gender.MALE : Gender.FEMALE);
            personList.add(actual);
        }
        for (Person actual : personList) {
            System.out.println(actual);
        }
    }
}
