import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.readFile("res/vegyes.txt");
        List<Person> personList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Being>  beings = new ArrayList<>();
        for(String line : lines){
            String[] linesAsStringArray = line.split("-");
            switch (linesAsStringArray[0]){
                case "Dog" -> {
                    beings.add(makeDogFromLine(line, "-"));
                }
                case "Person" -> {
                    beings.add(makePersonFromLine(line,"-"));
                }

            }
            for(var actual : beings){
                System.out.println(actual);
            }


        }
        /**
         *   List<Person> personList = new ArrayList<>();
         *         List<String> lines = FileReader.readFile("res/person.txt");
         *         for (String line : lines) {
         *             personList.add(makePersonFromLine(line, ","));
         *         }
         *         for (Person actual : personList) {
         *             System.out.println(actual);
         *         }
         *
         *
         *         List<Dog> dogs = new ArrayList<>();
         *         List<String> list = FileReader.readFile("res/dog.txt");
         *         for (String line : list) {
         *             dogs.add(makeDogFromLine(line, "#@#"));
         *         }
         *         for (Dog actual : dogs) {
         *             System.out.println(actual);
         *         }
         */

    }
    static Person makePersonFromLine(String file, String regex) {
        String[] lineAsStringArray = file.split(regex);

        return new Person(lineAsStringArray[1],
                Integer.parseInt(lineAsStringArray[2]),
                lineAsStringArray[3].equals("férfi") ?
                        Gender.MALE : Gender.FEMALE);
    }

    static Dog makeDogFromLine(String file, String regex) {
        String[] lineAsStringArray = file.split(regex);
        return new Dog(lineAsStringArray[1],
                Integer.parseInt(lineAsStringArray[2]),
                lineAsStringArray[3]);

    }
}

