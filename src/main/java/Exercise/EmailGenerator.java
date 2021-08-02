package Exercise;

import java.util.ArrayList;
import java.util.List;

public class EmailGenerator {
    public static List<String> write(List<Person> people) {

        List<String> emails = new ArrayList<>();
        for (int i = 0; i < people.size(); i++) {


            String salutation;
            if ('K' == Buffer.people.get(i).getSex()) {
                salutation = "Szanowna Pani ";
            } else {
                salutation = "Szanowny Panie ";
            }
            String line = salutation + Buffer.people.get(i).getFullName() + "\n" +
                    "email:" + Buffer.people.get(i).getEmail() + "\n" +
                    " \n" +
                    "Powiadomienie\n" +
                    "Prosimy o uregulowanie zaległej kwoty w wysokości " + Buffer.people.get(i).getDebt() + " PLN z \n" +
                    "dnia " + Buffer.people.get(i).getDate() + ".";

            System.out.println(line);
            emails.add(line);
        }
        return emails;
    }
}
