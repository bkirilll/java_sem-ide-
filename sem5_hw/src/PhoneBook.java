import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class PhoneBook {

    private Map<String, ArrayList<Integer>> book = new HashMap<>();

    void add(String lastName, int value) {
        ArrayList<Integer> num = new ArrayList<>();
        if (book.containsKey(lastName)) {
            book.get(lastName).add(value);
        } else {
            num.add(value);
            book.put(lastName, num);
        }
    }

    String getByLastName(String lastName) {
        return lastName + ": " + book.get(lastName);
    }

    String getAllList() {
        return book.toString();
    }

}
