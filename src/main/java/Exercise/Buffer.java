package Exercise;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Buffer {
    static BufferedWriter bufferedWriter;
    public static ArrayList<Person> people;

    static List<Person> readFile() {
        people = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Dluznicy.txt"));
            String line;
            while (null != (line = bufferedReader.readLine())) {
                System.out.println(line);
                String[] value = line.split("\t");
                char sex = value[2].charAt(0);
                double debt = Double.parseDouble(value[3]);
                LocalDate date = LocalDate.parse(value[4]);
                people.add(new Person(value[0], value[1], sex, debt, date));
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Proces wczytywania zakończony");
        return people;
    }

    public static void saveFile(List<String> emails) {
        int i =0;
        try {
            for (String email : emails){
            bufferedWriter = new BufferedWriter(new FileWriter(people.get(i).getEmail() + ".txt"));
            bufferedWriter.write(email);
            bufferedWriter.close();
            i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Proces zapisywania zakończony");
    }
}
