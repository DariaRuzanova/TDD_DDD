import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public TreeMap<String, String> contactList = new TreeMap<>();

    public int add(String name, String phoneNumber) {
        if (!contactList.containsValue(phoneNumber)) {
            contactList.put(name, phoneNumber);
        } else {
            System.out.println("Контакт с таким номером существует в телефонной книге");
        }
        return contactList.size();
    }

    public String findByNumber(String phoneNumber) {
        String name = "";
        for (String k : contactList.keySet()) {
            if (contactList.get(k).equals(phoneNumber)) {
                name = k;
                break;
            }
        }
        return name;
    }

    public String findByName(String name) {
        return null;
    }
}
